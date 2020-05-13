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
import com.ncloud.monitoring.model.DataPoint;
import java.util.ArrayList;
import java.util.List;

/**
 * DataPoints
 */
public class DataPoints {
	private String label = null;

	private Double average = null;

	private Double maximum = null;

	private Double minimum = null;

	private Double sum = null;

	private List<DataPoint> dataPointList = null;

	public DataPoints label(String label) {
		this.label = label;
		return this;
	}

	 /**
	 * Get label
	 * @return label
	**/
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public DataPoints average(Double average) {
		this.average = average;
		return this;
	}

	 /**
	 * Get average
	 * @return average
	**/
	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	public DataPoints maximum(Double maximum) {
		this.maximum = maximum;
		return this;
	}

	 /**
	 * Get maximum
	 * @return maximum
	**/
	public Double getMaximum() {
		return maximum;
	}

	public void setMaximum(Double maximum) {
		this.maximum = maximum;
	}

	public DataPoints minimum(Double minimum) {
		this.minimum = minimum;
		return this;
	}

	 /**
	 * Get minimum
	 * @return minimum
	**/
	public Double getMinimum() {
		return minimum;
	}

	public void setMinimum(Double minimum) {
		this.minimum = minimum;
	}

	public DataPoints sum(Double sum) {
		this.sum = sum;
		return this;
	}

	 /**
	 * Get sum
	 * @return sum
	**/
	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public DataPoints dataPointList(List<DataPoint> dataPointList) {
		this.dataPointList = dataPointList;
		return this;
	}

	public DataPoints addDataPointListItem(DataPoint dataPointListItem) {
		if (this.dataPointList == null) {
			this.dataPointList = new ArrayList<DataPoint>();
		}
		this.dataPointList.add(dataPointListItem);
		return this;
	}

	 /**
	 * Get dataPointList
	 * @return dataPointList
	**/
	public List<DataPoint> getDataPointList() {
		return dataPointList;
	}

	public void setDataPointList(List<DataPoint> dataPointList) {
		this.dataPointList = dataPointList;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DataPoints dataPoints = (DataPoints) o;
		return Objects.equals(this.label, dataPoints.label) &&
				Objects.equals(this.average, dataPoints.average) &&
				Objects.equals(this.maximum, dataPoints.maximum) &&
				Objects.equals(this.minimum, dataPoints.minimum) &&
				Objects.equals(this.sum, dataPoints.sum) &&
				Objects.equals(this.dataPointList, dataPoints.dataPointList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(label, average, maximum, minimum, sum, dataPointList);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DataPoints {\n");
		
		sb.append("		label: ").append(toIndentedString(label)).append("\n");
		sb.append("		average: ").append(toIndentedString(average)).append("\n");
		sb.append("		maximum: ").append(toIndentedString(maximum)).append("\n");
		sb.append("		minimum: ").append(toIndentedString(minimum)).append("\n");
		sb.append("		sum: ").append(toIndentedString(sum)).append("\n");
		sb.append("		dataPointList: ").append(toIndentedString(dataPointList)).append("\n");
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

