
# IoOpenshiftConfigV1ClusterVersionStatusHistory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionTime** | **Object** | completionTime, if set, is when the update was fully applied. The update that is currently being applied will have a null completion time. Completion time will always be set for entries that are not the current update (usually to the started time of the next update). | 
**image** | **String** | image is a container image location that contains the update. This value is always populated. | 
**startedTime** | [**OffsetDateTime**](OffsetDateTime.md) | startedTime is the time at which the update was started. | 
**state** | **String** | state reflects whether the update was fully applied. The Partial state indicates the update is not fully applied, while the Completed state indicates the update was successfully rolled out at least once (all parts of the update successfully applied). | 
**verified** | **Boolean** | verified indicates whether the provided update was properly verified before it was installed. If this is false the cluster may not be trusted. | 
**version** | **String** | version is a semantic versioning identifying the update version. If the requested image does not define a version, or if a failure occurs retrieving the image, this value may be empty. |  [optional]



