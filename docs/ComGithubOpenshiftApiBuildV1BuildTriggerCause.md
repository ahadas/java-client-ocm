
# ComGithubOpenshiftApiBuildV1BuildTriggerCause

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitbucketWebHook** | [**ComGithubOpenshiftApiBuildV1BitbucketWebHookCause**](ComGithubOpenshiftApiBuildV1BitbucketWebHookCause.md) | BitbucketWebHook represents data for a Bitbucket webhook that fired a specific build. |  [optional]
**genericWebHook** | [**ComGithubOpenshiftApiBuildV1GenericWebHookCause**](ComGithubOpenshiftApiBuildV1GenericWebHookCause.md) | genericWebHook holds data about a builds generic webhook trigger. |  [optional]
**githubWebHook** | [**ComGithubOpenshiftApiBuildV1GitHubWebHookCause**](ComGithubOpenshiftApiBuildV1GitHubWebHookCause.md) | gitHubWebHook represents data for a GitHub webhook that fired a specific build. |  [optional]
**gitlabWebHook** | [**ComGithubOpenshiftApiBuildV1GitLabWebHookCause**](ComGithubOpenshiftApiBuildV1GitLabWebHookCause.md) | GitLabWebHook represents data for a GitLab webhook that fired a specific build. |  [optional]
**imageChangeBuild** | [**ComGithubOpenshiftApiBuildV1ImageChangeCause**](ComGithubOpenshiftApiBuildV1ImageChangeCause.md) | imageChangeBuild stores information about an imagechange event that triggered a new build. |  [optional]
**message** | **String** | message is used to store a human readable message for why the build was triggered. E.g.: \&quot;Manually triggered by user\&quot;, \&quot;Configuration change\&quot;,etc. |  [optional]



