
# ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCsi

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**driver** | **String** | Driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster. | 
**fsType** | **String** | Filesystem type to mount. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply. |  [optional]
**nodePublishSecretRef** | [**ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCsiNodePublishSecretRef**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCsiNodePublishSecretRef.md) |  |  [optional]
**readOnly** | **Boolean** | Specifies a read-only configuration for the volume. Defaults to false (read/write). |  [optional]
**volumeAttributes** | **Map&lt;String, String&gt;** | VolumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver&#39;s documentation for supported values. |  [optional]



