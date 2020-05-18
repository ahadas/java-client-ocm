
# IoOpenshiftOperatorV1alpha1ImageContentSourcePolicySpecRepositoryDigestMirrors

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mirrors** | **List&lt;String&gt;** | mirrors is one or more repositories that may also contain the same images. The order of mirrors in this list is treated as the user&#39;s desired priority, while source is by default considered lower priority than all mirrors. Other cluster configuration, including (but not limited to) other repositoryDigestMirrors objects, may impact the exact order mirrors are contacted in, or some mirrors may be contacted in parallel, so this should be considered a preference rather than a guarantee of ordering. |  [optional]
**source** | **String** | source is the repository that users refer to, e.g. in image pull specifications. | 



