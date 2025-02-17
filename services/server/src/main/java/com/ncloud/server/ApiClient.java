/*
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.activation.MimetypesFileTypeMap;

import com.ncloud.server.auth.Credentials;
import com.ncloud.server.exception.ApiException;
import com.ncloud.server.exception.SdkException;
import com.ncloud.server.marshaller.FormMarshaller;
import com.ncloud.server.marshaller.Marshaller;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.HttpMethod;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * The type Api client.
 */
public class ApiClient {
	private final String SDK_VERSION = "1.1";
	private final OkHttpClient httpClient;
	private final Set<Marshaller> marshallerSet;
	private final Credentials credentials;

	private ApiClient(OkHttpClient httpClient, Set<Marshaller> marshallerSet, Credentials credentials) {
		if (marshallerSet.isEmpty() == true) {
			throw new SdkException("Marshaller is needed at least one.");
		}
		if (credentials == null) {
			throw new SdkException("Credentials cannot be null.");
		}

		this.httpClient = httpClient;
		this.marshallerSet = marshallerSet;
		this.credentials = credentials;
	}

	/**
	 * Call api response.
	 *
	 * @param <T>  the type parameter
	 * @param apiRequest the api request
	 * @return the api response
	 */
	public <T> ApiResponse<T> call(ApiRequest apiRequest) {
		return call(apiRequest, null);
	}

	/**
	 * Call api response.
	 *
	 * @param <T>  the type parameter
	 * @param apiRequest the api request
	 * @param returnType the return type
	 * @return the api response
	 */
	public <T> ApiResponse<T> call(ApiRequest apiRequest, Class returnType) {
		Request request = makeRequest(apiRequest);
		Response response = getResponse(request);

		if (response.isSuccessful() == false) {
			throw new ApiException("The response failed", response.code(), response.headers().toMultimap(), response.body().byteStream());
		}

		try {
			if (returnType == null) {
				return new ApiResponse(response.code(), response.headers().toMultimap(), null);
			}
			if (returnType == byte[].class) {
				byte[] responseBody = (response.body() == null) ? null : response.body().bytes();
				return new ApiResponse(response.code(), response.headers().toMultimap(), responseBody);
			}

			String contentType = response.header("content-type");
			Marshaller marshaller = getMarshaller(contentType);
			T responseBody = marshaller.readValue(response.body().byteStream(), returnType);
			return new ApiResponse(response.code(), response.headers().toMultimap(), responseBody);
		} catch (IOException e) {
			throw new ApiException("Failed to deserialize response: " + e.getMessage(), e, response.code(), response.headers().toMultimap(), response.body().byteStream());
		}
	}

	/**
	 * Select header accept string.
	 *
	 * @param accepts the accepts
	 * @return the string
	 */
	public String selectHeaderAccept(String[] accepts) {
		return selectHeaderContentType(accepts);
	}

	/**
	 * Select header content type string.
	 *
	 * @param contentTypes the content types
	 * @return the string
	 */
	public String selectHeaderContentType(String[] contentTypes) {
		for (String contentType : contentTypes) {
			try {
				return getMarshaller(contentType).getContentType();
			} catch (SdkException e) {
			}
		}
		if (contentTypes.length > 0) {
			return contentTypes[0];
		}
		return marshallerSet.iterator().next().getContentType();
	}

	private Request makeRequest(ApiRequest apiRequest) {
		try {
			Headers headers = getHeaders(apiRequest.getHttpHeaders());
			Request.Builder requestBuilder = new Request.Builder()
				.url(getUrl(apiRequest))
				.headers(headers)
				.method(apiRequest.getMethod(), getRequestBody(apiRequest));
			credentials.applyCredentials(requestBuilder, apiRequest.isRequiredApiKey());
			return requestBuilder.build();
		} catch (Exception e) {
			throw new SdkException("Failed to create request: " + e.getMessage(), e);
		}
	}

