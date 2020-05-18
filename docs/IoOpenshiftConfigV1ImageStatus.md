
# IoOpenshiftConfigV1ImageStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**externalRegistryHostnames** | **List&lt;String&gt;** | externalRegistryHostnames provides the hostnames for the default external image registry. The external hostname should be set only when the image registry is exposed externally. The first value is used in &#39;publicDockerImageRepository&#39; field in ImageStreams. The value must be in \&quot;hostname[:port]\&quot; format. |  [optional]
**internalRegistryHostname** | **String** | internalRegistryHostname sets the hostname for the default internal image registry. The value must be in \&quot;hostname[:port]\&quot; format. This value is set by the image registry operator which controls the internal registry hostname. For backward compatibility, users can still use OPENSHIFT_DEFAULT_REGISTRY environment variable but this setting overrides the environment variable. |  [optional]



