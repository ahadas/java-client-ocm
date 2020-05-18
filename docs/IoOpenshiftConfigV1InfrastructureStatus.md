
# IoOpenshiftConfigV1InfrastructureStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiServerInternalURI** | **String** | apiServerInternalURL is a valid URI with scheme(http/https), address and port.  apiServerInternalURL can be used by components like kubelets, to contact the Kubernetes API server using the infrastructure provider rather than Kubernetes networking. |  [optional]
**apiServerURL** | **String** | apiServerURL is a valid URI with scheme(http/https), address and port.  apiServerURL can be used by components like the web console to tell users where to find the Kubernetes API. |  [optional]
**etcdDiscoveryDomain** | **String** | etcdDiscoveryDomain is the domain used to fetch the SRV records for discovering etcd servers and clients. For more info: https://github.com/etcd-io/etcd/blob/329be66e8b3f9e2e6af83c123ff89297e49ebd15/Documentation/op-guide/clustering.md#dns-discovery |  [optional]
**infrastructureName** | **String** | infrastructureName uniquely identifies a cluster with a human friendly name. Once set it should not be changed. Must be of max length 27 and must have only alphanumeric or hyphen characters. |  [optional]
**platform** | **String** | platform is the underlying infrastructure provider for the cluster.   Deprecated: Use platformStatus.type instead. |  [optional]
**platformStatus** | [**IoOpenshiftConfigV1InfrastructureStatusPlatformStatus**](IoOpenshiftConfigV1InfrastructureStatusPlatformStatus.md) |  |  [optional]



