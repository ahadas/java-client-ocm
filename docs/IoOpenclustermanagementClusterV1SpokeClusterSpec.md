
# IoOpenclustermanagementClusterV1SpokeClusterSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hubAcceptsClient** | **Boolean** | AcceptSpokeCluster reprsents that hub accepts the join of spoke agent. Its default value is false, and can only be set true when the user on hub has an RBAC rule to UPDATE on the virtual subresource of spokeclusters/accept. When the vaule is set true, a namespace whose name is same as the name of SpokeCluster is created on hub representing the spoke cluster, also role/rolebinding is created on the namespace to grant the permision of access from agent on spoke. When the value is set false, the namespace representing the spoke cluster is deleted. |  [optional]
**spokeClientConfig** | [**IoOpenclustermanagementClusterV1SpokeClusterSpecSpokeClientConfig**](IoOpenclustermanagementClusterV1SpokeClusterSpecSpokeClientConfig.md) |  |  [optional]



