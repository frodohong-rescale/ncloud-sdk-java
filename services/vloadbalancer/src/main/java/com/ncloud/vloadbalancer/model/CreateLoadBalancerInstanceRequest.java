/*
 * vloadbalancer
 * VPC Load Balancer 관련 API<br/>https://ncloud.apigw.ntruss.com/vloadbalancer/v2
 *
 * OpenAPI spec version: 2020-12-22T09:19:59Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vloadbalancer.model;

import java.util.Objects;
import com.ncloud.vloadbalancer.model.LoadBalancerListenerParameter;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateLoadBalancerInstanceRequest
 */
public class CreateLoadBalancerInstanceRequest {
	private String regionCode = null;

	private Integer idleTimeout = null;

	private String loadBalancerDescription = null;

	private String loadBalancerNetworkTypeCode = null;

	private String loadBalancerTypeCode = null;

	private List<LoadBalancerListenerParameter> loadBalancerListenerList = null;

	private String loadBalancerName = null;

	private String throughputTypeCode = null;

	private String vpcNo = null;

	private List<String> subnetNoList = new ArrayList<String>();

	private String responseFormatType = null;

	public CreateLoadBalancerInstanceRequest regionCode(String regionCode) {
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

	public CreateLoadBalancerInstanceRequest idleTimeout(Integer idleTimeout) {
		this.idleTimeout = idleTimeout;
		return this;
	}

	 /**
	 * 연결타임아웃
	 * @return idleTimeout
	**/
	public Integer getIdleTimeout() {
		return idleTimeout;
	}

	public void setIdleTimeout(Integer idleTimeout) {
		this.idleTimeout = idleTimeout;
	}

	public CreateLoadBalancerInstanceRequest loadBalancerDescription(String loadBalancerDescription) {
		this.loadBalancerDescription = loadBalancerDescription;
		return this;
	}

	 /**
	 * 로드밸런서설명
	 * @return loadBalancerDescription
	**/
	public String getLoadBalancerDescription() {
		return loadBalancerDescription;
	}

	public void setLoadBalancerDescription(String loadBalancerDescription) {
		this.loadBalancerDescription = loadBalancerDescription;
	}

	public CreateLoadBalancerInstanceRequest loadBalancerNetworkTypeCode(String loadBalancerNetworkTypeCode) {
		this.loadBalancerNetworkTypeCode = loadBalancerNetworkTypeCode;
		return this;
	}

	 /**
	 * 로드밸런서네트워크유형코드
	 * @return loadBalancerNetworkTypeCode
	**/
	public String getLoadBalancerNetworkTypeCode() {
		return loadBalancerNetworkTypeCode;
	}

	public void setLoadBalancerNetworkTypeCode(String loadBalancerNetworkTypeCode) {
		this.loadBalancerNetworkTypeCode = loadBalancerNetworkTypeCode;
	}

	public CreateLoadBalancerInstanceRequest loadBalancerTypeCode(String loadBalancerTypeCode) {
		this.loadBalancerTypeCode = loadBalancerTypeCode;
		return this;
	}

	 /**
	 * 로드밸런서유형코드
	 * @return loadBalancerTypeCode
	**/
	public String getLoadBalancerTypeCode() {
		return loadBalancerTypeCode;
	}

	public void setLoadBalancerTypeCode(String loadBalancerTypeCode) {
		this.loadBalancerTypeCode = loadBalancerTypeCode;
	}

	public CreateLoadBalancerInstanceRequest loadBalancerListenerList(List<LoadBalancerListenerParameter> loadBalancerListenerList) {
		this.loadBalancerListenerList = loadBalancerListenerList;
		return this;
	}

	public CreateLoadBalancerInstanceRequest addLoadBalancerListenerListItem(LoadBalancerListenerParameter loadBalancerListenerListItem) {
		if (this.loadBalancerListenerList == null) {
			this.loadBalancerListenerList = new ArrayList<LoadBalancerListenerParameter>();
		}
		this.loadBalancerListenerList.add(loadBalancerListenerListItem);
		return this;
	}

	 /**
	 * 로드밸런서리스너리스트
	 * @return loadBalancerListenerList
	**/
	public List<LoadBalancerListenerParameter> getLoadBalancerListenerList() {
		return loadBalancerListenerList;
	}

	public void setLoadBalancerListenerList(List<LoadBalancerListenerParameter> loadBalancerListenerList) {
		this.loadBalancerListenerList = loadBalancerListenerList;
	}

	public CreateLoadBalancerInstanceRequest loadBalancerName(String loadBalancerName) {
		this.loadBalancerName = loadBalancerName;
		return this;
	}

	 /**
	 * 로드밸런서이름
	 * @return loadBalancerName
	**/
	public String getLoadBalancerName() {
		return loadBalancerName;
	}

	public void setLoadBalancerName(String loadBalancerName) {
		this.loadBalancerName = loadBalancerName;
	}

	public CreateLoadBalancerInstanceRequest throughputTypeCode(String throughputTypeCode) {
		this.throughputTypeCode = throughputTypeCode;
		return this;
	}

	 /**
	 * 부하처리성능유형코드
	 * @return throughputTypeCode
	**/
	public String getThroughputTypeCode() {
		return throughputTypeCode;
	}

	public void setThroughputTypeCode(String throughputTypeCode) {
		this.throughputTypeCode = throughputTypeCode;
	}

	public CreateLoadBalancerInstanceRequest vpcNo(String vpcNo) {
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

	public CreateLoadBalancerInstanceRequest subnetNoList(List<String> subnetNoList) {
		this.subnetNoList = subnetNoList;
		return this;
	}

	public CreateLoadBalancerInstanceRequest addSubnetNoListItem(String subnetNoListItem) {
		this.subnetNoList.add(subnetNoListItem);
		return this;
	}

	 /**
	 * 서브넷번호리스트
	 * @return subnetNoList
	**/
	public List<String> getSubnetNoList() {
		return subnetNoList;
	}

	public void setSubnetNoList(List<String> subnetNoList) {
		this.subnetNoList = subnetNoList;
	}

	public CreateLoadBalancerInstanceRequest responseFormatType(String responseFormatType) {
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
		CreateLoadBalancerInstanceRequest createLoadBalancerInstanceRequest = (CreateLoadBalancerInstanceRequest) o;
		return Objects.equals(this.regionCode, createLoadBalancerInstanceRequest.regionCode) &&
				Objects.equals(this.idleTimeout, createLoadBalancerInstanceRequest.idleTimeout) &&
				Objects.equals(this.loadBalancerDescription, createLoadBalancerInstanceRequest.loadBalancerDescription) &&
				Objects.equals(this.loadBalancerNetworkTypeCode, createLoadBalancerInstanceRequest.loadBalancerNetworkTypeCode) &&
				Objects.equals(this.loadBalancerTypeCode, createLoadBalancerInstanceRequest.loadBalancerTypeCode) &&
				Objects.equals(this.loadBalancerListenerList, createLoadBalancerInstanceRequest.loadBalancerListenerList) &&
				Objects.equals(this.loadBalancerName, createLoadBalancerInstanceRequest.loadBalancerName) &&
				Objects.equals(this.throughputTypeCode, createLoadBalancerInstanceRequest.throughputTypeCode) &&
				Objects.equals(this.vpcNo, createLoadBalancerInstanceRequest.vpcNo) &&
				Objects.equals(this.subnetNoList, createLoadBalancerInstanceRequest.subnetNoList) &&
				Objects.equals(this.responseFormatType, createLoadBalancerInstanceRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regionCode, idleTimeout, loadBalancerDescription, loadBalancerNetworkTypeCode, loadBalancerTypeCode, loadBalancerListenerList, loadBalancerName, throughputTypeCode, vpcNo, subnetNoList, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreateLoadBalancerInstanceRequest {\n");
		
		sb.append("		regionCode: ").append(toIndentedString(regionCode)).append("\n");
		sb.append("		idleTimeout: ").append(toIndentedString(idleTimeout)).append("\n");
		sb.append("		loadBalancerDescription: ").append(toIndentedString(loadBalancerDescription)).append("\n");
		sb.append("		loadBalancerNetworkTypeCode: ").append(toIndentedString(loadBalancerNetworkTypeCode)).append("\n");
		sb.append("		loadBalancerTypeCode: ").append(toIndentedString(loadBalancerTypeCode)).append("\n");
		sb.append("		loadBalancerListenerList: ").append(toIndentedString(loadBalancerListenerList)).append("\n");
		sb.append("		loadBalancerName: ").append(toIndentedString(loadBalancerName)).append("\n");
		sb.append("		throughputTypeCode: ").append(toIndentedString(throughputTypeCode)).append("\n");
		sb.append("		vpcNo: ").append(toIndentedString(vpcNo)).append("\n");
		sb.append("		subnetNoList: ").append(toIndentedString(subnetNoList)).append("\n");
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

