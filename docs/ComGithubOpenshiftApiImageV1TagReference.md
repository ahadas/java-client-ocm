
# ComGithubOpenshiftApiImageV1TagReference

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotations** | **Map&lt;String, String&gt;** | Optional; if specified, annotations that are applied to images retrieved via ImageStreamTags. |  [optional]
**from** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | Optional; if specified, a reference to another image that this tag should point to. Valid values are ImageStreamTag, ImageStreamImage, and DockerImage.  ImageStreamTag references can only reference a tag within this same ImageStream. |  [optional]
**generation** | **Long** | Generation is a counter that tracks mutations to the spec tag (user intent). When a tag reference is changed the generation is set to match the current stream generation (which is incremented every time spec is changed). Other processes in the system like the image importer observe that the generation of spec tag is newer than the generation recorded in the status and use that as a trigger to import the newest remote tag. To trigger a new import, clients may set this value to zero which will reset the generation to the latest stream generation. Legacy clients will send this value as nil which will be merged with the current tag generation. |  [optional]
**importPolicy** | [**ComGithubOpenshiftApiImageV1TagImportPolicy**](ComGithubOpenshiftApiImageV1TagImportPolicy.md) | ImportPolicy is information that controls how images may be imported by the server. |  [optional]
**name** | **String** | Name of the tag | 
**reference** | **Boolean** | Reference states if the tag will be imported. Default value is false, which means the tag will be imported. |  [optional]
**referencePolicy** | [**ComGithubOpenshiftApiImageV1TagReferencePolicy**](ComGithubOpenshiftApiImageV1TagReferencePolicy.md) | ReferencePolicy defines how other components should consume the image. |  [optional]



