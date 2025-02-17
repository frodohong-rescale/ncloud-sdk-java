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

/**
 * SetLoadBalancerDescriptionRequest
 */
public class SetLoadBalancerDescriptionRequest {
	private String regionCode = null;

	private String loadBalancerDescription = null;

	private String loadBalancerInstanceNo = null;

	private String responseFormatType = null;

	public SetLoadBalancerDescriptionRequest regionCode(String regionCode) {
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

	public SetLoadBalancerDescriptionRequest loadBalancerDescription(String loadBalancerDescription) {
		this.loadBalancerDescription = loadBalancerDescription;
		return this;
	}

	 /**
	 * 로드밸런서설명
	 * @return loadBalancerDescription
	**/
	public String getLoadBalancerDescription() {
		return loadBalancerDescription;
	}

	public void setLoadBalancerDescription(String loadBalancerDescription) {
		this.loadBalancerDescription = loadBalancerDescription;
	}

	public SetLoadBalancerDescriptionRequest loadBalancerInstanceNo(String loadBalancerInstanceNo) {
		this.loadBalancerInstanceNo = loadBalancerInstanceNo;
		return this;
	}

	 /**
	 * 로드밸런서인스턴스번호
	 * @return loadBalancerInstanceNo
	**/
	public String getLoadBalancerInstanceNo() {
		return loadBalancerInstanceNo;
	}

	public void setLoadBalancerInstanceNo(String loadBalancerInstanceNo) {
		this.loadBalancerInstanceNo = loadBalancerInstanceNo;
	}

	public SetLoadBalancerDescriptionRequest responseFormatType(String responseFormatType) {
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
		SetLoadBalancerDescriptionRequest setLoadBalancerDescriptionRequest = (SetLoadBalancerDescriptionRequest) o;
		return Objects.equals(this.regionCode, setLoadBalancerDescriptionRequest.regionCode) &&
				Objects.equals(this.loadBalancerDescription, setLoadBalancerDescriptionRequest.loadBalancerDescription) &&
				Objects.equals(this.loadBalancerInstanceNo, setLoadBalancerDescriptionRequest.loadBalancerInstanceNo) &&
				Objects.equals(this.responseFormatType, setLoadBalancerDescriptionRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, loadBalancerDescription, loadBalancerInstanceNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SetLoadBalancerDescriptionRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		loadBalancerDescription: ").append(toIndentedString(loadBalancerDescription)).append("\n");
		sb.append("		loadBalancerInstanceNo: ").append(toIndentedString(loadBalancerInstanceNo)).append("\n");
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

