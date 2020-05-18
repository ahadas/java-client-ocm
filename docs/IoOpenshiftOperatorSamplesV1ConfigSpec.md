
# IoOpenshiftOperatorSamplesV1ConfigSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**architectures** | **List&lt;String&gt;** | architectures determine which hardware architecture(s) to install, where x86_64, ppc64le, and s390x are the only supported choices currently. |  [optional]
**managementState** | **String** | managementState is top level on/off type of switch for all operators. When \&quot;Managed\&quot;, this operator processes config and manipulates the samples accordingly. When \&quot;Unmanaged\&quot;, this operator ignores any updates to the resources it watches. When \&quot;Removed\&quot;, it reacts that same wasy as it does if the Config object is deleted, meaning any ImageStreams or Templates it manages (i.e. it honors the skipped lists) and the registry secret are deleted, along with the ConfigMap in the operator&#39;s namespace that represents the last config used to manipulate the samples, |  [optional]
**samplesRegistry** | **String** | samplesRegistry allows for the specification of which registry is accessed by the ImageStreams for their image content.  Defaults on the content in https://github.com/openshift/library that are pulled into this github repository, but based on our pulling only ocp content it typically defaults to registry.redhat.io. |  [optional]
**skippedImagestreams** | **List&lt;String&gt;** | skippedImagestreams specifies names of image streams that should NOT be created/updated.  Admins can use this to allow them to delete content they don’t want.  They will still have to manually delete the content but the operator will not recreate(or update) anything listed here. |  [optional]
**skippedTemplates** | **List&lt;String&gt;** | skippedTemplates specifies names of templates that should NOT be created/updated.  Admins can use this to allow them to delete content they don’t want.  They will still have to manually delete the content but the operator will not recreate(or update) anything listed here. |  [optional]



