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
 * ReplaceServerInstanceAssociatedWithPublicIpRequest
 */
public class ReplaceServerInstanceAssociatedWithPublicIpRequest {
	private String publicIpInstanceNo = null;

	private String serverInstanceNo = null;

	private String responseFormatType = null;

	public ReplaceServerInstanceAssociatedWithPublicIpRequest publicIpInstanceNo(String publicIpInstanceNo) {
		this.publicIpInstanceNo = publicIpInstanceNo;
		return this;
	}

	 /**
	 * 공인IP인스턴스번호
	 * @return publicIpInstanceNo
	**/
	public String getPublicIpInstanceNo() {
		return publicIpInstanceNo;
	}

	public void setPublicIpInstanceNo(String publicIpInstanceNo) {
		this.publicIpInstanceNo = publicIpInstanceNo;
	}

	public ReplaceServerInstanceAssociatedWithPublicIpRequest serverInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
		return this;
	}

	 /**
	 * 서버인스턴스번호
	 * @return serverInstanceNo
	**/
	public String getServerInstanceNo() {
		return serverInstanceNo;
	}

	public void setServerInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
	}

	public ReplaceServerInstanceAssociatedWithPublicIpRequest responseFormatType(String responseFormatType) {
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
		ReplaceServerInstanceAssociatedWithPublicIpRequest replaceServerInstanceAssociatedWithPublicIpRequest = (ReplaceServerInstanceAssociatedWithPublicIpRequest) o;
		return Objects.equals(this.publicIpInstanceNo, replaceServerInstanceAssociatedWithPublicIpRequest.publicIpInstanceNo) &&
				Objects.equals(this.serverInstanceNo, replaceServerInstanceAssociatedWithPublicIpRequest.serverInstanceNo) &&
				Objects.equals(this.responseFormatType, replaceServerInstanceAssociatedWithPublicIpRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(publicIpInstanceNo, serverInstanceNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReplaceServerInstanceAssociatedWithPublicIpRequest {\n");
		
		sb.append("		publicIpInstanceNo: ").append(toIndentedString(publicIpInstanceNo)).append("\n");
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
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

