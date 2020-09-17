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
import java.util.ArrayList;
import java.util.List;

/**
 * GetNatGatewayInstanceListRequest
 */
public class GetNatGatewayInstanceListRequest {
	private String regionCode = null;

	private String zoneCode = null;

	private List<String> natGatewayInstanceNoList = null;

	private String publicIp = null;

	private String vpcName = null;

	private String natGatewayName = null;

	private String natGatewayInstanceStatusCode = null;

	private Integer pageNo = null;

	private Integer pageSize = null;

	private String responseFormatType = null;

	public GetNatGatewayInstanceListRequest regionCode(String regionCode) {
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

	public GetNatGatewayInstanceListRequest zoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
		return this;
	}

	 /**
	 * ZONE코드
	 * @return zoneCode
	**/
	public String getZoneCode() {
		return zoneCode;
	}

	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}

	public GetNatGatewayInstanceListRequest natGatewayInstanceNoList(List<String> natGatewayInstanceNoList) {
		this.natGatewayInstanceNoList = natGatewayInstanceNoList;
		return this;
	}

	public GetNatGatewayInstanceListRequest addNatGatewayInstanceNoListItem(String natGatewayInstanceNoListItem) {
		if (this.natGatewayInstanceNoList == null) {
			this.natGatewayInstanceNoList = new ArrayList<String>();
		}
		this.natGatewayInstanceNoList.add(natGatewayInstanceNoListItem);
		return this;
	}

	 /**
	 * NATGateway인스턴스번호리스트
	 * @return natGatewayInstanceNoList
	**/
	public List<String> getNatGatewayInstanceNoList() {
		return natGatewayInstanceNoList;
	}

	public void setNatGatewayInstanceNoList(List<String> natGatewayInstanceNoList) {
		this.natGatewayInstanceNoList = natGatewayInstanceNoList;
	}

	public GetNatGatewayInstanceListRequest publicIp(String publicIp) {
		this.publicIp = publicIp;
		return this;
	}

	 /**
	 * 공인IP주소
	 * @return publicIp
	**/
	public String getPublicIp() {
		return publicIp;
	}

	public void setPublicIp(String publicIp) {
		this.publicIp = publicIp;
	}

	public GetNatGatewayInstanceListRequest vpcName(String vpcName) {
		this.vpcName = vpcName;
		return this;
	}

	 /**
	 * VPC이름
	 * @return vpcName
	**/
	public String getVpcName() {
		return vpcName;
	}

	public void setVpcName(String vpcName) {
		this.vpcName = vpcName;
	}

	public GetNatGatewayInstanceListRequest natGatewayName(String natGatewayName) {
		this.natGatewayName = natGatewayName;
		return this;
	}

	 /**
	 * natGatewayName
	 * @return natGatewayName
	**/
	public String getNatGatewayName() {
		return natGatewayName;
	}

	public void setNatGatewayName(String natGatewayName) {
		this.natGatewayName = natGatewayName;
	}

	public GetNatGatewayInstanceListRequest natGatewayInstanceStatusCode(String natGatewayInstanceStatusCode) {
		this.natGatewayInstanceStatusCode = natGatewayInstanceStatusCode;
		return this;
	}

	 /**
	 * NATGateway인스턴스상태코드
	 * @return natGatewayInstanceStatusCode
	**/
	public String getNatGatewayInstanceStatusCode() {
		return natGatewayInstanceStatusCode;
	}

	public void setNatGatewayInstanceStatusCode(String natGatewayInstanceStatusCode) {
		this.natGatewayInstanceStatusCode = natGatewayInstanceStatusCode;
	}

	public GetNatGatewayInstanceListRequest pageNo(Integer pageNo) {
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

	public GetNatGatewayInstanceListRequest pageSize(Integer pageSize) {
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

	public GetNatGatewayInstanceListRequest responseFormatType(String responseFormatType) {
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
		GetNatGatewayInstanceListRequest getNatGatewayInstanceListRequest = (GetNatGatewayInstanceListRequest) o;
		return Objects.equals(this.regionCode, getNatGatewayInstanceListRequest.regionCode) &&
				Objects.equals(this.zoneCode, getNatGatewayInstanceListRequest.zoneCode) &&
				Objects.equals(this.natGatewayInstanceNoList, getNatGatewayInstanceListRequest.natGatewayInstanceNoList) &&
				Objects.equals(this.publicIp, getNatGatewayInstanceListRequest.publicIp) &&
				Objects.equals(this.vpcName, getNatGatewayInstanceListRequest.vpcName) &&
				Objects.equals(this.natGatewayName, getNatGatewayInstanceListRequest.natGatewayName) &&
				Objects.equals(this.natGatewayInstanceStatusCode, getNatGatewayInstanceListRequest.natGatewayInstanceStatusCode) &&
				Objects.equals(this.pageNo, getNatGatewayInstanceListRequest.pageNo) &&
				Objects.equals(this.pageSize, getNatGatewayInstanceListRequest.pageSize) &&
				Objects.equals(this.responseFormatType, getNatGatewayInstanceListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, zoneCode, natGatewayInstanceNoList, publicIp, vpcName, natGatewayName, natGatewayInstanceStatusCode, pageNo, pageSize, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetNatGatewayInstanceListRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
		sb.append("		natGatewayInstanceNoList: ").append(toIndentedString(natGatewayInstanceNoList)).append("\n");
		sb.append("		publicIp: ").append(toIndentedString(publicIp)).append("\n");
		sb.append("		vpcName: ").append(toIndentedString(vpcName)).append("\n");
		sb.append("		natGatewayName: ").append(toIndentedString(natGatewayName)).append("\n");
		sb.append("		natGatewayInstanceStatusCode: ").append(toIndentedString(natGatewayInstanceStatusCode)).append("\n");
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
