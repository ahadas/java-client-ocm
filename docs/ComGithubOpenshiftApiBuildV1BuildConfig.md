
# ComGithubOpenshiftApiBuildV1BuildConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMetaV2**](IoK8sApimachineryPkgApisMetaV1ObjectMetaV2.md) |  |  [optional]
**spec** | [**ComGithubOpenshiftApiBuildV1BuildConfigSpec**](ComGithubOpenshiftApiBuildV1BuildConfigSpec.md) | spec holds all the input necessary to produce a new build, and the conditions when to trigger them. | 
**status** | [**ComGithubOpenshiftApiBuildV1BuildConfigStatus**](ComGithubOpenshiftApiBuildV1BuildConfigStatus.md) | status holds any relevant information about a build config |  [optional]



