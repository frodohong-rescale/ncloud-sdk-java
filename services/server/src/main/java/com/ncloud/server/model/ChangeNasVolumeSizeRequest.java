/*
 * server
 * <br/>https://ncloud.apigw.ntruss.com/server/v2
 *
 * OpenAPI spec version: 2019-10-17T10:28:43Z
 *
 * NBP corp.
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.server.model;

import java.util.Objects;

/**
 * ChangeNasVolumeSizeRequest
 */
public class ChangeNasVolumeSizeRequest {
	private String nasVolumeInstanceNo = null;

	private Integer volumeSize = null;

	private String responseFormatType = null;

	public ChangeNasVolumeSizeRequest nasVolumeInstanceNo(String nasVolumeInstanceNo) {
		this.nasVolumeInstanceNo = nasVolumeInstanceNo;
		return this;
	}

	 /**
	 * NAS볼륨인스턴스번호
	 * @return nasVolumeInstanceNo
	**/
	public String getNasVolumeInstanceNo() {
		return nasVolumeInstanceNo;
	}

	public void setNasVolumeInstanceNo(String nasVolumeInstanceNo) {
		this.nasVolumeInstanceNo = nasVolumeInstanceNo;
	}

	public ChangeNasVolumeSizeRequest volumeSize(Integer volumeSize) {
		this.volumeSize = volumeSize;
		return this;
	}

	 /**
	 * NAS볼륨사이즈
	 * @return volumeSize
	**/
	public Integer getVolumeSize() {
		return volumeSize;
	}

	public void setVolumeSize(Integer volumeSize) {
		this.volumeSize = volumeSize;
	}

	public ChangeNasVolumeSizeRequest responseFormatType(String responseFormatType) {
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
		ChangeNasVolumeSizeRequest changeNasVolumeSizeRequest = (ChangeNasVolumeSizeRequest) o;
		return Objects.equals(this.nasVolumeInstanceNo, changeNasVolumeSizeRequest.nasVolumeInstanceNo) &&
				Objects.equals(this.volumeSize, changeNasVolumeSizeRequest.volumeSize) &&
				Objects.equals(this.responseFormatType, changeNasVolumeSizeRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nasVolumeInstanceNo, volumeSize, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChangeNasVolumeSizeRequest {\n");
		
		sb.append("		nasVolumeInstanceNo: ").append(toIndentedString(nasVolumeInstanceNo)).append("\n");
		sb.append("		volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
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
