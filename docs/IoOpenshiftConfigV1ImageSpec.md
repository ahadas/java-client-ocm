
# IoOpenshiftConfigV1ImageSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalTrustedCA** | [**IoOpenshiftConfigV1ImageSpecAdditionalTrustedCA**](IoOpenshiftConfigV1ImageSpecAdditionalTrustedCA.md) |  |  [optional]
**allowedRegistriesForImport** | [**List&lt;IoOpenshiftConfigV1ImageSpecAllowedRegistriesForImport&gt;**](IoOpenshiftConfigV1ImageSpecAllowedRegistriesForImport.md) | allowedRegistriesForImport limits the container image registries that normal users may import images from. Set this list to the registries that you trust to contain valid Docker images and that you want applications to be able to import from. Users with permission to create Images or ImageStreamMappings via the API are not affected by this policy - typically only administrators or system integrations will have those permissions. |  [optional]
**externalRegistryHostnames** | **List&lt;String&gt;** | externalRegistryHostnames provides the hostnames for the default external image registry. The external hostname should be set only when the image registry is exposed externally. The first value is used in &#39;publicDockerImageRepository&#39; field in ImageStreams. The value must be in \&quot;hostname[:port]\&quot; format. |  [optional]
**registrySources** | [**IoOpenshiftConfigV1ImageSpecRegistrySources**](IoOpenshiftConfigV1ImageSpecRegistrySources.md) |  |  [optional]



