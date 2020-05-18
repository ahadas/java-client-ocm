
# IoOpenshiftQuotaV1ClusterResourceQuotaStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**namespaces** | **Object** | Namespaces slices the usage by project.  This division allows for quick resolution of deletion reconciliation inside of a single project without requiring a recalculation across all projects.  This can be used to pull the deltas for a given project. |  [optional]
**total** | [**IoOpenshiftQuotaV1ClusterResourceQuotaStatusTotal**](IoOpenshiftQuotaV1ClusterResourceQuotaStatusTotal.md) |  | 



