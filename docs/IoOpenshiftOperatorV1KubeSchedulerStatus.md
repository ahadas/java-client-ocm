
# IoOpenshiftOperatorV1KubeSchedulerStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | [**List&lt;IoOpenshiftOperatorImageregistryV1ConfigStatusConditions&gt;**](IoOpenshiftOperatorImageregistryV1ConfigStatusConditions.md) | conditions is a list of conditions and their status |  [optional]
**generations** | [**List&lt;IoOpenshiftOperatorImageregistryV1ConfigStatusGenerations&gt;**](IoOpenshiftOperatorImageregistryV1ConfigStatusGenerations.md) | generations are used to determine when an item needs to be reconciled or has changed in a way that needs a reaction. |  [optional]
**latestAvailableRevision** | **Integer** | latestAvailableRevision is the deploymentID of the most recent deployment |  [optional]
**latestAvailableRevisionReason** | **String** | latestAvailableRevisionReason describe the detailed reason for the most recent deployment |  [optional]
**nodeStatuses** | [**List&lt;IoOpenshiftOperatorV1KubeAPIServerStatusNodeStatuses&gt;**](IoOpenshiftOperatorV1KubeAPIServerStatusNodeStatuses.md) | nodeStatuses track the deployment values and errors across individual nodes |  [optional]
**observedGeneration** | **Long** | observedGeneration is the last generation change you&#39;ve dealt with |  [optional]
**readyReplicas** | **Integer** | readyReplicas indicates how many replicas are ready and at the desired state |  [optional]
**version** | **String** | version is the level this availability applies to |  [optional]



