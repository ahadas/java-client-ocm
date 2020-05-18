
# ComGithubOpenshiftApiImageV1RepositoryImportStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalTags** | **List&lt;String&gt;** | AdditionalTags are tags that exist in the repository but were not imported because a maximum limit of automatic imports was applied. |  [optional]
**images** | [**List&lt;ComGithubOpenshiftApiImageV1ImageImportStatus&gt;**](ComGithubOpenshiftApiImageV1ImageImportStatus.md) | Images is a list of images successfully retrieved by the import of the repository. |  [optional]
**status** | [**IoK8sApimachineryPkgApisMetaV1Status**](IoK8sApimachineryPkgApisMetaV1Status.md) | Status reflects whether any failure occurred during import |  [optional]



