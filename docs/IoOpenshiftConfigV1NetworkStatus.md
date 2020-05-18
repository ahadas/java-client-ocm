
# IoOpenshiftConfigV1NetworkStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterNetwork** | [**List&lt;IoOpenshiftConfigV1NetworkSpecClusterNetwork&gt;**](IoOpenshiftConfigV1NetworkSpecClusterNetwork.md) | IP address pool to use for pod IPs. |  [optional]
**clusterNetworkMTU** | **Integer** | ClusterNetworkMTU is the MTU for inter-pod networking. |  [optional]
**networkType** | **String** | NetworkType is the plugin that is deployed (e.g. OpenShiftSDN). |  [optional]
**serviceNetwork** | **List&lt;String&gt;** | IP address pool for services. Currently, we only support a single entry here. |  [optional]



