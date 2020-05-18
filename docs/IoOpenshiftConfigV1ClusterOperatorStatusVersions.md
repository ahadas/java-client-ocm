
# IoOpenshiftConfigV1ClusterOperatorStatusVersions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | name is the name of the particular operand this version is for.  It usually matches container images, not operators. | 
**version** | **String** | version indicates which version of a particular operand is currently being manage.  It must always match the Available condition.  If 1.0.0 is Available, then this must indicate 1.0.0 even if the operator is trying to rollout 1.1.0 | 



