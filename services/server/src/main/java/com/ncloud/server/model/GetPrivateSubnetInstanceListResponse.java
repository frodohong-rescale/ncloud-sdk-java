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
import com.ncloud.server.model.PrivateSubnetInstance;
import java.util.ArrayList;
import java.util.List;

/**
 * GetPrivateSubnetInstanceListResponse
 */
public class GetPrivateSubnetInstanceListResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<PrivateSubnetInstance> privateSubnetInstanceList = null;

	public GetPrivateSubnetInstanceListResponse requestId(String requestId) {
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

	public GetPrivateSubnetInstanceListResponse returnCode(String returnCode) {
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

	public GetPrivateSubnetInstanceListResponse returnMessage(String returnMessage) {
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

	public GetPrivateSubnetInstanceListResponse totalRows(Integer totalRows) {
		this.totalRows = totalRows;
		return this;
	}

	 /**
	 * Get totalRows
	 * @return totalRows
	**/
	public Integer getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(Integer totalRows) {
		this.totalRows = totalRows;
	}

	public GetPrivateSubnetInstanceListResponse privateSubnetInstanceList(List<PrivateSubnetInstance> privateSubnetInstanceList) {
		this.privateSubnetInstanceList = privateSubnetInstanceList;
		return this;
	}

	public GetPrivateSubnetInstanceListResponse addPrivateSubnetInstanceListItem(PrivateSubnetInstance privateSubnetInstanceListItem) {
		if (this.privateSubnetInstanceList == null) {
			this.privateSubnetInstanceList = new ArrayList<PrivateSubnetInstance>();
		}
		this.privateSubnetInstanceList.add(privateSubnetInstanceListItem);
		return this;
	}

	 /**
	 * Get privateSubnetInstanceList
	 * @return privateSubnetInstanceList
	**/
	public List<PrivateSubnetInstance> getPrivateSubnetInstanceList() {
		return privateSubnetInstanceList;
	}

	public void setPrivateSubnetInstanceList(List<PrivateSubnetInstance> privateSubnetInstanceList) {
		this.privateSubnetInstanceList = privateSubnetInstanceList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetPrivateSubnetInstanceListResponse getPrivateSubnetInstanceListResponse = (GetPrivateSubnetInstanceListResponse) o;
		return Objects.equals(this.requestId, getPrivateSubnetInstanceListResponse.requestId) &&
				Objects.equals(this.returnCode, getPrivateSubnetInstanceListResponse.returnCode) &&
				Objects.equals(this.returnMessage, getPrivateSubnetInstanceListResponse.returnMessage) &&
				Objects.equals(this.totalRows, getPrivateSubnetInstanceListResponse.totalRows) &&
				Objects.equals(this.privateSubnetInstanceList, getPrivateSubnetInstanceListResponse.privateSubnetInstanceList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, privateSubnetInstanceList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetPrivateSubnetInstanceListResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		privateSubnetInstanceList: ").append(toIndentedString(privateSubnetInstanceList)).append("\n");
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

