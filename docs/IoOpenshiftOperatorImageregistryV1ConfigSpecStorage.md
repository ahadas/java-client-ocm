
# IoOpenshiftOperatorImageregistryV1ConfigSpecStorage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**azure** | [**IoOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure**](IoOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure.md) |  |  [optional]
**emptyDir** | **Object** | emptyDir represents ephemeral storage on the pod&#39;s host node. WARNING: this storage cannot be used with more than 1 replica and is not suitable for production use. When the pod is removed from a node for any reason, the data in the emptyDir is deleted forever. |  [optional]
**gcs** | [**IoOpenshiftOperatorImageregistryV1ConfigSpecStorageGcs**](IoOpenshiftOperatorImageregistryV1ConfigSpecStorageGcs.md) |  |  [optional]
**pvc** | [**IoOpenshiftOperatorImageregistryV1ConfigSpecStoragePvc**](IoOpenshiftOperatorImageregistryV1ConfigSpecStoragePvc.md) |  |  [optional]
**s3** | [**IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3**](IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3.md) |  |  [optional]
**swift** | [**IoOpenshiftOperatorImageregistryV1ConfigSpecStorageSwift**](IoOpenshiftOperatorImageregistryV1ConfigSpecStorageSwift.md) |  |  [optional]



