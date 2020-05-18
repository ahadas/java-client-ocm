
# ComGithubOpenshiftApiBuildV1BuildRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**binary** | [**ComGithubOpenshiftApiBuildV1BinaryBuildSource**](ComGithubOpenshiftApiBuildV1BinaryBuildSource.md) | binary indicates a request to build from a binary provided to the builder |  [optional]
**dockerStrategyOptions** | [**ComGithubOpenshiftApiBuildV1DockerStrategyOptions**](ComGithubOpenshiftApiBuildV1DockerStrategyOptions.md) | DockerStrategyOptions contains additional docker-strategy specific options for the build |  [optional]
**env** | [**List&lt;IoK8sApiCoreV1EnvVar&gt;**](IoK8sApiCoreV1EnvVar.md) | env contains additional environment variables you want to pass into a builder container. |  [optional]
**from** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | from is the reference to the ImageStreamTag that triggered the build. |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**lastVersion** | **Long** | lastVersion (optional) is the LastVersion of the BuildConfig that was used to generate the build. If the BuildConfig in the generator doesn&#39;t match, a build will not be generated. |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMetaV2**](IoK8sApimachineryPkgApisMetaV1ObjectMetaV2.md) |  |  [optional]
**revision** | [**ComGithubOpenshiftApiBuildV1SourceRevision**](ComGithubOpenshiftApiBuildV1SourceRevision.md) | revision is the information from the source for a specific repo snapshot. |  [optional]
**sourceStrategyOptions** | [**ComGithubOpenshiftApiBuildV1SourceStrategyOptions**](ComGithubOpenshiftApiBuildV1SourceStrategyOptions.md) | SourceStrategyOptions contains additional source-strategy specific options for the build |  [optional]
**triggeredBy** | [**List&lt;ComGithubOpenshiftApiBuildV1BuildTriggerCause&gt;**](ComGithubOpenshiftApiBuildV1BuildTriggerCause.md) | triggeredBy describes which triggers started the most recent update to the build configuration and contains information about those triggers. | 
**triggeredByImage** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | triggeredByImage is the Image that triggered this build. |  [optional]



