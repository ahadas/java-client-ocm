
# ComGithubOpenshiftApiBuildV1BuildStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancelled** | **Boolean** | cancelled describes if a cancel event was triggered for the build. |  [optional]
**completionTimestamp** | **String** | completionTimestamp is a timestamp representing the server time when this Build was finished, whether that build failed or succeeded.  It reflects the time at which the Pod running the Build terminated. It is represented in RFC3339 form and is in UTC. |  [optional]
**config** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | config is an ObjectReference to the BuildConfig this Build is based on. |  [optional]
**duration** | **Long** | duration contains time.Duration object describing build time. |  [optional]
**logSnippet** | **String** | logSnippet is the last few lines of the build log.  This value is only set for builds that failed. |  [optional]
**message** | **String** | message is a human-readable message indicating details about why the build has this status. |  [optional]
**output** | [**ComGithubOpenshiftApiBuildV1BuildStatusOutput**](ComGithubOpenshiftApiBuildV1BuildStatusOutput.md) | output describes the container image the build has produced. |  [optional]
**outputDockerImageReference** | **String** | outputDockerImageReference contains a reference to the container image that will be built by this build. Its value is computed from Build.Spec.Output.To, and should include the registry address, so that it can be used to push and pull the image. |  [optional]
**phase** | **String** | phase is the point in the build lifecycle. Possible values are \&quot;New\&quot;, \&quot;Pending\&quot;, \&quot;Running\&quot;, \&quot;Complete\&quot;, \&quot;Failed\&quot;, \&quot;Error\&quot;, and \&quot;Cancelled\&quot;. | 
**reason** | **String** | reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI. |  [optional]
**stages** | [**List&lt;ComGithubOpenshiftApiBuildV1StageInfo&gt;**](ComGithubOpenshiftApiBuildV1StageInfo.md) | stages contains details about each stage that occurs during the build including start time, duration (in milliseconds), and the steps that occured within each stage. |  [optional]
**startTimestamp** | **String** | startTimestamp is a timestamp representing the server time when this Build started running in a Pod. It is represented in RFC3339 form and is in UTC. |  [optional]



