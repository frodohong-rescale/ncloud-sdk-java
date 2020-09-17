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
import com.ncloud.vserver.model.CommonCode;
import java.util.ArrayList;
import java.util.List;

/**
 * ServerInstance
 */
public class ServerInstance {
	private String serverInstanceNo = null;

	private String serverName = null;

	private String serverDescription = null;

	private Integer cpuCount = null;

	private Long memorySize = null;

	private CommonCode platformType = null;

	private String loginKeyName = null;

	private String publicIpInstanceNo = null;

	private String publicIp = null;

	private CommonCode serverInstanceStatus = null;

	private CommonCode serverInstanceOperation = null;

	private String serverInstanceStatusName = null;

	private String createDate = null;

	private String uptime = null;

	private String serverImageProductCode = null;

	private String serverProductCode = null;

	private Boolean isProtectServerTermination = null;

	private String zoneCode = null;

	private String regionCode = null;

	private String vpcNo = null;

	private String subnetNo = null;

	private List<String> networkInterfaceNoList = null;

	private String initScriptNo = null;

	private CommonCode serverInstanceType = null;

	private CommonCode baseBlockStorageDiskType = null;

	private CommonCode baseBlockStorageDiskDetailType = null;

	private String placementGroupNo = null;

	public ServerInstance serverInstanceNo(String serverInstanceNo) {
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

	public ServerInstance serverName(String serverName) {
		this.serverName = serverName;
		return this;
	}

	 /**
	 * 서버이름
	 * @return serverName
	**/
	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public ServerInstance serverDescription(String serverDescription) {
		this.serverDescription = serverDescription;
		return this;
	}

	 /**
	 * 서버설명
	 * @return serverDescription
	**/
	public String getServerDescription() {
		return serverDescription;
	}

	public void setServerDescription(String serverDescription) {
		this.serverDescription = serverDescription;
	}

	public ServerInstance cpuCount(Integer cpuCount) {
		this.cpuCount = cpuCount;
		return this;
	}

	 /**
	 * CPU개수
	 * @return cpuCount
	**/
	public Integer getCpuCount() {
		return cpuCount;
	}

	public void setCpuCount(Integer cpuCount) {
		this.cpuCount = cpuCount;
	}

	public ServerInstance memorySize(Long memorySize) {
		this.memorySize = memorySize;
		return this;
	}

	 /**
	 * 메모리사이즈
	 * @return memorySize
	**/
	public Long getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(Long memorySize) {
		this.memorySize = memorySize;
	}

	public ServerInstance platformType(CommonCode platformType) {
		this.platformType = platformType;
		return this;
	}

	 /**
	 * 플랫폼유형
	 * @return platformType
	**/
	public CommonCode getPlatformType() {
		return platformType;
	}

	public void setPlatformType(CommonCode platformType) {
		this.platformType = platformType;
	}

	public ServerInstance loginKeyName(String loginKeyName) {
		this.loginKeyName = loginKeyName;
		return this;
	}

	 /**
	 * 로그인키이름
	 * @return loginKeyName
	**/
	public String getLoginKeyName() {
		return loginKeyName;
	}

	public void setLoginKeyName(String loginKeyName) {
		this.loginKeyName = loginKeyName;
	}

	public ServerInstance publicIpInstanceNo(String publicIpInstanceNo) {
		this.publicIpInstanceNo = publicIpInstanceNo;
		return this;
	}

	 /**
	 * 공인IP인스턴스번호
	 * @return publicIpInstanceNo
	**/
	public String getPublicIpInstanceNo() {
		return publicIpInstanceNo;
	}

	public void setPublicIpInstanceNo(String publicIpInstanceNo) {
		this.publicIpInstanceNo = publicIpInstanceNo;
	}

	public ServerInstance publicIp(String publicIp) {
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

	public ServerInstance serverInstanceStatus(CommonCode serverInstanceStatus) {
		this.serverInstanceStatus = serverInstanceStatus;
		return this;
	}

	 /**
	 * 서버인스턴스상태
	 * @return serverInstanceStatus
	**/
	public CommonCode getServerInstanceStatus() {
		return serverInstanceStatus;
	}

	public void setServerInstanceStatus(CommonCode serverInstanceStatus) {
		this.serverInstanceStatus = serverInstanceStatus;
	}

	public ServerInstance serverInstanceOperation(CommonCode serverInstanceOperation) {
		this.serverInstanceOperation = serverInstanceOperation;
		return this;
	}

	 /**
	 * 서버인스턴스OP
	 * @return serverInstanceOperation
	**/
	public CommonCode getServerInstanceOperation() {
		return serverInstanceOperation;
	}

	public void setServerInstanceOperation(CommonCode serverInstanceOperation) {
		this.serverInstanceOperation = serverInstanceOperation;
	}

	public ServerInstance serverInstanceStatusName(String serverInstanceStatusName) {
		this.serverInstanceStatusName = serverInstanceStatusName;
		return this;
	}

	 /**
	 * 서버인스턴스상태이름
	 * @return serverInstanceStatusName
	**/
	public String getServerInstanceStatusName() {
		return serverInstanceStatusName;
	}

	public void setServerInstanceStatusName(String serverInstanceStatusName) {
		this.serverInstanceStatusName = serverInstanceStatusName;
	}

	public ServerInstance createDate(String createDate) {
		this.createDate = createDate;
		return this;
	}

	 /**
	 * 생성일시
	 * @return createDate
	**/
	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public ServerInstance uptime(String uptime) {
		this.uptime = uptime;
		return this;
	}

	 /**
	 * 업시간
	 * @return uptime
	**/
	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	public ServerInstance serverImageProductCode(String serverImageProductCode) {
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

	public ServerInstance serverProductCode(String serverProductCode) {
		this.serverProductCode = serverProductCode;
		return this;
	}

	 /**
	 * 서버상품코드
	 * @return serverProductCode
	**/
	public String getServerProductCode() {
		return serverProductCode;
	}

	public void setServerProductCode(String serverProductCode) {
		this.serverProductCode = serverProductCode;
	}

	public ServerInstance isProtectServerTermination(Boolean isProtectServerTermination) {
		this.isProtectServerTermination = isProtectServerTermination;
		return this;
	}

	 /**
	 * 서버반납보호설정여부
	 * @return isProtectServerTermination
	**/
	public Boolean isIsProtectServerTermination() {
		return isProtectServerTermination;
	}

	public void setIsProtectServerTermination(Boolean isProtectServerTermination) {
		this.isProtectServerTermination = isProtectServerTermination;
	}

	public ServerInstance zoneCode(String zoneCode) {
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

	public ServerInstance regionCode(String regionCode) {
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

	public ServerInstance vpcNo(String vpcNo) {
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

	public ServerInstance subnetNo(String subnetNo) {
		this.subnetNo = subnetNo;
		return this;
	}

	 /**
	 * 서브넷번호
	 * @return subnetNo
	**/
	public String getSubnetNo() {
		return subnetNo;
	}

	public void setSubnetNo(String subnetNo) {
		this.subnetNo = subnetNo;
	}

	public ServerInstance networkInterfaceNoList(List<String> networkInterfaceNoList) {
		this.networkInterfaceNoList = networkInterfaceNoList;
		return this;
	}

	public ServerInstance addNetworkInterfaceNoListItem(String networkInterfaceNoListItem) {
		if (this.networkInterfaceNoList == null) {
			this.networkInterfaceNoList = new ArrayList<String>();
		}
		this.networkInterfaceNoList.add(networkInterfaceNoListItem);
		return this;
	}

	 /**
	 * 네트워크인터페이스번호리스트
	 * @return networkInterfaceNoList
	**/
	public List<String> getNetworkInterfaceNoList() {
		return networkInterfaceNoList;
	}

	public void setNetworkInterfaceNoList(List<String> networkInterfaceNoList) {
		this.networkInterfaceNoList = networkInterfaceNoList;
	}

	public ServerInstance initScriptNo(String initScriptNo) {
		this.initScriptNo = initScriptNo;
		return this;
	}

	 /**
	 * 초기화스크립트번호
	 * @return initScriptNo
	**/
	public String getInitScriptNo() {
		return initScriptNo;
	}

	public void setInitScriptNo(String initScriptNo) {
		this.initScriptNo = initScriptNo;
	}

	public ServerInstance serverInstanceType(CommonCode serverInstanceType) {
		this.serverInstanceType = serverInstanceType;
		return this;
	}

	 /**
	 * 서버인스턴스유형
	 * @return serverInstanceType
	**/
	public CommonCode getServerInstanceType() {
		return serverInstanceType;
	}

	public void setServerInstanceType(CommonCode serverInstanceType) {
		this.serverInstanceType = serverInstanceType;
	}

	public ServerInstance baseBlockStorageDiskType(CommonCode baseBlockStorageDiskType) {
		this.baseBlockStorageDiskType = baseBlockStorageDiskType;
		return this;
	}

	 /**
	 * 기본블록스토리지디스크유형
	 * @return baseBlockStorageDiskType
	**/
	public CommonCode getBaseBlockStorageDiskType() {
		return baseBlockStorageDiskType;
	}

	public void setBaseBlockStorageDiskType(CommonCode baseBlockStorageDiskType) {
		this.baseBlockStorageDiskType = baseBlockStorageDiskType;
	}

	public ServerInstance baseBlockStorageDiskDetailType(CommonCode baseBlockStorageDiskDetailType) {
		this.baseBlockStorageDiskDetailType = baseBlockStorageDiskDetailType;
		return this;
	}

	 /**
	 * 기본블록스토리지디스크상세유형
	 * @return baseBlockStorageDiskDetailType
	**/
	public CommonCode getBaseBlockStorageDiskDetailType() {
		return baseBlockStorageDiskDetailType;
	}

	public void setBaseBlockStorageDiskDetailType(CommonCode baseBlockStorageDiskDetailType) {
		this.baseBlockStorageDiskDetailType = baseBlockStorageDiskDetailType;
	}

	public ServerInstance placementGroupNo(String placementGroupNo) {
		this.placementGroupNo = placementGroupNo;
		return this;
	}

	 /**
	 * 물리배치그룹번호
	 * @return placementGroupNo
	**/
	public String getPlacementGroupNo() {
		return placementGroupNo;
	}

	public void setPlacementGroupNo(String placementGroupNo) {
		this.placementGroupNo = placementGroupNo;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ServerInstance serverInstance = (ServerInstance) o;
		return Objects.equals(this.serverInstanceNo, serverInstance.serverInstanceNo) &&
				Objects.equals(this.serverName, serverInstance.serverName) &&
				Objects.equals(this.serverDescription, serverInstance.serverDescription) &&
				Objects.equals(this.cpuCount, serverInstance.cpuCount) &&
				Objects.equals(this.memorySize, serverInstance.memorySize) &&
				Objects.equals(this.platformType, serverInstance.platformType) &&
				Objects.equals(this.loginKeyName, serverInstance.loginKeyName) &&
				Objects.equals(this.publicIpInstanceNo, serverInstance.publicIpInstanceNo) &&
				Objects.equals(this.publicIp, serverInstance.publicIp) &&
				Objects.equals(this.serverInstanceStatus, serverInstance.serverInstanceStatus) &&
				Objects.equals(this.serverInstanceOperation, serverInstance.serverInstanceOperation) &&
				Objects.equals(this.serverInstanceStatusName, serverInstance.serverInstanceStatusName) &&
				Objects.equals(this.createDate, serverInstance.createDate) &&
				Objects.equals(this.uptime, serverInstance.uptime) &&
				Objects.equals(this.serverImageProductCode, serverInstance.serverImageProductCode) &&
				Objects.equals(this.serverProductCode, serverInstance.serverProductCode) &&
				Objects.equals(this.isProtectServerTermination, serverInstance.isProtectServerTermination) &&
				Objects.equals(this.zoneCode, serverInstance.zoneCode) &&
				Objects.equals(this.regionCode, serverInstance.regionCode) &&
				Objects.equals(this.vpcNo, serverInstance.vpcNo) &&
				Objects.equals(this.subnetNo, serverInstance.subnetNo) &&
				Objects.equals(this.networkInterfaceNoList, serverInstance.networkInterfaceNoList) &&
				Objects.equals(this.initScriptNo, serverInstance.initScriptNo) &&
				Objects.equals(this.serverInstanceType, serverInstance.serverInstanceType) &&
				Objects.equals(this.baseBlockStorageDiskType, serverInstance.baseBlockStorageDiskType) &&
				Objects.equals(this.baseBlockStorageDiskDetailType, serverInstance.baseBlockStorageDiskDetailType) &&
				Objects.equals(this.placementGroupNo, serverInstance.placementGroupNo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(serverInstanceNo, serverName, serverDescription, cpuCount, memorySize, platformType, loginKeyName, publicIpInstanceNo, publicIp, serverInstanceStatus, serverInstanceOperation, serverInstanceStatusName, createDate, uptime, serverImageProductCode, serverProductCode, isProtectServerTermination, zoneCode, regionCode, vpcNo, subnetNo, networkInterfaceNoList, initScriptNo, serverInstanceType, baseBlockStorageDiskType, baseBlockStorageDiskDetailType, placementGroupNo);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServerInstance {\n");
		
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
		sb.append("		serverName: ").append(toIndentedString(serverName)).append("\n");
		sb.append("		serverDescription: ").append(toIndentedString(serverDescription)).append("\n");
		sb.append("		cpuCount: ").append(toIndentedString(cpuCount)).append("\n");
		sb.append("		memorySize: ").append(toIndentedString(memorySize)).append("\n");
		sb.append("		platformType: ").append(toIndentedString(platformType)).append("\n");
		sb.append("		loginKeyName: ").append(toIndentedString(loginKeyName)).append("\n");
		sb.append("		publicIpInstanceNo: ").append(toIndentedString(publicIpInstanceNo)).append("\n");
		sb.append("		publicIp: ").append(toIndentedString(publicIp)).append("\n");
		sb.append("		serverInstanceStatus: ").append(toIndentedString(serverInstanceStatus)).append("\n");
		sb.append("		serverInstanceOperation: ").append(toIndentedString(serverInstanceOperation)).append("\n");
		sb.append("		serverInstanceStatusName: ").append(toIndentedString(serverInstanceStatusName)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
		sb.append("		uptime: ").append(toIndentedString(uptime)).append("\n");
		sb.append("		serverImageProductCode: ").append(toIndentedString(serverImageProductCode)).append("\n");
		sb.append("		serverProductCode: ").append(toIndentedString(serverProductCode)).append("\n");
		sb.append("		isProtectServerTermination: ").append(toIndentedString(isProtectServerTermination)).append("\n");
		sb.append("		zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
		sb.append("		subnetNo: ").append(toIndentedString(subnetNo)).append("\n");
		sb.append("		networkInterfaceNoList: ").append(toIndentedString(networkInterfaceNoList)).append("\n");
		sb.append("		initScriptNo: ").append(toIndentedString(initScriptNo)).append("\n");
		sb.append("		serverInstanceType: ").append(toIndentedString(serverInstanceType)).append("\n");
		sb.append("		baseBlockStorageDiskType: ").append(toIndentedString(baseBlockStorageDiskType)).append("\n");
		sb.append("		baseBlockStorageDiskDetailType: ").append(toIndentedString(baseBlockStorageDiskDetailType)).append("\n");
		sb.append("		placementGroupNo: ").append(toIndentedString(placementGroupNo)).append("\n");
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
