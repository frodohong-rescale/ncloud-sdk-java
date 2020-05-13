/*
 * loadbalancer
 * <br/>https://ncloud.apigw.ntruss.com/loadbalancer/v2
 *
 * OpenAPI spec version: 2018-11-13T06:25:36Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.loadbalancer.model;

import java.util.Objects;

/**
 * DeleteLoadBalancerSslCertificateRequest
 */
public class DeleteLoadBalancerSslCertificateRequest {
	private String certificateName = null;

	private String responseFormatType = null;

	public DeleteLoadBalancerSslCertificateRequest certificateName(String certificateName) {
		this.certificateName = certificateName;
		return this;
	}

	 /**
	 * 인증서명
	 * @return certificateName
	**/
	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public DeleteLoadBalancerSslCertificateRequest responseFormatType(String responseFormatType) {
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
		DeleteLoadBalancerSslCertificateRequest deleteLoadBalancerSslCertificateRequest = (DeleteLoadBalancerSslCertificateRequest) o;
		return Objects.equals(this.certificateName, deleteLoadBalancerSslCertificateRequest.certificateName) &&
				Objects.equals(this.responseFormatType, deleteLoadBalancerSslCertificateRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(certificateName, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteLoadBalancerSslCertificateRequest {\n");
		
		sb.append("		certificateName: ").append(toIndentedString(certificateName)).append("\n");
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
