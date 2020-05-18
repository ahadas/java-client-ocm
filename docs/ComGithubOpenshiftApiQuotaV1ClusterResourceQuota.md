
# ComGithubOpenshiftApiQuotaV1ClusterResourceQuota

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMetaV2**](IoK8sApimachineryPkgApisMetaV1ObjectMetaV2.md) |  | 
**spec** | [**ComGithubOpenshiftApiQuotaV1ClusterResourceQuotaSpec**](ComGithubOpenshiftApiQuotaV1ClusterResourceQuotaSpec.md) | Spec defines the desired quota | 
**status** | [**ComGithubOpenshiftApiQuotaV1ClusterResourceQuotaStatus**](ComGithubOpenshiftApiQuotaV1ClusterResourceQuotaStatus.md) | Status defines the actual enforced quota and its current usage |  [optional]



