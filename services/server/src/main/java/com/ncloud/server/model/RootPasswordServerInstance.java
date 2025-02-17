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
 * RootPasswordServerInstance
 */
public class RootPasswordServerInstance {
	private String serverInstanceNo = null;

	private String rootPassword = null;

	public RootPasswordServerInstance serverInstanceNo(String serverInstanceNo) {
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

	public RootPasswordServerInstance rootPassword(String rootPassword) {
		this.rootPassword = rootPassword;
		return this;
	}

	 /**
	 * 루트패스워드
	 * @return rootPassword
	**/
	public String getRootPassword() {
		return rootPassword;
	}

	public void setRootPassword(String rootPassword) {
		this.rootPassword = rootPassword;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RootPasswordServerInstance rootPasswordServerInstance = (RootPasswordServerInstance) o;
		return Objects.equals(this.serverInstanceNo, rootPasswordServerInstance.serverInstanceNo) &&
				Objects.equals(this.rootPassword, rootPasswordServerInstance.rootPassword);
	}

	@Override
	public int hashCode() {
		return Objects.hash(serverInstanceNo, rootPassword);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RootPasswordServerInstance {\n");
		
		sb.append("		serverInstanceNo: ").append(toIndentedString(serverInstanceNo)).append("\n");
		sb.append("		rootPassword: ").append(toIndentedString(rootPassword)).append("\n");
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

