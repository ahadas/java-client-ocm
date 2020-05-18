
# IoOpenshiftOperatorSamplesV1ConfigStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**architectures** | **List&lt;String&gt;** | architectures determine which hardware architecture(s) to install, where x86_64 and ppc64le are the supported choices. |  [optional]
**conditions** | [**List&lt;IoOpenshiftOperatorSamplesV1ConfigStatusConditions&gt;**](IoOpenshiftOperatorSamplesV1ConfigStatusConditions.md) | conditions represents the available maintenance status of the sample imagestreams and templates. |  [optional]
**managementState** | **String** | managementState reflects the current operational status of the on/off switch for the operator.  This operator compares the ManagementState as part of determining that we are turning the operator back on (i.e. \&quot;Managed\&quot;) when it was previously \&quot;Unmanaged\&quot;. |  [optional]
**samplesRegistry** | **String** | samplesRegistry allows for the specification of which registry is accessed by the ImageStreams for their image content.  Defaults on the content in https://github.com/openshift/library that are pulled into this github repository, but based on our pulling only ocp content it typically defaults to registry.redhat.io. |  [optional]
**skippedImagestreams** | **List&lt;String&gt;** | skippedImagestreams specifies names of image streams that should NOT be created/updated.  Admins can use this to allow them to delete content they don’t want.  They will still have to manually delete the content but the operator will not recreate(or update) anything listed here. |  [optional]
**skippedTemplates** | **List&lt;String&gt;** | skippedTemplates specifies names of templates that should NOT be created/updated.  Admins can use this to allow them to delete content they don’t want.  They will still have to manually delete the content but the operator will not recreate(or update) anything listed here. |  [optional]
**version** | **String** | version is the value of the operator&#39;s payload based version indicator when it was last successfully processed |  [optional]



