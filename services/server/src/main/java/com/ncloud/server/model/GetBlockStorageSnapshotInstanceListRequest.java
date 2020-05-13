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
import java.util.ArrayList;
import java.util.List;

/**
 * GetBlockStorageSnapshotInstanceListRequest
 */
public class GetBlockStorageSnapshotInstanceListRequest {
	private List<String> blockStorageSnapshotInstanceNoList = null;

	private List<String> originalBlockStorageInstanceNoList = null;

	private Integer pageNo = null;

	private Integer pageSize = null;

	private String regionNo = null;

	private String responseFormatType = null;

	public GetBlockStorageSnapshotInstanceListRequest blockStorageSnapshotInstanceNoList(List<String> blockStorageSnapshotInstanceNoList) {
		this.blockStorageSnapshotInstanceNoList = blockStorageSnapshotInstanceNoList;
		return this;
	}

	public GetBlockStorageSnapshotInstanceListRequest addBlockStorageSnapshotInstanceNoListItem(String blockStorageSnapshotInstanceNoListItem) {
		if (this.blockStorageSnapshotInstanceNoList == null) {
			this.blockStorageSnapshotInstanceNoList = new ArrayList<String>();
		}
		this.blockStorageSnapshotInstanceNoList.add(blockStorageSnapshotInstanceNoListItem);
		return this;
	}

	 /**
	 * 블록스토리지스냅샷인스턴스번호리스트
	 * @return blockStorageSnapshotInstanceNoList
	**/
	public List<String> getBlockStorageSnapshotInstanceNoList() {
		return blockStorageSnapshotInstanceNoList;
	}

	public void setBlockStorageSnapshotInstanceNoList(List<String> blockStorageSnapshotInstanceNoList) {
		this.blockStorageSnapshotInstanceNoList = blockStorageSnapshotInstanceNoList;
	}

	public GetBlockStorageSnapshotInstanceListRequest originalBlockStorageInstanceNoList(List<String> originalBlockStorageInstanceNoList) {
		this.originalBlockStorageInstanceNoList = originalBlockStorageInstanceNoList;
		return this;
	}

	public GetBlockStorageSnapshotInstanceListRequest addOriginalBlockStorageInstanceNoListItem(String originalBlockStorageInstanceNoListItem) {
		if (this.originalBlockStorageInstanceNoList == null) {
			this.originalBlockStorageInstanceNoList = new ArrayList<String>();
		}
		this.originalBlockStorageInstanceNoList.add(originalBlockStorageInstanceNoListItem);
		return this;
	}

	 /**
	 * 원본블록스토리지인스턴스번호리스트
	 * @return originalBlockStorageInstanceNoList
	**/
	public List<String> getOriginalBlockStorageInstanceNoList() {
		return originalBlockStorageInstanceNoList;
	}

	public void setOriginalBlockStorageInstanceNoList(List<String> originalBlockStorageInstanceNoList) {
		this.originalBlockStorageInstanceNoList = originalBlockStorageInstanceNoList;
	}

	public GetBlockStorageSnapshotInstanceListRequest pageNo(Integer pageNo) {
		this.pageNo = pageNo;
		return this;
	}

	 /**
	 * 페이지번호
	 * @return pageNo
	**/
	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public GetBlockStorageSnapshotInstanceListRequest pageSize(Integer pageSize) {
		this.pageSize = pageSize;
		return this;
	}

	 /**
	 * 페이지사이즈
	 * @return pageSize
	**/
	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetBlockStorageSnapshotInstanceListRequest regionNo(String regionNo) {
		this.regionNo = regionNo;
		return this;
	}

	 /**
	 * 리전번호
	 * @return regionNo
	**/
	public String getRegionNo() {
		return regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
	}

	public GetBlockStorageSnapshotInstanceListRequest responseFormatType(String responseFormatType) {
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
		GetBlockStorageSnapshotInstanceListRequest getBlockStorageSnapshotInstanceListRequest = (GetBlockStorageSnapshotInstanceListRequest) o;
		return Objects.equals(this.blockStorageSnapshotInstanceNoList, getBlockStorageSnapshotInstanceListRequest.blockStorageSnapshotInstanceNoList) &&
				Objects.equals(this.originalBlockStorageInstanceNoList, getBlockStorageSnapshotInstanceListRequest.originalBlockStorageInstanceNoList) &&
				Objects.equals(this.pageNo, getBlockStorageSnapshotInstanceListRequest.pageNo) &&
				Objects.equals(this.pageSize, getBlockStorageSnapshotInstanceListRequest.pageSize) &&
				Objects.equals(this.regionNo, getBlockStorageSnapshotInstanceListRequest.regionNo) &&
				Objects.equals(this.responseFormatType, getBlockStorageSnapshotInstanceListRequest.responseFormatType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(blockStorageSnapshotInstanceNoList, originalBlockStorageInstanceNoList, pageNo, pageSize, regionNo, responseFormatType);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetBlockStorageSnapshotInstanceListRequest {\n");
		
		sb.append("		blockStorageSnapshotInstanceNoList: ").append(toIndentedString(blockStorageSnapshotInstanceNoList)).append("\n");
		sb.append("		originalBlockStorageInstanceNoList: ").append(toIndentedString(originalBlockStorageInstanceNoList)).append("\n");
		sb.append("		pageNo: ").append(toIndentedString(pageNo)).append("\n");
		sb.append("		pageSize: ").append(toIndentedString(pageSize)).append("\n");
		sb.append("		regionNo: ").append(toIndentedString(regionNo)).append("\n");
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
