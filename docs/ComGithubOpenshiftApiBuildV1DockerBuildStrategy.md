
# ComGithubOpenshiftApiBuildV1DockerBuildStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buildArgs** | [**List&lt;IoK8sApiCoreV1EnvVar&gt;**](IoK8sApiCoreV1EnvVar.md) | buildArgs contains build arguments that will be resolved in the Dockerfile.  See https://docs.docker.com/engine/reference/builder/#/arg for more details. |  [optional]
**dockerfilePath** | **String** | dockerfilePath is the path of the Dockerfile that will be used to build the container image, relative to the root of the context (contextDir). |  [optional]
**env** | [**List&lt;IoK8sApiCoreV1EnvVar&gt;**](IoK8sApiCoreV1EnvVar.md) | env contains additional environment variables you want to pass into a builder container. |  [optional]
**forcePull** | **Boolean** | forcePull describes if the builder should pull the images from registry prior to building. |  [optional]
**from** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | from is reference to an DockerImage, ImageStreamTag, or ImageStreamImage from which the container image should be pulled the resulting image will be used in the FROM line of the Dockerfile for this build. |  [optional]
**imageOptimizationPolicy** | **String** | imageOptimizationPolicy describes what optimizations the system can use when building images to reduce the final size or time spent building the image. The default policy is &#39;None&#39; which means the final build image will be equivalent to an image created by the container image build API. The experimental policy &#39;SkipLayers&#39; will avoid commiting new layers in between each image step, and will fail if the Dockerfile cannot provide compatibility with the &#39;None&#39; policy. An additional experimental policy &#39;SkipLayersAndWarn&#39; is the same as &#39;SkipLayers&#39; but simply warns if compatibility cannot be preserved. |  [optional]
**noCache** | **Boolean** | noCache if set to true indicates that the container image build must be executed with the --no-cache&#x3D;true flag |  [optional]
**pullSecret** | [**IoK8sApiCoreV1LocalObjectReference**](IoK8sApiCoreV1LocalObjectReference.md) | pullSecret is the name of a Secret that would be used for setting up the authentication for pulling the container images from the private Docker registries |  [optional]



