/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2019-10-17T10:28:43Z
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * DeletePublicIpInstancesRequest
 */
public class DeletePublicIpInstancesRequest {
	private List<String> publicIpInstanceNoList = new ArrayList<String>();

	private String responseFormatType = null;

	public DeletePublicIpInstancesRequest publicIpInstanceNoList(List<String> publicIpInstanceNoList) {
		this.publicIpInstanceNoList = publicIpInstanceNoList;
		return this;
	}

	public DeletePublicIpInstancesRequest addPublicIpInstanceNoListItem(String publicIpInstanceNoListItem) {
		this.publicIpInstanceNoList.add(publicIpInstanceNoListItem);
		return this;
	}

	 /**
	 * 공인IP인스턴스번호리스트
	 * @return publicIpInstanceNoList
	**/
	public List<String> getPublicIpInstanceNoList() {
		return publicIpInstanceNoList;
	}

	public void setPublicIpInstanceNoList(List<String> publicIpInstanceNoList) {
		this.publicIpInstanceNoList = publicIpInstanceNoList;
	}

	public DeletePublicIpInstancesRequest responseFormatType(String responseFormatType) {
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
		DeletePublicIpInstancesRequest deletePublicIpInstancesRequest = (DeletePublicIpInstancesRequest) o;
		return Objects.equals(this.publicIpInstanceNoList, deletePublicIpInstancesRequest.publicIpInstanceNoList) &&
				Objects.equals(this.responseFormatType, deletePublicIpInstancesRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(publicIpInstanceNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeletePublicIpInstancesRequest {\n");
		
		sb.append("		publicIpInstanceNoList: ").append(toIndentedString(publicIpInstanceNoList)).append("\n");
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