	private String getUrl(ApiRequest apiRequest) throws IOException {
		HttpUrl.Builder httpUrlBuilder = HttpUrl.parse(apiRequest.getDomain() + apiRequest.getBasePath() + apiRequest.getPath()).newBuilder();
		Map<String, Object> queryParams = apiRequest.getQueryParams();
		if (apiRequest.isCustomFormParams() == true && apiRequest.getMethod().equalsIgnoreCase("GET") == true) {
			Marshaller marshaller = FormMarshaller.getInstance();
			return httpUrlBuilder.toString() + "?" + marshaller.writeValueAsString(apiRequest.getBody());
		}
		for (Map.Entry<String, Object> entry : queryParams.entrySet()) {
			if (entry.getValue() instanceof Collection) {
				for (Object value : (Collection)entry.getValue()) {
					httpUrlBuilder.addQueryParameter(entry.getKey(), String.valueOf(value));
				}
			} else {
				httpUrlBuilder.addQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
			}
		}
		return httpUrlBuilder.toString();
	}

	private Headers getHeaders(Map<String, Object> headers) {
		Headers.Builder headersBuilder = new Headers.Builder();
		headersBuilder.add("x-ncp-apigw-sdk-version", SDK_VERSION);
		for (Map.Entry<String, Object> entry : headers.entrySet()) {
			headersBuilder.add(entry.getKey(), parameterToString(entry.getValue()));
		}
		return headersBuilder.build();
	}

	private RequestBody getRequestBody(ApiRequest apiRequest) throws IOException {
		String contentType = String.valueOf(apiRequest.getHttpHeaders().get("content-type"));
		Map formParams = apiRequest.getFormParams();
		Object body = apiRequest.getBody();

		if (apiRequest.isCustomFormParams() == true && apiRequest.getMethod().equalsIgnoreCase("GET") == true) {
			return null;
		}
		if (contentType.startsWith("multipart/form-data") == true) {
			return getFormData(formParams);
		}
		if (contentType.startsWith("application/x-www-form-urlencoded") == true && apiRequest.isCustomFormParams() == false) {
			return RequestBody.create(MediaType.parse(contentType), getUrlencodedParams(formParams));
		}
		if (body == null) {
            if (HttpMethod.permitsRequestBody(apiRequest.getMethod()) == false) {
			    return null;
            } else if (HttpMethod.requiresRequestBody(apiRequest.getMethod()) == true) {
                return RequestBody.create(MediaType.parse(contentType), new String());
            }
		}
		if (body instanceof byte[]) {
			return RequestBody.create(MediaType.parse(contentType), (byte[])body);
		}

		Marshaller marshaller = getMarshaller(contentType);
		return RequestBody.create(MediaType.parse(marshaller.getContentType()), marshaller.writeValueAsString(body));
	}

