
# ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ClusterStatusTopology

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**data** | **String** | Data is the topology data Was previously []byte but changed to string because []byte was being corrupted by the api&#39;s Unmarshal code I think - Ethan |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**name** | **String** | Name must match the cluster name |  [optional]



