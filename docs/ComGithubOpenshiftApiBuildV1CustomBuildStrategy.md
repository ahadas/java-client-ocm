
# ComGithubOpenshiftApiBuildV1CustomBuildStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buildAPIVersion** | **String** | buildAPIVersion is the requested API version for the Build object serialized and passed to the custom builder |  [optional]
**env** | [**List&lt;IoK8sApiCoreV1EnvVar&gt;**](IoK8sApiCoreV1EnvVar.md) | env contains additional environment variables you want to pass into a builder container. |  [optional]
**exposeDockerSocket** | **Boolean** | exposeDockerSocket will allow running Docker commands (and build container images) from inside the container. |  [optional]
**forcePull** | **Boolean** | forcePull describes if the controller should configure the build pod to always pull the images for the builder or only pull if it is not present locally |  [optional]
**from** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | from is reference to an DockerImage, ImageStreamTag, or ImageStreamImage from which the container image should be pulled | 
**pullSecret** | [**IoK8sApiCoreV1LocalObjectReference**](IoK8sApiCoreV1LocalObjectReference.md) | pullSecret is the name of a Secret that would be used for setting up the authentication for pulling the container images from the private Docker registries |  [optional]
**secrets** | [**List&lt;ComGithubOpenshiftApiBuildV1SecretSpec&gt;**](ComGithubOpenshiftApiBuildV1SecretSpec.md) | secrets is a list of additional secrets that will be included in the build pod |  [optional]



