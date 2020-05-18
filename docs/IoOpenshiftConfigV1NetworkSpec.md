
# IoOpenshiftConfigV1NetworkSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterNetwork** | [**List&lt;IoOpenshiftConfigV1NetworkSpecClusterNetwork&gt;**](IoOpenshiftConfigV1NetworkSpecClusterNetwork.md) | IP address pool to use for pod IPs. This field is immutable after installation. |  [optional]
**externalIP** | [**IoOpenshiftConfigV1NetworkSpecExternalIP**](IoOpenshiftConfigV1NetworkSpecExternalIP.md) |  |  [optional]
**networkType** | **String** | NetworkType is the plugin that is to be deployed (e.g. OpenShiftSDN). This should match a value that the cluster-network-operator understands, or else no networking will be installed. Currently supported values are: - OpenShiftSDN This field is immutable after installation. |  [optional]
**serviceNetwork** | **List&lt;String&gt;** | IP address pool for services. Currently, we only support a single entry here. This field is immutable after installation. |  [optional]



