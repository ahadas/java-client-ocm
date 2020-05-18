
# ComGithubOpenshiftApiBuildV1BuildSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionDeadlineSeconds** | **Long** | completionDeadlineSeconds is an optional duration in seconds, counted from the time when a build pod gets scheduled in the system, that the build may be active on a node before the system actively tries to terminate the build; value must be positive integer |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | nodeSelector is a selector which must be true for the build pod to fit on a node If nil, it can be overridden by default build nodeselector values for the cluster. If set to an empty map or a map with any values, default build nodeselector values are ignored. |  [optional]
**output** | [**ComGithubOpenshiftApiBuildV1BuildOutput**](ComGithubOpenshiftApiBuildV1BuildOutput.md) | output describes the container image the Strategy should produce. |  [optional]
**postCommit** | [**ComGithubOpenshiftApiBuildV1BuildPostCommitSpec**](ComGithubOpenshiftApiBuildV1BuildPostCommitSpec.md) | postCommit is a build hook executed after the build output image is committed, before it is pushed to a registry. |  [optional]
**resources** | [**IoK8sApiCoreV1ResourceRequirements**](IoK8sApiCoreV1ResourceRequirements.md) | resources computes resource requirements to execute the build. |  [optional]
**revision** | [**ComGithubOpenshiftApiBuildV1SourceRevision**](ComGithubOpenshiftApiBuildV1SourceRevision.md) | revision is the information from the source for a specific repo snapshot. This is optional. |  [optional]
**serviceAccount** | **String** | serviceAccount is the name of the ServiceAccount to use to run the pod created by this build. The pod will be allowed to use secrets referenced by the ServiceAccount |  [optional]
**source** | [**ComGithubOpenshiftApiBuildV1BuildSource**](ComGithubOpenshiftApiBuildV1BuildSource.md) | source describes the SCM in use. |  [optional]
**strategy** | [**ComGithubOpenshiftApiBuildV1BuildStrategy**](ComGithubOpenshiftApiBuildV1BuildStrategy.md) | strategy defines how to perform a build. | 
**triggeredBy** | [**List&lt;ComGithubOpenshiftApiBuildV1BuildTriggerCause&gt;**](ComGithubOpenshiftApiBuildV1BuildTriggerCause.md) | triggeredBy describes which triggers started the most recent update to the build configuration and contains information about those triggers. | 



