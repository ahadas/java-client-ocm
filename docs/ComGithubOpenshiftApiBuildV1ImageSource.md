
# ComGithubOpenshiftApiBuildV1ImageSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**as** | **List&lt;String&gt;** | A list of image names that this source will be used in place of during a multi-stage container image build. For instance, a Dockerfile that uses \&quot;COPY --from&#x3D;nginx:latest\&quot; will first check for an image source that has \&quot;nginx:latest\&quot; in this field before attempting to pull directly. If the Dockerfile does not reference an image source it is ignored. This field and paths may both be set, in which case the contents will be used twice. |  [optional]
**from** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | from is a reference to an ImageStreamTag, ImageStreamImage, or DockerImage to copy source from. | 
**paths** | [**List&lt;ComGithubOpenshiftApiBuildV1ImageSourcePath&gt;**](ComGithubOpenshiftApiBuildV1ImageSourcePath.md) | paths is a list of source and destination paths to copy from the image. This content will be copied into the build context prior to starting the build. If no paths are set, the build context will not be altered. |  [optional]
**pullSecret** | [**IoK8sApiCoreV1LocalObjectReference**](IoK8sApiCoreV1LocalObjectReference.md) | pullSecret is a reference to a secret to be used to pull the image from a registry If the image is pulled from the OpenShift registry, this field does not need to be set. |  [optional]



