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
import com.ncloud.server.model.PublicIpInstance;
import java.util.ArrayList;
import java.util.List;

/**
 * ReplaceServerInstanceAssociatedWithPublicIpResponse
 */
public class ReplaceServerInstanceAssociatedWithPublicIpResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<PublicIpInstance> publicIpInstanceList = null;

	public ReplaceServerInstanceAssociatedWithPublicIpResponse requestId(String requestId) {
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

	public ReplaceServerInstanceAssociatedWithPublicIpResponse returnCode(String returnCode) {
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

	public ReplaceServerInstanceAssociatedWithPublicIpResponse returnMessage(String returnMessage) {
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

	public ReplaceServerInstanceAssociatedWithPublicIpResponse totalRows(Integer totalRows) {
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

	public ReplaceServerInstanceAssociatedWithPublicIpResponse publicIpInstanceList(List<PublicIpInstance> publicIpInstanceList) {
		this.publicIpInstanceList = publicIpInstanceList;
		return this;
	}

	public ReplaceServerInstanceAssociatedWithPublicIpResponse addPublicIpInstanceListItem(PublicIpInstance publicIpInstanceListItem) {
		if (this.publicIpInstanceList == null) {
			this.publicIpInstanceList = new ArrayList<PublicIpInstance>();
		}
		this.publicIpInstanceList.add(publicIpInstanceListItem);
		return this;
	}

	 /**
	 * Get publicIpInstanceList
	 * @return publicIpInstanceList
	**/
	public List<PublicIpInstance> getPublicIpInstanceList() {
		return publicIpInstanceList;
	}

	public void setPublicIpInstanceList(List<PublicIpInstance> publicIpInstanceList) {
		this.publicIpInstanceList = publicIpInstanceList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ReplaceServerInstanceAssociatedWithPublicIpResponse replaceServerInstanceAssociatedWithPublicIpResponse = (ReplaceServerInstanceAssociatedWithPublicIpResponse) o;
		return Objects.equals(this.requestId, replaceServerInstanceAssociatedWithPublicIpResponse.requestId) &&
				Objects.equals(this.returnCode, replaceServerInstanceAssociatedWithPublicIpResponse.returnCode) &&
				Objects.equals(this.returnMessage, replaceServerInstanceAssociatedWithPublicIpResponse.returnMessage) &&
				Objects.equals(this.totalRows, replaceServerInstanceAssociatedWithPublicIpResponse.totalRows) &&
				Objects.equals(this.publicIpInstanceList, replaceServerInstanceAssociatedWithPublicIpResponse.publicIpInstanceList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, publicIpInstanceList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReplaceServerInstanceAssociatedWithPublicIpResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		publicIpInstanceList: ").append(toIndentedString(publicIpInstanceList)).append("\n");
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

