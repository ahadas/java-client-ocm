
# IoOpenshiftConfigV1ClusterVersionSpecDesiredUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**force** | **Boolean** | force allows an administrator to update to an image that has failed verification, does not appear in the availableUpdates list, or otherwise would be blocked by normal protections on update. This option should only be used when the authenticity of the provided image has been verified out of band because the provided image will run with full administrative access to the cluster. Do not use this flag with images that comes from unknown or potentially malicious sources.   This flag does not override other forms of consistency checking that are required before a new update is deployed. |  [optional]
**image** | **String** | image is a container image location that contains the update. When this field is part of spec, image is optional if version is specified and the availableUpdates field contains a matching version. |  [optional]
**version** | **String** | version is a semantic versioning identifying the update version. When this field is part of spec, version is optional if image is specified. |  [optional]



