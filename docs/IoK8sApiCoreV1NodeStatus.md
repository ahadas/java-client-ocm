
# IoK8sApiCoreV1NodeStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | [**List&lt;IoK8sApiCoreV1NodeAddress&gt;**](IoK8sApiCoreV1NodeAddress.md) | List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See http://pr.k8s.io/79391 for an example. |  [optional]
**allocatable** | **Map&lt;String, String&gt;** | Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity. |  [optional]
**capacity** | **Map&lt;String, String&gt;** | Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity |  [optional]
**conditions** | [**List&lt;IoK8sApiCoreV1NodeCondition&gt;**](IoK8sApiCoreV1NodeCondition.md) | Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition |  [optional]
**config** | [**IoK8sApiCoreV1NodeConfigStatus**](IoK8sApiCoreV1NodeConfigStatus.md) | Status of the config assigned to the node via the dynamic Kubelet config feature. |  [optional]
**daemonEndpoints** | [**IoK8sApiCoreV1NodeDaemonEndpoints**](IoK8sApiCoreV1NodeDaemonEndpoints.md) | Endpoints of daemons running on the Node. |  [optional]
**images** | [**List&lt;IoK8sApiCoreV1ContainerImage&gt;**](IoK8sApiCoreV1ContainerImage.md) | List of container images on this node |  [optional]
**nodeInfo** | [**IoK8sApiCoreV1NodeSystemInfo**](IoK8sApiCoreV1NodeSystemInfo.md) | Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info |  [optional]
**phase** | **String** | NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated. |  [optional]
**volumesAttached** | [**List&lt;IoK8sApiCoreV1AttachedVolume&gt;**](IoK8sApiCoreV1AttachedVolume.md) | List of volumes that are attached to the node. |  [optional]
**volumesInUse** | **List&lt;String&gt;** | List of attachable volumes in use (mounted) by the node. |  [optional]



