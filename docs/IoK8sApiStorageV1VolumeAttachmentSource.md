
# IoK8sApiStorageV1VolumeAttachmentSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inlineVolumeSpec** | [**IoK8sApiCoreV1PersistentVolumeSpec**](IoK8sApiCoreV1PersistentVolumeSpec.md) | inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod&#39;s inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod&#39;s inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature. |  [optional]
**persistentVolumeName** | **String** | Name of the persistent volume to attach. |  [optional]



