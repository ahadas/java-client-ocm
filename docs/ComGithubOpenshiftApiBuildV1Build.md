
# ComGithubOpenshiftApiBuildV1Build

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMetaV2**](IoK8sApimachineryPkgApisMetaV1ObjectMetaV2.md) |  |  [optional]
**spec** | [**ComGithubOpenshiftApiBuildV1BuildSpec**](ComGithubOpenshiftApiBuildV1BuildSpec.md) | spec is all the inputs used to execute the build. |  [optional]
**status** | [**ComGithubOpenshiftApiBuildV1BuildStatus**](ComGithubOpenshiftApiBuildV1BuildStatus.md) | status is the current status of the build. |  [optional]



