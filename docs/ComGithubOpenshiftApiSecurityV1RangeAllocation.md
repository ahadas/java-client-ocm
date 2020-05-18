
# ComGithubOpenshiftApiSecurityV1RangeAllocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**data** | **byte[]** | data is a byte array representing the serialized state of a range allocation.  It is a bitmap with each bit set to one to represent a range is taken. | 
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMetaV2**](IoK8sApimachineryPkgApisMetaV1ObjectMetaV2.md) |  |  [optional]
**range** | **String** | range is a string representing a unique label for a range of uids, \&quot;1000000000-2000000000/10000\&quot;. | 