	private RequestBody getFormData(Map<String, Object> formParams) {
		MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);
		for (Map.Entry<String, Object> param: formParams.entrySet()) {
			if (param.getValue() instanceof Collection) {
				for (Object value : (Collection)param.getValue()) {
					builder.addFormDataPart(param.getKey(), String.valueOf(value));
				}
			} else if (param.getValue() instanceof File) {
				appendFile(builder, param.getKey(), (File)param.getValue());
			} else {
				builder.addFormDataPart(param.getKey(), String.valueOf(param.getValue()));
			}
		}
		return builder.build();
	}

	private void appendFile(MultipartBody.Builder builder, String key, File file) {
		String fileName = file.getAbsolutePath().substring(file.getAbsolutePath().lastIndexOf("/") + 1);
		String contentType = new MimetypesFileTypeMap().getContentType(file);
		RequestBody fileBody = RequestBody.create(MediaType.parse(contentType), file);

		builder.addFormDataPart(key, fileName, fileBody);
	}

	private String getUrlencodedParams(Map<String, Object> formParams) throws UnsupportedEncodingException {
		StringBuilder formParamBuilder = new StringBuilder();

		for (Map.Entry<String, Object> param : formParams.entrySet()) {
			if (param.getValue() instanceof Collection) {
				for (Object value : (Collection)param.getValue()) {
					formParamBuilder.append(URLEncoder.encode(param.getKey(), "utf8"))
						.append("=")
						.append(URLEncoder.encode(String.valueOf(value), "utf8"));
					formParamBuilder.append("&");
				}
			} else {
				formParamBuilder.append(URLEncoder.encode(param.getKey(), "utf8"))
					.append("=")
					.append(URLEncoder.encode(String.valueOf(param.getValue()), "utf8"));
				formParamBuilder.append("&");
			}
		}

		String encodedFormParams = formParamBuilder.toString();
		if (encodedFormParams.endsWith("&")) {
			encodedFormParams = encodedFormParams.substring(0, encodedFormParams.length() - 1);
		}

		return encodedFormParams;
	}

	private String parameterToString(Object param) {
		if (param == null) {
			return null;
		} else if (param instanceof Collection) {
			StringBuilder b = new StringBuilder();
			for(Object o : (Collection<?>)param) {
				if(b.length() > 0) {
					b.append(',');
				}
				b.append(String.valueOf(o));
			}
			return b.toString();
		} else {
			return String.valueOf(param);
		}
	}

	private Response getResponse(Request request) {
		try {
			return httpClient.newCall(request).execute();
		} catch (Exception e) {
			throw new SdkException("Failed to execute api: " + e.getMessage(), e);
		}
	}

	private Marshaller getMarshaller(String contentType) {
		for (Marshaller marshaller : marshallerSet) {
			if (MediaType.parse(marshaller.getContentType()).subtype().equalsIgnoreCase(MediaType.parse(contentType).subtype()) == true) {
				return marshaller;
			}
		}
		throw new SdkException("Unsupported media type: " + contentType);
	}

	/**
	 * The type Api client builder.
	 */
	public static class ApiClientBuilder {
		private long connectTimeout = 1000;
		private long writeTimeout = 30000;
		private long readTimeout = 30000;
		private Set<Marshaller> marshallerSet = new LinkedHashSet();
		private Credentials credentials;
		private HttpLoggingInterceptor.Level logLevel = HttpLoggingInterceptor.Level.NONE;

		/**
		 * Sets connect timeout ms.
		 *
		 * @param connectTimeout the connect timeout
		 * @return the connect timeout ms
		 */
		public ApiClientBuilder setConnectTimeoutMs(long connectTimeout) {
			this.connectTimeout = connectTimeout;
			return this;
		}

		/**
		 * Sets write timeout ms.
		 *
		 * @param writeTimeout the write timeout
		 * @return the write timeout ms
		 */
		public ApiClientBuilder setWriteTimeoutMs(long writeTimeout) {
			this.writeTimeout = writeTimeout;
			return this;
		}

		/**
		 * Sets read timeout ms.
		 *
		 * @param readTimeout the read timeout
		 * @return the read timeout ms
		 */
		public ApiClientBuilder setReadTimeoutMs(long readTimeout) {
			this.readTimeout = readTimeout;
			return this;
		}

		/**
		 * Add marshaller api client builder.
		 *
		 * @param marshaller the marshaller
		 * @return the api client builder
		 */
		public ApiClientBuilder addMarshaller(Marshaller marshaller) {
			this.marshallerSet.add(marshaller);
			return this;
		}

		/**
		 * Sets credentials.
		 *
		 * @param credentials the credentials
		 * @return the credentials
		 */
		public ApiClientBuilder setCredentials(Credentials credentials) {
			this.credentials = credentials;
			return this;
		}

		/**
		 * Sets logging.
		 *
		 * @param logging the logging
		 * @return the logging
		 */
		public ApiClientBuilder setLogging(boolean logging) {
			if (logging == true) {
				this.logLevel = HttpLoggingInterceptor.Level.BODY;
			}
			return this;
		}

		/**
		 * Build api client.
		 *
		 * @return the api client
		 */
		public ApiClient build() {
			HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
			loggingInterceptor.setLevel(logLevel);

			OkHttpClient httpClient = new OkHttpClient.Builder()
				.connectTimeout(connectTimeout, TimeUnit.MILLISECONDS)
				.writeTimeout(writeTimeout, TimeUnit.MILLISECONDS)
				.readTimeout(readTimeout, TimeUnit.MILLISECONDS)
				.addInterceptor(loggingInterceptor)
				.build();

			return new ApiClient(httpClient, marshallerSet, credentials);
		}
	}
}
