
# IoK8sApiCoreV1PersistentVolumeClaimStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessModes** | **List&lt;String&gt;** | AccessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 |  [optional]
**capacity** | **Map&lt;String, String&gt;** | Represents the actual resources of the underlying volume. |  [optional]
**conditions** | [**List&lt;IoK8sApiCoreV1PersistentVolumeClaimCondition&gt;**](IoK8sApiCoreV1PersistentVolumeClaimCondition.md) | Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to &#39;ResizeStarted&#39;. |  [optional]
**phase** | **String** | Phase represents the current phase of PersistentVolumeClaim. |  [optional]



