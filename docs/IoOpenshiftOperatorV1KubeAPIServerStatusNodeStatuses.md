
# IoOpenshiftOperatorV1KubeAPIServerStatusNodeStatuses

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentRevision** | **Integer** | currentRevision is the generation of the most recently successful deployment |  [optional]
**lastFailedRevision** | **Integer** | lastFailedRevision is the generation of the deployment we tried and failed to deploy. |  [optional]
**lastFailedRevisionErrors** | **List&lt;String&gt;** | lastFailedRevisionErrors is a list of the errors during the failed deployment referenced in lastFailedRevision |  [optional]
**nodeName** | **String** | nodeName is the name of the node |  [optional]
**targetRevision** | **Integer** | targetRevision is the generation of the deployment we&#39;re trying to apply |  [optional]



