/*
 * autoscaling
 * <br/>https://ncloud.apigw.ntruss.com/autoscaling/v2
 *
 * OpenAPI spec version: 2018-11-13T06:27:22Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.autoscaling.model;

import java.util.Objects;

/**
 * ConfigurationLog
 */
public class ConfigurationLog {
	private String configurationNo = null;

	private String configurationActionName = null;

	private String parameters = null;

	private String launchConfigurationName = null;

	private String autoScalingGroupName = null;

	private String scheduledActionName = null;

	private String settingTime = null;

	public ConfigurationLog configurationNo(String configurationNo) {
		this.configurationNo = configurationNo;
		return this;
	}

	 /**
	 * 설정번호
	 * @return configurationNo
	**/
	public String getConfigurationNo() {
		return configurationNo;
	}

	public void setConfigurationNo(String configurationNo) {
		this.configurationNo = configurationNo;
	}

	public ConfigurationLog configurationActionName(String configurationActionName) {
		this.configurationActionName = configurationActionName;
		return this;
	}

	 /**
	 * 설정액션명
	 * @return configurationActionName
	**/
	public String getConfigurationActionName() {
		return configurationActionName;
	}

	public void setConfigurationActionName(String configurationActionName) {
		this.configurationActionName = configurationActionName;
	}

	public ConfigurationLog parameters(String parameters) {
		this.parameters = parameters;
		return this;
	}

	 /**
	 * 파라미터
	 * @return parameters
	**/
	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public ConfigurationLog launchConfigurationName(String launchConfigurationName) {
		this.launchConfigurationName = launchConfigurationName;
		return this;
	}

	 /**
	 * 론치설절명
	 * @return launchConfigurationName
	**/
	public String getLaunchConfigurationName() {
		return launchConfigurationName;
	}

	public void setLaunchConfigurationName(String launchConfigurationName) {
		this.launchConfigurationName = launchConfigurationName;
	}

	public ConfigurationLog autoScalingGroupName(String autoScalingGroupName) {
		this.autoScalingGroupName = autoScalingGroupName;
		return this;
	}

	 /**
	 * 오토스케일링그룹명
	 * @return autoScalingGroupName
	**/
	public String getAutoScalingGroupName() {
		return autoScalingGroupName;
	}

	public void setAutoScalingGroupName(String autoScalingGroupName) {
		this.autoScalingGroupName = autoScalingGroupName;
	}

	public ConfigurationLog scheduledActionName(String scheduledActionName) {
		this.scheduledActionName = scheduledActionName;
		return this;
	}

	 /**
	 * 스케쥴액션명
	 * @return scheduledActionName
	**/
	public String getScheduledActionName() {
		return scheduledActionName;
	}

	public void setScheduledActionName(String scheduledActionName) {
		this.scheduledActionName = scheduledActionName;
	}

	public ConfigurationLog settingTime(String settingTime) {
		this.settingTime = settingTime;
		return this;
	}

	 /**
	 * 설정일시
	 * @return settingTime
	**/
	public String getSettingTime() {
		return settingTime;
	}

	public void setSettingTime(String settingTime) {
		this.settingTime = settingTime;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConfigurationLog configurationLog = (ConfigurationLog) o;
		return Objects.equals(this.configurationNo, configurationLog.configurationNo) &&
				Objects.equals(this.configurationActionName, configurationLog.configurationActionName) &&
				Objects.equals(this.parameters, configurationLog.parameters) &&
				Objects.equals(this.launchConfigurationName, configurationLog.launchConfigurationName) &&
				Objects.equals(this.autoScalingGroupName, configurationLog.autoScalingGroupName) &&
				Objects.equals(this.scheduledActionName, configurationLog.scheduledActionName) &&
				Objects.equals(this.settingTime, configurationLog.settingTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(configurationNo, configurationActionName, parameters, launchConfigurationName, autoScalingGroupName, scheduledActionName, settingTime);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConfigurationLog {\n");
		
		sb.append("		configurationNo: ").append(toIndentedString(configurationNo)).append("\n");
		sb.append("		configurationActionName: ").append(toIndentedString(configurationActionName)).append("\n");
		sb.append("		parameters: ").append(toIndentedString(parameters)).append("\n");
		sb.append("		launchConfigurationName: ").append(toIndentedString(launchConfigurationName)).append("\n");
		sb.append("		autoScalingGroupName: ").append(toIndentedString(autoScalingGroupName)).append("\n");
		sb.append("		scheduledActionName: ").append(toIndentedString(scheduledActionName)).append("\n");
		sb.append("		settingTime: ").append(toIndentedString(settingTime)).append("\n");
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
