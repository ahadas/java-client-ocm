
# ComGithubOpenshiftApiImageV1RepositoryImportSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | From is the source for the image repository to import; only kind DockerImage and a name of a container image repository is allowed | 
**importPolicy** | [**ComGithubOpenshiftApiImageV1TagImportPolicy**](ComGithubOpenshiftApiImageV1TagImportPolicy.md) | ImportPolicy is the policy controlling how the image is imported |  [optional]
**includeManifest** | **Boolean** | IncludeManifest determines if the manifest for each image is returned in the response |  [optional]
**referencePolicy** | [**ComGithubOpenshiftApiImageV1TagReferencePolicy**](ComGithubOpenshiftApiImageV1TagReferencePolicy.md) | ReferencePolicy defines how other components should consume the image |  [optional]



