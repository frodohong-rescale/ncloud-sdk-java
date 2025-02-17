/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2021-03-04T10:39:42Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;

/**
 * ImportLoginKeyRequest
 */
public class ImportLoginKeyRequest {
	private String keyName = null;

	private String publicKey = null;

	private String responseFormatType = null;

	public ImportLoginKeyRequest keyName(String keyName) {
		this.keyName = keyName;
		return this;
	}

	 /**
	 * 키명
	 * @return keyName
	**/
	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public ImportLoginKeyRequest publicKey(String publicKey) {
		this.publicKey = publicKey;
		return this;
	}

	 /**
	 * 공개키
	 * @return publicKey
	**/
	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public ImportLoginKeyRequest responseFormatType(String responseFormatType) {
		this.responseFormatType = responseFormatType;
		return this;
	}

	 /**
	 * responseFormatType {json, xml}
	 * @return responseFormatType
	**/
	public String getResponseFormatType() {
		return responseFormatType;
	}

	public void setResponseFormatType(String responseFormatType) {
		this.responseFormatType = responseFormatType;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ImportLoginKeyRequest importLoginKeyRequest = (ImportLoginKeyRequest) o;
		return Objects.equals(this.keyName, importLoginKeyRequest.keyName) &&
				Objects.equals(this.publicKey, importLoginKeyRequest.publicKey) &&
				Objects.equals(this.responseFormatType, importLoginKeyRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(keyName, publicKey, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ImportLoginKeyRequest {\n");
		
		sb.append("		keyName: ").append(toIndentedString(keyName)).append("\n");
		sb.append("		publicKey: ").append(toIndentedString(publicKey)).append("\n");
		sb.append("		responseFormatType: ").append(toIndentedString(responseFormatType)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n		");
	}

}

