
# ComGithubOpenshiftApiBuildV1ImageChangeTrigger

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | from is a reference to an ImageStreamTag that will trigger a build when updated It is optional. If no From is specified, the From image from the build strategy will be used. Only one ImageChangeTrigger with an empty From reference is allowed in a build configuration. |  [optional]
**lastTriggeredImageID** | **String** | lastTriggeredImageID is used internally by the ImageChangeController to save last used image ID for build |  [optional]
**paused** | **Boolean** | paused is true if this trigger is temporarily disabled. Optional. |  [optional]



