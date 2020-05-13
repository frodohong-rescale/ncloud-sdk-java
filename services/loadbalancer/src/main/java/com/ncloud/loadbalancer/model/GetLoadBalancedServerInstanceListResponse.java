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
import com.ncloud.loadbalancer.model.ServerInstance;
import java.util.ArrayList;
import java.util.List;

/**
 * GetLoadBalancedServerInstanceListResponse
 */
public class GetLoadBalancedServerInstanceListResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<ServerInstance> serverInstanceList = null;

	public GetLoadBalancedServerInstanceListResponse requestId(String requestId) {
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

	public GetLoadBalancedServerInstanceListResponse returnCode(String returnCode) {
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

	public GetLoadBalancedServerInstanceListResponse returnMessage(String returnMessage) {
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

	public GetLoadBalancedServerInstanceListResponse totalRows(Integer totalRows) {
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

	public GetLoadBalancedServerInstanceListResponse serverInstanceList(List<ServerInstance> serverInstanceList) {
		this.serverInstanceList = serverInstanceList;
		return this;
	}

	public GetLoadBalancedServerInstanceListResponse addServerInstanceListItem(ServerInstance serverInstanceListItem) {
		if (this.serverInstanceList == null) {
			this.serverInstanceList = new ArrayList<ServerInstance>();
		}
		this.serverInstanceList.add(serverInstanceListItem);
		return this;
	}

	 /**
	 * Get serverInstanceList
	 * @return serverInstanceList
	**/
	public List<ServerInstance> getServerInstanceList() {
		return serverInstanceList;
	}

	public void setServerInstanceList(List<ServerInstance> serverInstanceList) {
		this.serverInstanceList = serverInstanceList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetLoadBalancedServerInstanceListResponse getLoadBalancedServerInstanceListResponse = (GetLoadBalancedServerInstanceListResponse) o;
		return Objects.equals(this.requestId, getLoadBalancedServerInstanceListResponse.requestId) &&
				Objects.equals(this.returnCode, getLoadBalancedServerInstanceListResponse.returnCode) &&
				Objects.equals(this.returnMessage, getLoadBalancedServerInstanceListResponse.returnMessage) &&
				Objects.equals(this.totalRows, getLoadBalancedServerInstanceListResponse.totalRows) &&
				Objects.equals(this.serverInstanceList, getLoadBalancedServerInstanceListResponse.serverInstanceList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, serverInstanceList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetLoadBalancedServerInstanceListResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		serverInstanceList: ").append(toIndentedString(serverInstanceList)).append("\n");
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
