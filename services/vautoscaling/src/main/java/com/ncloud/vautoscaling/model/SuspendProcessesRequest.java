/*
 * vautoscaling
 * VPC Auto Scaling 관련 API<br/>https://ncloud.apigw.ntruss.com/vautoscaling/v2
 *
 * OpenAPI spec version: 2021-01-21T11:15:08Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vautoscaling.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * SuspendProcessesRequest
 */
public class SuspendProcessesRequest {
	private String regionCode = null;

	private String autoScalingGroupNo = null;

	private List<String> scalingProcessCodeList = new ArrayList<String>();

	private String responseFormatType = null;

	public SuspendProcessesRequest regionCode(String regionCode) {
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

	public SuspendProcessesRequest autoScalingGroupNo(String autoScalingGroupNo) {
		this.autoScalingGroupNo = autoScalingGroupNo;
		return this;
	}

	 /**
	 * 오토스케일링그룹번호
	 * @return autoScalingGroupNo
	**/
	public String getAutoScalingGroupNo() {
		return autoScalingGroupNo;
	}

	public void setAutoScalingGroupNo(String autoScalingGroupNo) {
		this.autoScalingGroupNo = autoScalingGroupNo;
	}

	public SuspendProcessesRequest scalingProcessCodeList(List<String> scalingProcessCodeList) {
		this.scalingProcessCodeList = scalingProcessCodeList;
		return this;
	}

	public SuspendProcessesRequest addScalingProcessCodeListItem(String scalingProcessCodeListItem) {
		this.scalingProcessCodeList.add(scalingProcessCodeListItem);
		return this;
	}

	 /**
	 * 스케일링프로세스코드리스트
	 * @return scalingProcessCodeList
	**/
	public List<String> getScalingProcessCodeList() {
		return scalingProcessCodeList;
	}

	public void setScalingProcessCodeList(List<String> scalingProcessCodeList) {
		this.scalingProcessCodeList = scalingProcessCodeList;
	}

	public SuspendProcessesRequest responseFormatType(String responseFormatType) {
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
		SuspendProcessesRequest suspendProcessesRequest = (SuspendProcessesRequest) o;
		return Objects.equals(this.regionCode, suspendProcessesRequest.regionCode) &&
				Objects.equals(this.autoScalingGroupNo, suspendProcessesRequest.autoScalingGroupNo) &&
				Objects.equals(this.scalingProcessCodeList, suspendProcessesRequest.scalingProcessCodeList) &&
				Objects.equals(this.responseFormatType, suspendProcessesRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, autoScalingGroupNo, scalingProcessCodeList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SuspendProcessesRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		autoScalingGroupNo: ").append(toIndentedString(autoScalingGroupNo)).append("\n");
		sb.append("		scalingProcessCodeList: ").append(toIndentedString(scalingProcessCodeList)).append("\n");
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

