
# ComGithubOpenshiftApiAuthorizationV1GroupRestriction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | **List&lt;String&gt;** | Groups is a list of groups used to match against an individual user&#39;s groups. If the user is a member of one of the whitelisted groups, the user is allowed to be bound to a role. | 
**labels** | [**List&lt;IoK8sApimachineryPkgApisMetaV1LabelSelector&gt;**](IoK8sApimachineryPkgApisMetaV1LabelSelector.md) | Selectors specifies a list of label selectors over group labels. | 



