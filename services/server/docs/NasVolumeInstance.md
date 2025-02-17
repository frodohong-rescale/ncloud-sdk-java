
# NasVolumeInstance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nasVolumeInstanceNo** | **String** | NAS볼륨인스턴스번호 |  [optional]
**nasVolumeInstanceStatus** | [**CommonCode**](CommonCode.md) | NAS볼륨인스턴스상태 |  [optional]
**nasVolumeInstanceOperation** | [**CommonCode**](CommonCode.md) | NAS볼륨인스턴스OP |  [optional]
**nasVolumeInstanceStatusName** | **String** | 볼륨인스턴스상태명 |  [optional]
**createDate** | **String** | 생성일시 |  [optional]
**nasVolumeInstanceDescription** | **String** | NAS볼륨인스턴스설명 |  [optional]
**mountInformation** | **String** | 마운트정보 |  [optional]
**volumeAllotmentProtocolType** | [**CommonCode**](CommonCode.md) | 볼륨할당프로토콜구분 |  [optional]
**volumeName** | **String** | 볼륨명 |  [optional]
**volumeTotalSize** | **Long** | 볼륨총사이즈 |  [optional]
**volumeSize** | **Long** | 볼륨사이즈 |  [optional]
**volumeUseSize** | **Long** | 볼륨사용사이즈 |  [optional]
**volumeUseRatio** | **Float** | 볼륨사용비율 |  [optional]
**snapshotVolumeConfigurationRatio** | **Float** | 스냅샷볼륨설정비율 |  [optional]
**snapshotVolumeConfigPeriodType** | [**CommonCode**](CommonCode.md) | 스냅샷볼륨설정기간구분 |  [optional]
**snapshotVolumeConfigTime** | **Integer** | 스냅샷볼륨설정시간 |  [optional]
**snapshotVolumeSize** | **Long** | 스냅샷사이즈 |  [optional]
**snapshotVolumeUseSize** | **Long** | 스냅사용사이즈 |  [optional]
**snapshotVolumeUseRatio** | **Float** | 스냅샷사용비율 |  [optional]
**isSnapshotConfiguration** | **Boolean** | 스냅샷설정여부 |  [optional]
**isEventConfiguration** | **Boolean** | 이벤트설정여부 |  [optional]
**region** | [**Region**](Region.md) | 리전 |  [optional]
**zone** | [**Zone**](Zone.md) | ZONE |  [optional]
**isReturnProtection** | **Boolean** | 반납보호여부 |  [optional]
**nasVolumeInstanceCustomIpList** | [**List&lt;NasVolumeInstanceCustomIp&gt;**](NasVolumeInstanceCustomIp.md) | NAS볼륨커스텀IP리스트 |  [optional]
**nasVolumeServerInstanceList** | [**List&lt;ServerInstance&gt;**](ServerInstance.md) | NAS볼륨서버인스턴스리스트 |  [optional]



