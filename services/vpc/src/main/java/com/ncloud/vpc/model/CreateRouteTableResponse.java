/*
 * vpc
 * VPC Network 관련 API<br/>https://ncloud.apigw.ntruss.com/vpc/v2
 *
 * OpenAPI spec version: 2020-09-17T02:27:03Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vpc.model;

import java.util.Objects;
import com.ncloud.vpc.model.RouteTable;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateRouteTableResponse
 */
public class CreateRouteTableResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private Integer totalRows = null;

	private List<RouteTable> routeTableList = null;

	public CreateRouteTableResponse requestId(String requestId) {
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

	public CreateRouteTableResponse returnCode(String returnCode) {
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

	public CreateRouteTableResponse returnMessage(String returnMessage) {
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

	public CreateRouteTableResponse totalRows(Integer totalRows) {
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

	public CreateRouteTableResponse routeTableList(List<RouteTable> routeTableList) {
		this.routeTableList = routeTableList;
		return this;
	}

	public CreateRouteTableResponse addRouteTableListItem(RouteTable routeTableListItem) {
		if (this.routeTableList == null) {
			this.routeTableList = new ArrayList<RouteTable>();
		}
		this.routeTableList.add(routeTableListItem);
		return this;
	}

	 /**
	 * Get routeTableList
	 * @return routeTableList
	**/
	public List<RouteTable> getRouteTableList() {
		return routeTableList;
	}

	public void setRouteTableList(List<RouteTable> routeTableList) {
		this.routeTableList = routeTableList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreateRouteTableResponse createRouteTableResponse = (CreateRouteTableResponse) o;
		return Objects.equals(this.requestId, createRouteTableResponse.requestId) &&
				Objects.equals(this.returnCode, createRouteTableResponse.returnCode) &&
				Objects.equals(this.returnMessage, createRouteTableResponse.returnMessage) &&
				Objects.equals(this.totalRows, createRouteTableResponse.totalRows) &&
				Objects.equals(this.routeTableList, createRouteTableResponse.routeTableList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, totalRows, routeTableList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateRouteTableResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		totalRows: ").append(toIndentedString(totalRows)).append("\n");
		sb.append("		routeTableList: ").append(toIndentedString(routeTableList)).append("\n");
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
