/*
 * vloadbalancer
 * VPC Load Balancer 관련 API<br/>https://ncloud.apigw.ntruss.com/vloadbalancer/v2
 *
 * OpenAPI spec version: 2020-12-22T09:19:59Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vloadbalancer.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * GetTargetGroupListRequest
 */
public class GetTargetGroupListRequest {
	private String regionCode = null;

	private List<String> targetGroupNoList = null;

	private Integer pageNo = null;

	private Integer pageSize = null;

	private String sortList = null;

	private String targetTypeCode = null;

	private String vpcNo = null;

	private String responseFormatType = null;

	public GetTargetGroupListRequest regionCode(String regionCode) {
		this.regionCode = regionCode;
		return this;
	}

	 /**
	 * REGION코드
	 * @return regionCode
	**/
	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public GetTargetGroupListRequest targetGroupNoList(List<String> targetGroupNoList) {
		this.targetGroupNoList = targetGroupNoList;
		return this;
	}

	public GetTargetGroupListRequest addTargetGroupNoListItem(String targetGroupNoListItem) {
		if (this.targetGroupNoList == null) {
			this.targetGroupNoList = new ArrayList<String>();
		}
		this.targetGroupNoList.add(targetGroupNoListItem);
		return this;
	}

	 /**
	 * 타겟그룹번호리스트
	 * @return targetGroupNoList
	**/
	public List<String> getTargetGroupNoList() {
		return targetGroupNoList;
	}

	public void setTargetGroupNoList(List<String> targetGroupNoList) {
		this.targetGroupNoList = targetGroupNoList;
	}

	public GetTargetGroupListRequest pageNo(Integer pageNo) {
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

	public GetTargetGroupListRequest pageSize(Integer pageSize) {
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

	public GetTargetGroupListRequest sortList(String sortList) {
		this.sortList = sortList;
		return this;
	}

	 /**
	 * 정렬리스트
	 * @return sortList
	**/
	public String getSortList() {
		return sortList;
	}

	public void setSortList(String sortList) {
		this.sortList = sortList;
	}

	public GetTargetGroupListRequest targetTypeCode(String targetTypeCode) {
		this.targetTypeCode = targetTypeCode;
		return this;
	}

	 /**
	 * 타겟유형코드
	 * @return targetTypeCode
	**/
	public String getTargetTypeCode() {
		return targetTypeCode;
	}

	public void setTargetTypeCode(String targetTypeCode) {
		this.targetTypeCode = targetTypeCode;
	}

	public GetTargetGroupListRequest vpcNo(String vpcNo) {
		this.vpcNo = vpcNo;
		return this;
	}

	 /**
	 * VPC번호
	 * @return vpcNo
	**/
	public String getVpcNo() {
		return vpcNo;
	}

	public void setVpcNo(String vpcNo) {
		this.vpcNo = vpcNo;
	}

	public GetTargetGroupListRequest responseFormatType(String responseFormatType) {
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
		GetTargetGroupListRequest getTargetGroupListRequest = (GetTargetGroupListRequest) o;
		return Objects.equals(this.regionCode, getTargetGroupListRequest.regionCode) &&
				Objects.equals(this.targetGroupNoList, getTargetGroupListRequest.targetGroupNoList) &&
				Objects.equals(this.pageNo, getTargetGroupListRequest.pageNo) &&
				Objects.equals(this.pageSize, getTargetGroupListRequest.pageSize) &&
				Objects.equals(this.sortList, getTargetGroupListRequest.sortList) &&
				Objects.equals(this.targetTypeCode, getTargetGroupListRequest.targetTypeCode) &&
				Objects.equals(this.vpcNo, getTargetGroupListRequest.vpcNo) &&
				Objects.equals(this.responseFormatType, getTargetGroupListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, targetGroupNoList, pageNo, pageSize, sortList, targetTypeCode, vpcNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetTargetGroupListRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		targetGroupNoList: ").append(toIndentedString(targetGroupNoList)).append("\n");
		sb.append("		pageNo: ").append(toIndentedString(pageNo)).append("\n");
		sb.append("		pageSize: ").append(toIndentedString(pageSize)).append("\n");
		sb.append("		sortList: ").append(toIndentedString(sortList)).append("\n");
		sb.append("		targetTypeCode: ").append(toIndentedString(targetTypeCode)).append("\n");
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
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

