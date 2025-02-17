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
 * CreateNetworkInterfaceRequest
 */
public class CreateNetworkInterfaceRequest {
	private String privateSubnetInstanceNo = null;

	private String networkInterfaceName = null;

	private String networkInterfaceIp = null;

	private String networkInterfaceDescription = null;

	private String regionNo = null;

	private String zoneNo = null;

	private String serverInstanceNo = null;

	public CreateNetworkInterfaceRequest privateSubnetInstanceNo(String privateSubnetInstanceNo) {
		this.privateSubnetInstanceNo = privateSubnetInstanceNo;
		return this;
	}

	 /**
	 * Private Subnet인스턴스번호
	 * @return privateSubnetInstanceNo
	**/
	public String getPrivateSubnetInstanceNo() {
		return privateSubnetInstanceNo;
	}

	public void setPrivateSubnetInstanceNo(String privateSubnetInstanceNo) {
		this.privateSubnetInstanceNo = privateSubnetInstanceNo;
	}

	public CreateNetworkInterfaceRequest networkInterfaceName(String networkInterfaceName) {
		this.networkInterfaceName = networkInterfaceName;
		return this;
	}

	 /**
	 * Network Interface이름
	 * @return networkInterfaceName
	**/
	public String getNetworkInterfaceName() {
		return networkInterfaceName;
	}

	public void setNetworkInterfaceName(String networkInterfaceName) {
		this.networkInterfaceName = networkInterfaceName;
	}

	public CreateNetworkInterfaceRequest networkInterfaceIp(String networkInterfaceIp) {
		this.networkInterfaceIp = networkInterfaceIp;
		return this;
	}

	 /**
	 * Network Interface IP
	 * @return networkInterfaceIp
	**/
	public String getNetworkInterfaceIp() {
		return networkInterfaceIp;
	}

	public void setNetworkInterfaceIp(String networkInterfaceIp) {
		this.networkInterfaceIp = networkInterfaceIp;
	}

	public CreateNetworkInterfaceRequest networkInterfaceDescription(String networkInterfaceDescription) {
		this.networkInterfaceDescription = networkInterfaceDescription;
		return this;
	}

	 /**
	 * Network Interface설명
	 * @return networkInterfaceDescription
	**/
	public String getNetworkInterfaceDescription() {
		return networkInterfaceDescription;
	}

	public void setNetworkInterfaceDescription(String networkInterfaceDescription) {
		this.networkInterfaceDescription = networkInterfaceDescription;
	}

	public CreateNetworkInterfaceRequest regionNo(String regionNo) {
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

	public CreateNetworkInterfaceRequest zoneNo(String zoneNo) {
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

	public CreateNetworkInterfaceRequest serverInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
		return this;
	}

	 /**
	 * 서버인스턴스번호
	 * @return serverInstanceNo
	**/
	public String getServerInstanceNo() {
		return serverInstanceNo;
	}

	public void setServerInstanceNo(String serverInstanceNo) {
		this.serverInstanceNo = serverInstanceNo;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreateNetworkInterfaceRequest createNetworkInterfaceRequest = (CreateNetworkInterfaceRequest) o;
		return Objects.equals(this.privateSubnetInstanceNo, createNetworkInterfaceRequest.privateSubnetInstanceNo) &&
				Objects.equals(this.networkInterfaceName, createNetworkInterfaceRequest.networkInterfaceName) &&
				Objects.equals(this.networkInterfaceIp, createNetworkInterfaceRequest.networkInterfaceIp) &&
				Objects.equals(this.networkInterfaceDescription, createNetworkInterfaceRequest.networkInterfaceDescription) &&
				Objects.equals(this.regionNo, createNetworkInterfaceRequest.regionNo) &&
				Objects.equals(this.zoneNo, createNetworkInterfaceRequest.zoneNo) &&
				Objects.equals(this.serverInstanceNo, createNetworkInterfaceRequest.serverInstanceNo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(privateSubnetInstanceNo, networkInterfaceName, networkInterfaceIp, networkInterfaceDescription, regionNo, zoneNo, serverInstanceNo);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateNetworkInterfaceRequest {\n");
		
		sb.append("		privateSubnetInstanceNo: ").append(toIndentedString(privateSubnetInstanceNo)).append("\n");
		sb.append("		networkInterfaceName: ").append(toIndentedString(networkInterfaceName)).append("\n");
		sb.append("		networkInterfaceIp: ").append(toIndentedString(networkInterfaceIp)).append("\n");
		sb.append("		networkInterfaceDescription: ").append(toIndentedString(networkInterfaceDescription)).append("\n");
		sb.append("		regionNo: ").append(toIndentedString(regionNo)).append("\n");
		sb.append("		zoneNo: ").append(toIndentedString(zoneNo)).append("\n");
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
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

