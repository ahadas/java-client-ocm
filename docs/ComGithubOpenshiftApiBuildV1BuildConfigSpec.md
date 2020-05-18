
# ComGithubOpenshiftApiBuildV1BuildConfigSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionDeadlineSeconds** | **Long** | completionDeadlineSeconds is an optional duration in seconds, counted from the time when a build pod gets scheduled in the system, that the build may be active on a node before the system actively tries to terminate the build; value must be positive integer |  [optional]
**failedBuildsHistoryLimit** | **Integer** | failedBuildsHistoryLimit is the number of old failed builds to retain. When a BuildConfig is created, the 5 most recent failed builds are retained unless this value is set. If removed after the BuildConfig has been created, all failed builds are retained. |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | nodeSelector is a selector which must be true for the build pod to fit on a node If nil, it can be overridden by default build nodeselector values for the cluster. If set to an empty map or a map with any values, default build nodeselector values are ignored. |  [optional]
**output** | [**ComGithubOpenshiftApiBuildV1BuildOutput**](ComGithubOpenshiftApiBuildV1BuildOutput.md) | output describes the container image the Strategy should produce. |  [optional]
**postCommit** | [**ComGithubOpenshiftApiBuildV1BuildPostCommitSpec**](ComGithubOpenshiftApiBuildV1BuildPostCommitSpec.md) | postCommit is a build hook executed after the build output image is committed, before it is pushed to a registry. |  [optional]
**resources** | [**IoK8sApiCoreV1ResourceRequirements**](IoK8sApiCoreV1ResourceRequirements.md) | resources computes resource requirements to execute the build. |  [optional]
**revision** | [**ComGithubOpenshiftApiBuildV1SourceRevision**](ComGithubOpenshiftApiBuildV1SourceRevision.md) | revision is the information from the source for a specific repo snapshot. This is optional. |  [optional]
**runPolicy** | **String** | RunPolicy describes how the new build created from this build configuration will be scheduled for execution. This is optional, if not specified we default to \&quot;Serial\&quot;. |  [optional]
**serviceAccount** | **String** | serviceAccount is the name of the ServiceAccount to use to run the pod created by this build. The pod will be allowed to use secrets referenced by the ServiceAccount |  [optional]
**source** | [**ComGithubOpenshiftApiBuildV1BuildSource**](ComGithubOpenshiftApiBuildV1BuildSource.md) | source describes the SCM in use. |  [optional]
**strategy** | [**ComGithubOpenshiftApiBuildV1BuildStrategy**](ComGithubOpenshiftApiBuildV1BuildStrategy.md) | strategy defines how to perform a build. | 
**successfulBuildsHistoryLimit** | **Integer** | successfulBuildsHistoryLimit is the number of old successful builds to retain. When a BuildConfig is created, the 5 most recent successful builds are retained unless this value is set. If removed after the BuildConfig has been created, all successful builds are retained. |  [optional]
**triggers** | [**List&lt;ComGithubOpenshiftApiBuildV1BuildTriggerPolicy&gt;**](ComGithubOpenshiftApiBuildV1BuildTriggerPolicy.md) | triggers determine how new Builds can be launched from a BuildConfig. If no triggers are defined, a new build can only occur as a result of an explicit client build creation. | 



