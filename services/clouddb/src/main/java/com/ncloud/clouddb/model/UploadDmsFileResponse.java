/*
 * clouddb
 * Cloud DB<br/>https://ncloud.apigw.ntruss.com/clouddb/v2
 *
 * OpenAPI spec version: 2018-11-13T06:30:03Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.clouddb.model;

import java.util.Objects;

/**
 * UploadDmsFileResponse
 */
public class UploadDmsFileResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private String requestNo = null;

	public UploadDmsFileResponse requestId(String requestId) {
		this.requestId = requestId;
		return this;
	}

	 /**
	 * Get requestId
	 * @return requestId
	**/
	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UploadDmsFileResponse returnCode(String returnCode) {
		this.returnCode = returnCode;
		return this;
	}

	 /**
	 * Get returnCode
	 * @return returnCode
	**/
	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public UploadDmsFileResponse returnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
		return this;
	}

	 /**
	 * Get returnMessage
	 * @return returnMessage
	**/
	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public UploadDmsFileResponse requestNo(String requestNo) {
		this.requestNo = requestNo;
		return this;
	}

	 /**
	 * Get requestNo
	 * @return requestNo
	**/
	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UploadDmsFileResponse uploadDmsFileResponse = (UploadDmsFileResponse) o;
		return Objects.equals(this.requestId, uploadDmsFileResponse.requestId) &&
				Objects.equals(this.returnCode, uploadDmsFileResponse.returnCode) &&
				Objects.equals(this.returnMessage, uploadDmsFileResponse.returnMessage) &&
				Objects.equals(this.requestNo, uploadDmsFileResponse.requestNo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, requestNo);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UploadDmsFileResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		requestNo: ").append(toIndentedString(requestNo)).append("\n");
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
