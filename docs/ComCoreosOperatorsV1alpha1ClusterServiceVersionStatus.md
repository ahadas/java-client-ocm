
# ComCoreosOperatorsV1alpha1ClusterServiceVersionStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certsLastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) | Last time the owned APIService certs were updated |  [optional]
**certsRotateAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time the owned APIService certs will rotate next |  [optional]
**conditions** | [**List&lt;ComCoreosOperatorsV1alpha1ClusterServiceVersionStatusConditions&gt;**](ComCoreosOperatorsV1alpha1ClusterServiceVersionStatusConditions.md) | List of conditions, a history of state transitions |  [optional]
**lastTransitionTime** | [**OffsetDateTime**](OffsetDateTime.md) | Last time the status transitioned from one status to another. |  [optional]
**lastUpdateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Last time we updated the status |  [optional]
**message** | **String** | A human readable message indicating details about why the ClusterServiceVersion is in this condition. |  [optional]
**phase** | **String** | Current condition of the ClusterServiceVersion |  [optional]
**reason** | **String** | A brief CamelCase message indicating details about why the ClusterServiceVersion is in this state. e.g. &#39;RequirementsNotMet&#39; |  [optional]
**requirementStatus** | [**List&lt;ComCoreosOperatorsV1alpha1ClusterServiceVersionStatusRequirementStatus&gt;**](ComCoreosOperatorsV1alpha1ClusterServiceVersionStatusRequirementStatus.md) | The status of each requirement for this CSV |  [optional]



