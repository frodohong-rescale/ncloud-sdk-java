/*
 * vserver
 * VPC Compute 관련 API<br/>https://ncloud.apigw.ntruss.com/vserver/v2
 *
 * OpenAPI spec version: 2020-09-17T02:28:03Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vserver.model;

import java.util.Objects;
import com.ncloud.vserver.model.CommonCode;

/**
 * BlockStorageSnapshotInstance
 */
public class BlockStorageSnapshotInstance {
	private String blockStorageSnapshotInstanceNo = null;

	private String blockStorageSnapshotName = null;

	private Long blockStorageSnapshotVolumeSize = null;

	private String originalBlockStorageInstanceNo = null;

	private CommonCode blockStorageSnapshotInstanceStatus = null;

	private CommonCode blockStorageSnapshotInstanceOperation = null;

	private String blockStorageSnapshotInstanceStatusName = null;

	private String createDate = null;

	private Boolean isEncryptedOriginalBlockStorageVolume = null;

	private String blockStorageSnapshotDescription = null;

	public BlockStorageSnapshotInstance blockStorageSnapshotInstanceNo(String blockStorageSnapshotInstanceNo) {
		this.blockStorageSnapshotInstanceNo = blockStorageSnapshotInstanceNo;
		return this;
	}

	 /**
	 * 블록스토리지스냅샷인스턴스번호
	 * @return blockStorageSnapshotInstanceNo
	**/
	public String getBlockStorageSnapshotInstanceNo() {
		return blockStorageSnapshotInstanceNo;
	}

	public void setBlockStorageSnapshotInstanceNo(String blockStorageSnapshotInstanceNo) {
		this.blockStorageSnapshotInstanceNo = blockStorageSnapshotInstanceNo;
	}

	public BlockStorageSnapshotInstance blockStorageSnapshotName(String blockStorageSnapshotName) {
		this.blockStorageSnapshotName = blockStorageSnapshotName;
		return this;
	}

	 /**
	 * 블록스토리지스냅샷이름
	 * @return blockStorageSnapshotName
	**/
	public String getBlockStorageSnapshotName() {
		return blockStorageSnapshotName;
	}

	public void setBlockStorageSnapshotName(String blockStorageSnapshotName) {
		this.blockStorageSnapshotName = blockStorageSnapshotName;
	}

	public BlockStorageSnapshotInstance blockStorageSnapshotVolumeSize(Long blockStorageSnapshotVolumeSize) {
		this.blockStorageSnapshotVolumeSize = blockStorageSnapshotVolumeSize;
		return this;
	}

	 /**
	 * 블록스토리지스냅샷볼륨사이즈
	 * @return blockStorageSnapshotVolumeSize
	**/
	public Long getBlockStorageSnapshotVolumeSize() {
		return blockStorageSnapshotVolumeSize;
	}

	public void setBlockStorageSnapshotVolumeSize(Long blockStorageSnapshotVolumeSize) {
		this.blockStorageSnapshotVolumeSize = blockStorageSnapshotVolumeSize;
	}

	public BlockStorageSnapshotInstance originalBlockStorageInstanceNo(String originalBlockStorageInstanceNo) {
		this.originalBlockStorageInstanceNo = originalBlockStorageInstanceNo;
		return this;
	}

	 /**
	 * 원본블록스토리지인스턴스번호
	 * @return originalBlockStorageInstanceNo
	**/
	public String getOriginalBlockStorageInstanceNo() {
		return originalBlockStorageInstanceNo;
	}

	public void setOriginalBlockStorageInstanceNo(String originalBlockStorageInstanceNo) {
		this.originalBlockStorageInstanceNo = originalBlockStorageInstanceNo;
	}

	public BlockStorageSnapshotInstance blockStorageSnapshotInstanceStatus(CommonCode blockStorageSnapshotInstanceStatus) {
		this.blockStorageSnapshotInstanceStatus = blockStorageSnapshotInstanceStatus;
		return this;
	}

	 /**
	 * 블록스토리지스냅샷인스턴스상태
	 * @return blockStorageSnapshotInstanceStatus
	**/
	public CommonCode getBlockStorageSnapshotInstanceStatus() {
		return blockStorageSnapshotInstanceStatus;
	}

	public void setBlockStorageSnapshotInstanceStatus(CommonCode blockStorageSnapshotInstanceStatus) {
		this.blockStorageSnapshotInstanceStatus = blockStorageSnapshotInstanceStatus;
	}

	public BlockStorageSnapshotInstance blockStorageSnapshotInstanceOperation(CommonCode blockStorageSnapshotInstanceOperation) {
		this.blockStorageSnapshotInstanceOperation = blockStorageSnapshotInstanceOperation;
		return this;
	}

	 /**
	 * 블록스토리지스냅샷인스턴스OP
	 * @return blockStorageSnapshotInstanceOperation
	**/
	public CommonCode getBlockStorageSnapshotInstanceOperation() {
		return blockStorageSnapshotInstanceOperation;
	}

	public void setBlockStorageSnapshotInstanceOperation(CommonCode blockStorageSnapshotInstanceOperation) {
		this.blockStorageSnapshotInstanceOperation = blockStorageSnapshotInstanceOperation;
	}

	public BlockStorageSnapshotInstance blockStorageSnapshotInstanceStatusName(String blockStorageSnapshotInstanceStatusName) {
		this.blockStorageSnapshotInstanceStatusName = blockStorageSnapshotInstanceStatusName;
		return this;
	}

