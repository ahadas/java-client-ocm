
# ComGithubOpenshiftApiImageV1ImageStreamStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dockerImageRepository** | **String** | DockerImageRepository represents the effective location this stream may be accessed at. May be empty until the server determines where the repository is located | 
**publicDockerImageRepository** | **String** | PublicDockerImageRepository represents the public location from where the image can be pulled outside the cluster. This field may be empty if the administrator has not exposed the integrated registry externally. |  [optional]
**tags** | [**List&lt;ComGithubOpenshiftApiImageV1NamedTagEventList&gt;**](ComGithubOpenshiftApiImageV1NamedTagEventList.md) | Tags are a historical record of images associated with each tag. The first entry in the TagEvent array is the currently tagged image. |  [optional]



