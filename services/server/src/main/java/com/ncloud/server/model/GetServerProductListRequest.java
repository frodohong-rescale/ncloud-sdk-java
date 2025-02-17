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

/**
 * GetServerProductListRequest
 */
public class GetServerProductListRequest {
	private String exclusionProductCode = null;

	private String internetLineTypeCode = null;

	private String productCode = null;

	private String generationCode = null;

	private String regionNo = null;

	private String serverImageProductCode = null;

	private String zoneNo = null;

	private String responseFormatType = null;

	public GetServerProductListRequest exclusionProductCode(String exclusionProductCode) {
		this.exclusionProductCode = exclusionProductCode;
		return this;
	}

	 /**
	 * 제외할상품코드
	 * @return exclusionProductCode
	**/
	public String getExclusionProductCode() {
		return exclusionProductCode;
	}

	public void setExclusionProductCode(String exclusionProductCode) {
		this.exclusionProductCode = exclusionProductCode;
	}

	public GetServerProductListRequest internetLineTypeCode(String internetLineTypeCode) {
		this.internetLineTypeCode = internetLineTypeCode;
		return this;
	}

	 /**
	 * 인터넷라인구분코드
	 * @return internetLineTypeCode
	**/
	public String getInternetLineTypeCode() {
		return internetLineTypeCode;
	}

	public void setInternetLineTypeCode(String internetLineTypeCode) {
		this.internetLineTypeCode = internetLineTypeCode;
	}

	public GetServerProductListRequest productCode(String productCode) {
		this.productCode = productCode;
		return this;
	}

	 /**
	 * 조회할상품코드
	 * @return productCode
	**/
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public GetServerProductListRequest generationCode(String generationCode) {
		this.generationCode = generationCode;
		return this;
	}

	 /**
	 * 세대코드
	 * @return generationCode
	**/
	public String getGenerationCode() {
		return generationCode;
	}

	public void setGenerationCode(String generationCode) {
		this.generationCode = generationCode;
	}

	public GetServerProductListRequest regionNo(String regionNo) {
		this.regionNo = regionNo;
		return this;
	}

	 /**
	 * 리전번호
	 * @return regionNo
	**/
	public String getRegionNo() {
		return regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
	}

	public GetServerProductListRequest serverImageProductCode(String serverImageProductCode) {
		this.serverImageProductCode = serverImageProductCode;
		return this;
	}

	 /**
	 * 서버이미지상품코드
	 * @return serverImageProductCode
	**/
	public String getServerImageProductCode() {
		return serverImageProductCode;
	}

	public void setServerImageProductCode(String serverImageProductCode) {
		this.serverImageProductCode = serverImageProductCode;
	}

	public GetServerProductListRequest zoneNo(String zoneNo) {
		this.zoneNo = zoneNo;
		return this;
	}

	 /**
	 * ZONE번호
	 * @return zoneNo
	**/
	public String getZoneNo() {
		return zoneNo;
	}

	public void setZoneNo(String zoneNo) {
		this.zoneNo = zoneNo;
	}

	public GetServerProductListRequest responseFormatType(String responseFormatType) {
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
		GetServerProductListRequest getServerProductListRequest = (GetServerProductListRequest) o;
		return Objects.equals(this.exclusionProductCode, getServerProductListRequest.exclusionProductCode) &&
				Objects.equals(this.internetLineTypeCode, getServerProductListRequest.internetLineTypeCode) &&
				Objects.equals(this.productCode, getServerProductListRequest.productCode) &&
				Objects.equals(this.generationCode, getServerProductListRequest.generationCode) &&
				Objects.equals(this.regionNo, getServerProductListRequest.regionNo) &&
				Objects.equals(this.serverImageProductCode, getServerProductListRequest.serverImageProductCode) &&
				Objects.equals(this.zoneNo, getServerProductListRequest.zoneNo) &&
				Objects.equals(this.responseFormatType, getServerProductListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(exclusionProductCode, internetLineTypeCode, productCode, generationCode, regionNo, serverImageProductCode, zoneNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetServerProductListRequest {\n");
		
		sb.append("		exclusionProductCode: ").append(toIndentedString(exclusionProductCode)).append("\n");
		sb.append("		internetLineTypeCode: ").append(toIndentedString(internetLineTypeCode)).append("\n");
		sb.append("		productCode: ").append(toIndentedString(productCode)).append("\n");
		sb.append("		generationCode: ").append(toIndentedString(generationCode)).append("\n");
		sb.append("		regionNo: ").append(toIndentedString(regionNo)).append("\n");
		sb.append("		serverImageProductCode: ").append(toIndentedString(serverImageProductCode)).append("\n");
		sb.append("		zoneNo: ").append(toIndentedString(zoneNo)).append("\n");
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