	 /**
	 * 블록스토리지스냅샷인스턴스상태이름
	 * @return blockStorageSnapshotInstanceStatusName
	**/
	public String getBlockStorageSnapshotInstanceStatusName() {
		return blockStorageSnapshotInstanceStatusName;
	}

	public void setBlockStorageSnapshotInstanceStatusName(String blockStorageSnapshotInstanceStatusName) {
		this.blockStorageSnapshotInstanceStatusName = blockStorageSnapshotInstanceStatusName;
	}

	public BlockStorageSnapshotInstance createDate(String createDate) {
		this.createDate = createDate;
		return this;
	}

	 /**
	 * 생성일시
	 * @return createDate
	**/
	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public BlockStorageSnapshotInstance isEncryptedOriginalBlockStorageVolume(Boolean isEncryptedOriginalBlockStorageVolume) {
		this.isEncryptedOriginalBlockStorageVolume = isEncryptedOriginalBlockStorageVolume;
		return this;
	}

	 /**
	 * 원본블록스토리지볼륨암호화여부
	 * @return isEncryptedOriginalBlockStorageVolume
	**/
	public Boolean isIsEncryptedOriginalBlockStorageVolume() {
		return isEncryptedOriginalBlockStorageVolume;
	}

	public void setIsEncryptedOriginalBlockStorageVolume(Boolean isEncryptedOriginalBlockStorageVolume) {
		this.isEncryptedOriginalBlockStorageVolume = isEncryptedOriginalBlockStorageVolume;
	}

	public BlockStorageSnapshotInstance blockStorageSnapshotDescription(String blockStorageSnapshotDescription) {
		this.blockStorageSnapshotDescription = blockStorageSnapshotDescription;
		return this;
	}

	 /**
	 * 블록스토리지스냅샷설명
	 * @return blockStorageSnapshotDescription
	**/
	public String getBlockStorageSnapshotDescription() {
		return blockStorageSnapshotDescription;
	}

	public void setBlockStorageSnapshotDescription(String blockStorageSnapshotDescription) {
		this.blockStorageSnapshotDescription = blockStorageSnapshotDescription;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BlockStorageSnapshotInstance blockStorageSnapshotInstance = (BlockStorageSnapshotInstance) o;
		return Objects.equals(this.blockStorageSnapshotInstanceNo, blockStorageSnapshotInstance.blockStorageSnapshotInstanceNo) &&
				Objects.equals(this.blockStorageSnapshotName, blockStorageSnapshotInstance.blockStorageSnapshotName) &&
				Objects.equals(this.blockStorageSnapshotVolumeSize, blockStorageSnapshotInstance.blockStorageSnapshotVolumeSize) &&
				Objects.equals(this.originalBlockStorageInstanceNo, blockStorageSnapshotInstance.originalBlockStorageInstanceNo) &&
				Objects.equals(this.blockStorageSnapshotInstanceStatus, blockStorageSnapshotInstance.blockStorageSnapshotInstanceStatus) &&
				Objects.equals(this.blockStorageSnapshotInstanceOperation, blockStorageSnapshotInstance.blockStorageSnapshotInstanceOperation) &&
				Objects.equals(this.blockStorageSnapshotInstanceStatusName, blockStorageSnapshotInstance.blockStorageSnapshotInstanceStatusName) &&
				Objects.equals(this.createDate, blockStorageSnapshotInstance.createDate) &&
				Objects.equals(this.isEncryptedOriginalBlockStorageVolume, blockStorageSnapshotInstance.isEncryptedOriginalBlockStorageVolume) &&
				Objects.equals(this.blockStorageSnapshotDescription, blockStorageSnapshotInstance.blockStorageSnapshotDescription);
	}

	@Override
	public int hashCode() {
		return Objects.hash(blockStorageSnapshotInstanceNo, blockStorageSnapshotName, blockStorageSnapshotVolumeSize, originalBlockStorageInstanceNo, blockStorageSnapshotInstanceStatus, blockStorageSnapshotInstanceOperation, blockStorageSnapshotInstanceStatusName, createDate, isEncryptedOriginalBlockStorageVolume, blockStorageSnapshotDescription);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BlockStorageSnapshotInstance {\n");
		
		sb.append("		blockStorageSnapshotInstanceNo: ").append(toIndentedString(blockStorageSnapshotInstanceNo)).append("\n");
		sb.append("		blockStorageSnapshotName: ").append(toIndentedString(blockStorageSnapshotName)).append("\n");
		sb.append("		blockStorageSnapshotVolumeSize: ").append(toIndentedString(blockStorageSnapshotVolumeSize)).append("\n");
		sb.append("		originalBlockStorageInstanceNo: ").append(toIndentedString(originalBlockStorageInstanceNo)).append("\n");
		sb.append("		blockStorageSnapshotInstanceStatus: ").append(toIndentedString(blockStorageSnapshotInstanceStatus)).append("\n");
		sb.append("		blockStorageSnapshotInstanceOperation: ").append(toIndentedString(blockStorageSnapshotInstanceOperation)).append("\n");
		sb.append("		blockStorageSnapshotInstanceStatusName: ").append(toIndentedString(blockStorageSnapshotInstanceStatusName)).append("\n");
		sb.append("		createDate: ").append(toIndentedString(createDate)).append("\n");
		sb.append("		isEncryptedOriginalBlockStorageVolume: ").append(toIndentedString(isEncryptedOriginalBlockStorageVolume)).append("\n");
		sb.append("		blockStorageSnapshotDescription: ").append(toIndentedString(blockStorageSnapshotDescription)).append("\n");
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
