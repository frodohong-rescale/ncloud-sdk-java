/*
 * monitoring
 * <br/>https://ncloud.apigw.ntruss.com/monitoring/v2
 *
 * OpenAPI spec version: 2020-05-13T08:22:44Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.monitoring.model;

import java.util.Objects;
import com.ncloud.monitoring.model.Metric;
import java.util.ArrayList;
import java.util.List;

/**
 * GetListMetricsResponse
 */
public class GetListMetricsResponse {
	private String requestId = null;

	private String returnCode = null;

	private String returnMessage = null;

	private List<Metric> metrics = null;

	public GetListMetricsResponse requestId(String requestId) {
		this.requestId = requestId;
		return this;
	}

	 /**
	 * Get requestId
	 * @return requestId
	**/
	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public GetListMetricsResponse returnCode(String returnCode) {
		this.returnCode = returnCode;
		return this;
	}

	 /**
	 * Get returnCode
	 * @return returnCode
	**/
	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public GetListMetricsResponse returnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
		return this;
	}

	 /**
	 * Get returnMessage
	 * @return returnMessage
	**/
	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public GetListMetricsResponse metrics(List<Metric> metrics) {
		this.metrics = metrics;
		return this;
	}

	public GetListMetricsResponse addMetricsItem(Metric metricsItem) {
		if (this.metrics == null) {
			this.metrics = new ArrayList<Metric>();
		}
		this.metrics.add(metricsItem);
		return this;
	}

	 /**
	 * Get metrics
	 * @return metrics
	**/
	public List<Metric> getMetrics() {
		return metrics;
	}

	public void setMetrics(List<Metric> metrics) {
		this.metrics = metrics;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetListMetricsResponse getListMetricsResponse = (GetListMetricsResponse) o;
		return Objects.equals(this.requestId, getListMetricsResponse.requestId) &&
				Objects.equals(this.returnCode, getListMetricsResponse.returnCode) &&
				Objects.equals(this.returnMessage, getListMetricsResponse.returnMessage) &&
				Objects.equals(this.metrics, getListMetricsResponse.metrics);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, returnCode, returnMessage, metrics);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetListMetricsResponse {\n");
		
		sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("		returnCode: ").append(toIndentedString(returnCode)).append("\n");
		sb.append("		returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
		sb.append("		metrics: ").append(toIndentedString(metrics)).append("\n");
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

