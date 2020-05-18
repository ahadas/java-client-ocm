
# ComGithubOpenshiftApiBuildV1BuildOutput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**imageLabels** | [**List&lt;ComGithubOpenshiftApiBuildV1ImageLabel&gt;**](ComGithubOpenshiftApiBuildV1ImageLabel.md) | imageLabels define a list of labels that are applied to the resulting image. If there are multiple labels with the same name then the last one in the list is used. |  [optional]
**pushSecret** | [**IoK8sApiCoreV1LocalObjectReference**](IoK8sApiCoreV1LocalObjectReference.md) | PushSecret is the name of a Secret that would be used for setting up the authentication for executing the Docker push to authentication enabled Docker Registry (or Docker Hub). |  [optional]
**to** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | to defines an optional location to push the output of this build to. Kind must be one of &#39;ImageStreamTag&#39; or &#39;DockerImage&#39;. This value will be used to look up a container image repository to push to. In the case of an ImageStreamTag, the ImageStreamTag will be looked for in the namespace of the build unless Namespace is specified. |  [optional]



