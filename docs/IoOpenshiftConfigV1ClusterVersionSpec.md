
# IoOpenshiftConfigV1ClusterVersionSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel** | **String** | channel is an identifier for explicitly requesting that a non-default set of updates be applied to this cluster. The default channel will be contain stable updates that are appropriate for production clusters. |  [optional]
**clusterID** | **String** | clusterID uniquely identifies this cluster. This is expected to be an RFC4122 UUID value (xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx in hexadecimal values). This is a required field. | 
**desiredUpdate** | [**IoOpenshiftConfigV1ClusterVersionSpecDesiredUpdate**](IoOpenshiftConfigV1ClusterVersionSpecDesiredUpdate.md) |  |  [optional]
**overrides** | [**List&lt;IoOpenshiftConfigV1ClusterVersionSpecOverrides&gt;**](IoOpenshiftConfigV1ClusterVersionSpecOverrides.md) | overrides is list of overides for components that are managed by cluster version operator. Marking a component unmanaged will prevent the operator from creating or updating the object. |  [optional]
**upstream** | **String** | upstream may be used to specify the preferred update server. By default it will use the appropriate update server for the cluster and region. |  [optional]



