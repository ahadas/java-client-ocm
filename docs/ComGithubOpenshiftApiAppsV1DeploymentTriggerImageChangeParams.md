
# ComGithubOpenshiftApiAppsV1DeploymentTriggerImageChangeParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**automatic** | **Boolean** | Automatic means that the detection of a new tag value should result in an image update inside the pod template. |  [optional]
**containerNames** | **List&lt;String&gt;** | ContainerNames is used to restrict tag updates to the specified set of container names in a pod. If multiple triggers point to the same containers, the resulting behavior is undefined. Future API versions will make this a validation error. If ContainerNames does not point to a valid container, the trigger will be ignored. Future API versions will make this a validation error. |  [optional]
**from** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | From is a reference to an image stream tag to watch for changes. From.Name is the only required subfield - if From.Namespace is blank, the namespace of the current deployment trigger will be used. | 
**lastTriggeredImage** | **String** | LastTriggeredImage is the last image to be triggered. |  [optional]



