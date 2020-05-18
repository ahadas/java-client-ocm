
# IoOpenshiftConfigV1ClusterOperatorStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | [**List&lt;IoOpenshiftConfigV1ClusterOperatorStatusConditions&gt;**](IoOpenshiftConfigV1ClusterOperatorStatusConditions.md) | conditions describes the state of the operator&#39;s reconciliation functionality. |  [optional]
**extension** | **Object** | extension contains any additional status information specific to the operator which owns this status object. |  [optional]
**relatedObjects** | [**List&lt;IoOpenshiftConfigV1ClusterOperatorStatusRelatedObjects&gt;**](IoOpenshiftConfigV1ClusterOperatorStatusRelatedObjects.md) | relatedObjects is a list of objects that are \&quot;interesting\&quot; or related to this operator.  Common uses are: 1. the detailed resource driving the operator 2. operator namespaces 3. operand namespaces |  [optional]
**versions** | [**List&lt;IoOpenshiftConfigV1ClusterOperatorStatusVersions&gt;**](IoOpenshiftConfigV1ClusterOperatorStatusVersions.md) | versions is a slice of operand version tuples.  Operators which manage multiple operands will have multiple entries in the array.  If an operator is Available, it must have at least one entry.  You must report the version of the operator itself with the name \&quot;operator\&quot;. |  [optional]



