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
 * AdjustmentType
 */
public class AdjustmentType {
	private String code = null;

	private String codeName = null;

	public AdjustmentType code(String code) {
		this.code = code;
		return this;
	}

	 /**
	 * 코드
	 * @return code
	**/
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public AdjustmentType codeName(String codeName) {
		this.codeName = codeName;
		return this;
	}

	 /**
	 * 코드이름
	 * @return codeName
	**/
	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AdjustmentType adjustmentType = (AdjustmentType) o;
		return Objects.equals(this.code, adjustmentType.code) &&
				Objects.equals(this.codeName, adjustmentType.codeName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, codeName);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AdjustmentType {\n");
		
		sb.append("		code: ").append(toIndentedString(code)).append("\n");
		sb.append("		codeName: ").append(toIndentedString(codeName)).append("\n");
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
