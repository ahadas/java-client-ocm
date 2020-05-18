
# ComGithubOpenshiftApiBuildV1SourceBuildStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**env** | [**List&lt;IoK8sApiCoreV1EnvVar&gt;**](IoK8sApiCoreV1EnvVar.md) | env contains additional environment variables you want to pass into a builder container. |  [optional]
**forcePull** | **Boolean** | forcePull describes if the builder should pull the images from registry prior to building. |  [optional]
**from** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | from is reference to an DockerImage, ImageStreamTag, or ImageStreamImage from which the container image should be pulled | 
**incremental** | **Boolean** | incremental flag forces the Source build to do incremental builds if true. |  [optional]
**pullSecret** | [**IoK8sApiCoreV1LocalObjectReference**](IoK8sApiCoreV1LocalObjectReference.md) | pullSecret is the name of a Secret that would be used for setting up the authentication for pulling the container images from the private Docker registries |  [optional]
**scripts** | **String** | scripts is the location of Source scripts |  [optional]



