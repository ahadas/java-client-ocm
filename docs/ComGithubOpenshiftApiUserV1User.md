
# ComGithubOpenshiftApiUserV1User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**fullName** | **String** | FullName is the full name of user |  [optional]
**groups** | **List&lt;String&gt;** | Groups specifies group names this user is a member of. This field is deprecated and will be removed in a future release. Instead, create a Group object containing the name of this User. | 
**identities** | **List&lt;String&gt;** | Identities are the identities associated with this user | 
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMetaV2**](IoK8sApimachineryPkgApisMetaV1ObjectMetaV2.md) |  |  [optional]



