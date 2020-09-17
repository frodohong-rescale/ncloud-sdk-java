/*
 * vnas
 * VPC NAS 관련 API<br/>https://ncloud.apigw.ntruss.com/vnas/v2
 *
 * OpenAPI spec version: 2020-09-17T02:28:41Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vnas.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateNasVolumeInstanceRequest
 */
public class CreateNasVolumeInstanceRequest {
	private String regionCode = null;

	private String zoneCode = null;

	private String volumeName = null;

	private Integer volumeSize = null;

	private String volumeAllotmentProtocolTypeCode = null;

	private List<String> serverInstanceNoList = null;

	private String cifsUserName = null;

	private String cifsUserPassword = null;

	private Boolean isEncryptedVolume = null;

	private String nasVolumeDescription = null;

	private String responseFormatType = null;

	public CreateNasVolumeInstanceRequest regionCode(String regionCode) {
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

	public CreateNasVolumeInstanceRequest zoneCode(String zoneCode) {
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

	public CreateNasVolumeInstanceRequest volumeName(String volumeName) {
		this.volumeName = volumeName;
		return this;
	}

	 /**
	 * 볼륨이름
	 * @return volumeName
	**/
	public String getVolumeName() {
		return volumeName;
	}

	public void setVolumeName(String volumeName) {
		this.volumeName = volumeName;
	}

	public CreateNasVolumeInstanceRequest volumeSize(Integer volumeSize) {
		this.volumeSize = volumeSize;
		return this;
	}

	 /**
	 * 볼륨사이즈
	 * @return volumeSize
	**/
	public Integer getVolumeSize() {
		return volumeSize;
	}

	public void setVolumeSize(Integer volumeSize) {
		this.volumeSize = volumeSize;
	}

	public CreateNasVolumeInstanceRequest volumeAllotmentProtocolTypeCode(String volumeAllotmentProtocolTypeCode) {
		this.volumeAllotmentProtocolTypeCode = volumeAllotmentProtocolTypeCode;
		return this;
	}

	 /**
	 * 볼륨할당프로토콜유형코드
	 * @return volumeAllotmentProtocolTypeCode
	**/
	public String getVolumeAllotmentProtocolTypeCode() {
		return volumeAllotmentProtocolTypeCode;
	}

	public void setVolumeAllotmentProtocolTypeCode(String volumeAllotmentProtocolTypeCode) {
		this.volumeAllotmentProtocolTypeCode = volumeAllotmentProtocolTypeCode;
	}

	public CreateNasVolumeInstanceRequest serverInstanceNoList(List<String> serverInstanceNoList) {
		this.serverInstanceNoList = serverInstanceNoList;
		return this;
	}

	public CreateNasVolumeInstanceRequest addServerInstanceNoListItem(String serverInstanceNoListItem) {
		if (this.serverInstanceNoList == null) {
			this.serverInstanceNoList = new ArrayList<String>();
		}
		this.serverInstanceNoList.add(serverInstanceNoListItem);
		return this;
	}

	 /**
	 * 서버인스턴스번호리스트
	 * @return serverInstanceNoList
	**/
	public List<String> getServerInstanceNoList() {
		return serverInstanceNoList;
	}

	public void setServerInstanceNoList(List<String> serverInstanceNoList) {
		this.serverInstanceNoList = serverInstanceNoList;
	}

	public CreateNasVolumeInstanceRequest cifsUserName(String cifsUserName) {
		this.cifsUserName = cifsUserName;
		return this;
	}

	 /**
	 * CIFS유저이름
	 * @return cifsUserName
	**/
	public String getCifsUserName() {
		return cifsUserName;
	}

	public void setCifsUserName(String cifsUserName) {
		this.cifsUserName = cifsUserName;
	}

	public CreateNasVolumeInstanceRequest cifsUserPassword(String cifsUserPassword) {
		this.cifsUserPassword = cifsUserPassword;
		return this;
	}

	 /**
	 * CIFS유저비밀번호
	 * @return cifsUserPassword
	**/
	public String getCifsUserPassword() {
		return cifsUserPassword;
	}

	public void setCifsUserPassword(String cifsUserPassword) {
		this.cifsUserPassword = cifsUserPassword;
	}

	public CreateNasVolumeInstanceRequest isEncryptedVolume(Boolean isEncryptedVolume) {
		this.isEncryptedVolume = isEncryptedVolume;
		return this;
	}

	 /**
	 * 볼륨암호화여부
	 * @return isEncryptedVolume
	**/
	public Boolean isIsEncryptedVolume() {
		return isEncryptedVolume;
	}

	public void setIsEncryptedVolume(Boolean isEncryptedVolume) {
		this.isEncryptedVolume = isEncryptedVolume;
	}

	public CreateNasVolumeInstanceRequest nasVolumeDescription(String nasVolumeDescription) {
		this.nasVolumeDescription = nasVolumeDescription;
		return this;
	}

	 /**
	 * NAS볼륨설명
	 * @return nasVolumeDescription
	**/
	public String getNasVolumeDescription() {
		return nasVolumeDescription;
	}

	public void setNasVolumeDescription(String nasVolumeDescription) {
		this.nasVolumeDescription = nasVolumeDescription;
	}

	public CreateNasVolumeInstanceRequest responseFormatType(String responseFormatType) {
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
		CreateNasVolumeInstanceRequest createNasVolumeInstanceRequest = (CreateNasVolumeInstanceRequest) o;
		return Objects.equals(this.regionCode, createNasVolumeInstanceRequest.regionCode) &&
				Objects.equals(this.zoneCode, createNasVolumeInstanceRequest.zoneCode) &&
				Objects.equals(this.volumeName, createNasVolumeInstanceRequest.volumeName) &&
				Objects.equals(this.volumeSize, createNasVolumeInstanceRequest.volumeSize) &&
				Objects.equals(this.volumeAllotmentProtocolTypeCode, createNasVolumeInstanceRequest.volumeAllotmentProtocolTypeCode) &&
				Objects.equals(this.serverInstanceNoList, createNasVolumeInstanceRequest.serverInstanceNoList) &&
				Objects.equals(this.cifsUserName, createNasVolumeInstanceRequest.cifsUserName) &&
				Objects.equals(this.cifsUserPassword, createNasVolumeInstanceRequest.cifsUserPassword) &&
				Objects.equals(this.isEncryptedVolume, createNasVolumeInstanceRequest.isEncryptedVolume) &&
				Objects.equals(this.nasVolumeDescription, createNasVolumeInstanceRequest.nasVolumeDescription) &&
				Objects.equals(this.responseFormatType, createNasVolumeInstanceRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, zoneCode, volumeName, volumeSize, volumeAllotmentProtocolTypeCode, serverInstanceNoList, cifsUserName, cifsUserPassword, isEncryptedVolume, nasVolumeDescription, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateNasVolumeInstanceRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
		sb.append("		volumeName: ").append(toIndentedString(volumeName)).append("\n");
		sb.append("		volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
		sb.append("		volumeAllotmentProtocolTypeCode: ").append(toIndentedString(volumeAllotmentProtocolTypeCode)).append("\n");
		sb.append("		serverInstanceNoList: ").append(toIndentedString(serverInstanceNoList)).append("\n");
		sb.append("		cifsUserName: ").append(toIndentedString(cifsUserName)).append("\n");
		sb.append("		cifsUserPassword: ").append(toIndentedString(cifsUserPassword)).append("\n");
		sb.append("		isEncryptedVolume: ").append(toIndentedString(isEncryptedVolume)).append("\n");
		sb.append("		nasVolumeDescription: ").append(toIndentedString(nasVolumeDescription)).append("\n");
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
