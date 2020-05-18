
# ComGithubOpenshiftApiBuildV1ConfigMapBuildSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configMap** | [**IoK8sApiCoreV1LocalObjectReference**](IoK8sApiCoreV1LocalObjectReference.md) | configMap is a reference to an existing configmap that you want to use in your build. | 
**destinationDir** | **String** | destinationDir is the directory where the files from the configmap should be available for the build time. For the Source build strategy, these will be injected into a container where the assemble script runs. For the container image build strategy, these will be copied into the build directory, where the Dockerfile is located, so users can ADD or COPY them during container image build. |  [optional]



