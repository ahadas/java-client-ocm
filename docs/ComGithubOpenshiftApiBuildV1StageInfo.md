
# ComGithubOpenshiftApiBuildV1StageInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**durationMilliseconds** | **Long** | durationMilliseconds identifies how long the stage took to complete in milliseconds. Note: the duration of a stage can exceed the sum of the duration of the steps within the stage as not all actions are accounted for in explicit build steps. |  [optional]
**name** | **String** | name is a unique identifier for each build stage that occurs. |  [optional]
**startTime** | **String** | startTime is a timestamp representing the server time when this Stage started. It is represented in RFC3339 form and is in UTC. |  [optional]
**steps** | [**List&lt;ComGithubOpenshiftApiBuildV1StepInfo&gt;**](ComGithubOpenshiftApiBuildV1StepInfo.md) | steps contains details about each step that occurs during a build stage including start time and duration in milliseconds. |  [optional]



