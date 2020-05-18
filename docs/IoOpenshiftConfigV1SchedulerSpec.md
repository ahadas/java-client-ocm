
# IoOpenshiftConfigV1SchedulerSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultNodeSelector** | **String** | defaultNodeSelector helps set the cluster-wide default node selector to restrict pod placement to specific nodes. This is applied to the pods created in all namespaces without a specified nodeSelector value. For example, defaultNodeSelector: \&quot;type&#x3D;user-node,region&#x3D;east\&quot; would set nodeSelector field in pod spec to \&quot;type&#x3D;user-node,region&#x3D;east\&quot; to all pods created in all namespaces. Namespaces having project-wide node selectors won&#39;t be impacted even if this field is set. This adds an annotation section to the namespace. For example, if a new namespace is created with node-selector&#x3D;&#39;type&#x3D;user-node,region&#x3D;east&#39;, the annotation openshift.io/node-selector: type&#x3D;user-node,region&#x3D;east gets added to the project. When the openshift.io/node-selector annotation is set on the project the value is used in preference to the value we are setting for defaultNodeSelector field. For instance, openshift.io/node-selector: \&quot;type&#x3D;user-node,region&#x3D;west\&quot; means that the default of \&quot;type&#x3D;user-node,region&#x3D;east\&quot; set in defaultNodeSelector would not be applied. |  [optional]
**mastersSchedulable** | **Boolean** | MastersSchedulable allows masters nodes to be schedulable. When this flag is turned on, all the master nodes in the cluster will be made schedulable, so that workload pods can run on them. The default value for this field is false, meaning none of the master nodes are schedulable. Important Note: Once the workload pods start running on the master nodes, extreme care must be taken to ensure that cluster-critical control plane components are not impacted. Please turn on this field after doing due diligence. |  [optional]
**policy** | [**IoOpenshiftConfigV1SchedulerSpecPolicy**](IoOpenshiftConfigV1SchedulerSpecPolicy.md) |  |  [optional]



