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
 * GetAccessControlGroupListRequest
 */
public class GetAccessControlGroupListRequest {
	private List<String> accessControlGroupConfigurationNoList = null;

	private Boolean isDefault = null;

	private String accessControlGroupName = null;

	private Integer pageNo = null;

	private Integer pageSize = null;

	private String responseFormatType = null;

	public GetAccessControlGroupListRequest accessControlGroupConfigurationNoList(List<String> accessControlGroupConfigurationNoList) {
		this.accessControlGroupConfigurationNoList = accessControlGroupConfigurationNoList;
		return this;
	}

	public GetAccessControlGroupListRequest addAccessControlGroupConfigurationNoListItem(String accessControlGroupConfigurationNoListItem) {
		if (this.accessControlGroupConfigurationNoList == null) {
			this.accessControlGroupConfigurationNoList = new ArrayList<String>();
		}
		this.accessControlGroupConfigurationNoList.add(accessControlGroupConfigurationNoListItem);
		return this;
	}

	 /**
	 * 접근제어그룹설정번호리스트
	 * @return accessControlGroupConfigurationNoList
	**/
	public List<String> getAccessControlGroupConfigurationNoList() {
		return accessControlGroupConfigurationNoList;
	}

	public void setAccessControlGroupConfigurationNoList(List<String> accessControlGroupConfigurationNoList) {
		this.accessControlGroupConfigurationNoList = accessControlGroupConfigurationNoList;
	}

	public GetAccessControlGroupListRequest isDefault(Boolean isDefault) {
		this.isDefault = isDefault;
		return this;
	}

	 /**
	 * 디폴트여부
	 * @return isDefault
	**/
	public Boolean isIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public GetAccessControlGroupListRequest accessControlGroupName(String accessControlGroupName) {
		this.accessControlGroupName = accessControlGroupName;
		return this;
	}

	 /**
	 * 접근제어그룹명
	 * @return accessControlGroupName
	**/
	public String getAccessControlGroupName() {
		return accessControlGroupName;
	}

	public void setAccessControlGroupName(String accessControlGroupName) {
		this.accessControlGroupName = accessControlGroupName;
	}

	public GetAccessControlGroupListRequest pageNo(Integer pageNo) {
		this.pageNo = pageNo;
		return this;
	}

	 /**
	 * 페이지번호
	 * @return pageNo
	**/
	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public GetAccessControlGroupListRequest pageSize(Integer pageSize) {
		this.pageSize = pageSize;
		return this;
	}

	 /**
	 * 페이지사이즈
	 * @return pageSize
	**/
	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetAccessControlGroupListRequest responseFormatType(String responseFormatType) {
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
		GetAccessControlGroupListRequest getAccessControlGroupListRequest = (GetAccessControlGroupListRequest) o;
		return Objects.equals(this.accessControlGroupConfigurationNoList, getAccessControlGroupListRequest.accessControlGroupConfigurationNoList) &&
				Objects.equals(this.isDefault, getAccessControlGroupListRequest.isDefault) &&
				Objects.equals(this.accessControlGroupName, getAccessControlGroupListRequest.accessControlGroupName) &&
				Objects.equals(this.pageNo, getAccessControlGroupListRequest.pageNo) &&
				Objects.equals(this.pageSize, getAccessControlGroupListRequest.pageSize) &&
				Objects.equals(this.responseFormatType, getAccessControlGroupListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accessControlGroupConfigurationNoList, isDefault, accessControlGroupName, pageNo, pageSize, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetAccessControlGroupListRequest {\n");
		
		sb.append("		accessControlGroupConfigurationNoList: ").append(toIndentedString(accessControlGroupConfigurationNoList)).append("\n");
		sb.append("		isDefault: ").append(toIndentedString(isDefault)).append("\n");
		sb.append("		accessControlGroupName: ").append(toIndentedString(accessControlGroupName)).append("\n");
		sb.append("		pageNo: ").append(toIndentedString(pageNo)).append("\n");
		sb.append("		pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
