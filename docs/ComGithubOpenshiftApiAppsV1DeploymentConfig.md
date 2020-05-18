
# ComGithubOpenshiftApiAppsV1DeploymentConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMetaV2**](IoK8sApimachineryPkgApisMetaV1ObjectMetaV2.md) |  |  [optional]
**spec** | [**ComGithubOpenshiftApiAppsV1DeploymentConfigSpec**](ComGithubOpenshiftApiAppsV1DeploymentConfigSpec.md) | Spec represents a desired deployment state and how to deploy to it. | 
**status** | [**ComGithubOpenshiftApiAppsV1DeploymentConfigStatus**](ComGithubOpenshiftApiAppsV1DeploymentConfigStatus.md) | Status represents the current deployment state. |  [optional]



