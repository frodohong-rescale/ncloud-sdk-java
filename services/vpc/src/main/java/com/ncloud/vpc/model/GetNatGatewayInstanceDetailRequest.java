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

/**
 * GetNatGatewayInstanceDetailRequest
 */
public class GetNatGatewayInstanceDetailRequest {
	private String regionCode = null;

	private String natGatewayInstanceNo = null;

	private String responseFormatType = null;

	public GetNatGatewayInstanceDetailRequest regionCode(String regionCode) {
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

	public GetNatGatewayInstanceDetailRequest natGatewayInstanceNo(String natGatewayInstanceNo) {
		this.natGatewayInstanceNo = natGatewayInstanceNo;
		return this;
	}

	 /**
	 * NATGatway인스턴스번호
	 * @return natGatewayInstanceNo
	**/
	public String getNatGatewayInstanceNo() {
		return natGatewayInstanceNo;
	}

	public void setNatGatewayInstanceNo(String natGatewayInstanceNo) {
		this.natGatewayInstanceNo = natGatewayInstanceNo;
	}

	public GetNatGatewayInstanceDetailRequest responseFormatType(String responseFormatType) {
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
		GetNatGatewayInstanceDetailRequest getNatGatewayInstanceDetailRequest = (GetNatGatewayInstanceDetailRequest) o;
		return Objects.equals(this.regionCode, getNatGatewayInstanceDetailRequest.regionCode) &&
				Objects.equals(this.natGatewayInstanceNo, getNatGatewayInstanceDetailRequest.natGatewayInstanceNo) &&
				Objects.equals(this.responseFormatType, getNatGatewayInstanceDetailRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, natGatewayInstanceNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetNatGatewayInstanceDetailRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		natGatewayInstanceNo: ").append(toIndentedString(natGatewayInstanceNo)).append("\n");
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
