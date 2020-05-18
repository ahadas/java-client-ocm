
# ComGithubOpenshiftApiImageV1ImageStreamImportSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**images** | [**List&lt;ComGithubOpenshiftApiImageV1ImageImportSpec&gt;**](ComGithubOpenshiftApiImageV1ImageImportSpec.md) | Images are a list of individual images to import. |  [optional]
**_import** | **Boolean** | Import indicates whether to perform an import - if so, the specified tags are set on the spec and status of the image stream defined by the type meta. | 
**repository** | [**ComGithubOpenshiftApiImageV1RepositoryImportSpec**](ComGithubOpenshiftApiImageV1RepositoryImportSpec.md) | Repository is an optional import of an entire container image repository. A maximum limit on the number of tags imported this way is imposed by the server. |  [optional]



