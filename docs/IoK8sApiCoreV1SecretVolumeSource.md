
# IoK8sApiCoreV1SecretVolumeSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultMode** | **Integer** | Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set. |  [optional]
**items** | [**List&lt;IoK8sApiCoreV1KeyToPath&gt;**](IoK8sApiCoreV1KeyToPath.md) | If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;. |  [optional]
**optional** | **Boolean** | Specify whether the Secret or its keys must be defined |  [optional]
**secretName** | **String** | Name of the secret in the pod&#39;s namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret |  [optional]



