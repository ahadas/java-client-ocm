
# ComGithubOpenshiftApiImageV1ImageImportSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | From is the source of an image to import; only kind DockerImage is allowed | 
**importPolicy** | [**ComGithubOpenshiftApiImageV1TagImportPolicy**](ComGithubOpenshiftApiImageV1TagImportPolicy.md) | ImportPolicy is the policy controlling how the image is imported |  [optional]
**includeManifest** | **Boolean** | IncludeManifest determines if the manifest for each image is returned in the response |  [optional]
**referencePolicy** | [**ComGithubOpenshiftApiImageV1TagReferencePolicy**](ComGithubOpenshiftApiImageV1TagReferencePolicy.md) | ReferencePolicy defines how other components should consume the image |  [optional]
**to** | [**IoK8sApiCoreV1LocalObjectReference**](IoK8sApiCoreV1LocalObjectReference.md) | To is a tag in the current image stream to assign the imported image to, if name is not specified the default tag from from.name will be used |  [optional]



