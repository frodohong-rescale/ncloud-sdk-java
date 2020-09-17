/*
 * vserver
 * VPC Compute 관련 API<br/>https://ncloud.apigw.ntruss.com/vserver/v2
 *
 * OpenAPI spec version: 2020-09-17T02:28:03Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vserver.model;

import java.util.Objects;

/**
 * CreateAccessControlGroupRequest
 */
public class CreateAccessControlGroupRequest {
	private String regionCode = null;

	private String accessControlGroupName = null;

	private String accessControlGroupDescription = null;

	private String vpcNo = null;

	private String responseFormatType = null;

	public CreateAccessControlGroupRequest regionCode(String regionCode) {
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

	public CreateAccessControlGroupRequest accessControlGroupName(String accessControlGroupName) {
		this.accessControlGroupName = accessControlGroupName;
		return this;
	}

	 /**
	 * ACG이름
	 * @return accessControlGroupName
	**/
	public String getAccessControlGroupName() {
		return accessControlGroupName;
	}

	public void setAccessControlGroupName(String accessControlGroupName) {
		this.accessControlGroupName = accessControlGroupName;
	}

	public CreateAccessControlGroupRequest accessControlGroupDescription(String accessControlGroupDescription) {
		this.accessControlGroupDescription = accessControlGroupDescription;
		return this;
	}

	 /**
	 * ACG설명
	 * @return accessControlGroupDescription
	**/
	public String getAccessControlGroupDescription() {
		return accessControlGroupDescription;
	}

	public void setAccessControlGroupDescription(String accessControlGroupDescription) {
		this.accessControlGroupDescription = accessControlGroupDescription;
	}

	public CreateAccessControlGroupRequest vpcNo(String vpcNo) {
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

	public CreateAccessControlGroupRequest responseFormatType(String responseFormatType) {
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
		CreateAccessControlGroupRequest createAccessControlGroupRequest = (CreateAccessControlGroupRequest) o;
		return Objects.equals(this.regionCode, createAccessControlGroupRequest.regionCode) &&
				Objects.equals(this.accessControlGroupName, createAccessControlGroupRequest.accessControlGroupName) &&
				Objects.equals(this.accessControlGroupDescription, createAccessControlGroupRequest.accessControlGroupDescription) &&
				Objects.equals(this.vpcNo, createAccessControlGroupRequest.vpcNo) &&
				Objects.equals(this.responseFormatType, createAccessControlGroupRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, accessControlGroupName, accessControlGroupDescription, vpcNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateAccessControlGroupRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		accessControlGroupName: ").append(toIndentedString(accessControlGroupName)).append("\n");
		sb.append("		accessControlGroupDescription: ").append(toIndentedString(accessControlGroupDescription)).append("\n");
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
