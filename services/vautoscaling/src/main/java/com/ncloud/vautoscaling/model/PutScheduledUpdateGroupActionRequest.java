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

/**
 * PutScheduledUpdateGroupActionRequest
 */
public class PutScheduledUpdateGroupActionRequest {
	private String regionCode = null;

	private String autoScalingGroupNo = null;

	private String scheduledActionNo = null;

	private String scheduledActionName = null;

	private Integer minSize = null;

	private Integer maxSize = null;

	private Integer desiredCapacity = null;

	private String startTime = null;

	private String endTime = null;

	private String recurrence = null;

	private String timeZone = null;

	private String responseFormatType = null;

	public PutScheduledUpdateGroupActionRequest regionCode(String regionCode) {
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

	public PutScheduledUpdateGroupActionRequest autoScalingGroupNo(String autoScalingGroupNo) {
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

	public PutScheduledUpdateGroupActionRequest scheduledActionNo(String scheduledActionNo) {
		this.scheduledActionNo = scheduledActionNo;
		return this;
	}

	 /**
	 * 스케쥴액션번호
	 * @return scheduledActionNo
	**/
	public String getScheduledActionNo() {
		return scheduledActionNo;
	}

	public void setScheduledActionNo(String scheduledActionNo) {
		this.scheduledActionNo = scheduledActionNo;
	}

	public PutScheduledUpdateGroupActionRequest scheduledActionName(String scheduledActionName) {
		this.scheduledActionName = scheduledActionName;
		return this;
	}

	 /**
	 * 스케쥴액션이름
	 * @return scheduledActionName
	**/
	public String getScheduledActionName() {
		return scheduledActionName;
	}

	public void setScheduledActionName(String scheduledActionName) {
		this.scheduledActionName = scheduledActionName;
	}

	public PutScheduledUpdateGroupActionRequest minSize(Integer minSize) {
		this.minSize = minSize;
		return this;
	}

	 /**
	 * 최소용량
	 * @return minSize
	**/
	public Integer getMinSize() {
		return minSize;
	}

	public void setMinSize(Integer minSize) {
		this.minSize = minSize;
	}

	public PutScheduledUpdateGroupActionRequest maxSize(Integer maxSize) {
		this.maxSize = maxSize;
		return this;
	}

	 /**
	 * 최대용량
	 * @return maxSize
	**/
	public Integer getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
	}

	public PutScheduledUpdateGroupActionRequest desiredCapacity(Integer desiredCapacity) {
		this.desiredCapacity = desiredCapacity;
		return this;
	}

	 /**
	 * 기대용량
	 * @return desiredCapacity
	**/
	public Integer getDesiredCapacity() {
		return desiredCapacity;
	}

	public void setDesiredCapacity(Integer desiredCapacity) {
		this.desiredCapacity = desiredCapacity;
	}

	public PutScheduledUpdateGroupActionRequest startTime(String startTime) {
		this.startTime = startTime;
		return this;
	}

	 /**
	 * 스케쥴시작일시
	 * @return startTime
	**/
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public PutScheduledUpdateGroupActionRequest endTime(String endTime) {
		this.endTime = endTime;
		return this;
	}

	 /**
	 * 스케쥴종료일시
	 * @return endTime
	**/
	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public PutScheduledUpdateGroupActionRequest recurrence(String recurrence) {
		this.recurrence = recurrence;
		return this;
	}

	 /**
	 * 반복설정
	 * @return recurrence
	**/
	public String getRecurrence() {
		return recurrence;
	}

	public void setRecurrence(String recurrence) {
		this.recurrence = recurrence;
	}

	public PutScheduledUpdateGroupActionRequest timeZone(String timeZone) {
		this.timeZone = timeZone;
		return this;
	}

	 /**
	 * 타임존
	 * @return timeZone
	**/
	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public PutScheduledUpdateGroupActionRequest responseFormatType(String responseFormatType) {
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
		PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest = (PutScheduledUpdateGroupActionRequest) o;
		return Objects.equals(this.regionCode, putScheduledUpdateGroupActionRequest.regionCode) &&
				Objects.equals(this.autoScalingGroupNo, putScheduledUpdateGroupActionRequest.autoScalingGroupNo) &&
				Objects.equals(this.scheduledActionNo, putScheduledUpdateGroupActionRequest.scheduledActionNo) &&
				Objects.equals(this.scheduledActionName, putScheduledUpdateGroupActionRequest.scheduledActionName) &&
				Objects.equals(this.minSize, putScheduledUpdateGroupActionRequest.minSize) &&
				Objects.equals(this.maxSize, putScheduledUpdateGroupActionRequest.maxSize) &&
				Objects.equals(this.desiredCapacity, putScheduledUpdateGroupActionRequest.desiredCapacity) &&
				Objects.equals(this.startTime, putScheduledUpdateGroupActionRequest.startTime) &&
				Objects.equals(this.endTime, putScheduledUpdateGroupActionRequest.endTime) &&
				Objects.equals(this.recurrence, putScheduledUpdateGroupActionRequest.recurrence) &&
				Objects.equals(this.timeZone, putScheduledUpdateGroupActionRequest.timeZone) &&
				Objects.equals(this.responseFormatType, putScheduledUpdateGroupActionRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, autoScalingGroupNo, scheduledActionNo, scheduledActionName, minSize, maxSize, desiredCapacity, startTime, endTime, recurrence, timeZone, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PutScheduledUpdateGroupActionRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		autoScalingGroupNo: ").append(toIndentedString(autoScalingGroupNo)).append("\n");
		sb.append("		scheduledActionNo: ").append(toIndentedString(scheduledActionNo)).append("\n");
		sb.append("		scheduledActionName: ").append(toIndentedString(scheduledActionName)).append("\n");
		sb.append("		minSize: ").append(toIndentedString(minSize)).append("\n");
		sb.append("		maxSize: ").append(toIndentedString(maxSize)).append("\n");
		sb.append("		desiredCapacity: ").append(toIndentedString(desiredCapacity)).append("\n");
		sb.append("		startTime: ").append(toIndentedString(startTime)).append("\n");
		sb.append("		endTime: ").append(toIndentedString(endTime)).append("\n");
		sb.append("		recurrence: ").append(toIndentedString(recurrence)).append("\n");
		sb.append("		timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

