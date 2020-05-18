
# ComGithubOpenshiftApiImageV1ImageStreamSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dockerImageRepository** | **String** | dockerImageRepository is optional, if specified this stream is backed by a container repository on this server Deprecated: This field is deprecated as of v3.7 and will be removed in a future release. Specify the source for the tags to be imported in each tag via the spec.tags.from reference instead. |  [optional]
**lookupPolicy** | [**ComGithubOpenshiftApiImageV1ImageLookupPolicy**](ComGithubOpenshiftApiImageV1ImageLookupPolicy.md) | lookupPolicy controls how other resources reference images within this namespace. |  [optional]
**tags** | [**List&lt;ComGithubOpenshiftApiImageV1TagReference&gt;**](ComGithubOpenshiftApiImageV1TagReference.md) | tags map arbitrary string values to specific image locators |  [optional]



