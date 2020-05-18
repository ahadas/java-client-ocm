
# ComGithubOpenshiftApiAuthorizationV1SubjectRulesReviewSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | **List&lt;String&gt;** | Groups is optional.  Groups is the list of groups to which the User belongs.  At least one of User and Groups must be specified. | 
**scopes** | **List&lt;String&gt;** | Scopes to use for the evaluation.  Empty means \&quot;use the unscoped (full) permissions of the user/groups\&quot;. | 
**user** | **String** | User is optional.  At least one of User and Groups must be specified. | 



