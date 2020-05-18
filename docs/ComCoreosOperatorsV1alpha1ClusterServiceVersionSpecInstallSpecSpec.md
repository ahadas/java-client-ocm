
# ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minReadySeconds** | **Integer** | Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) |  [optional]
**paused** | **Boolean** | Indicates that the deployment is paused. |  [optional]
**progressDeadlineSeconds** | **Integer** | The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s. |  [optional]
**replicas** | **Integer** | Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1. |  [optional]
**revisionHistoryLimit** | **Integer** | The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10. |  [optional]
**selector** | [**ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecSelector**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecSelector.md) |  | 
**strategy** | [**ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategy**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategy.md) |  |  [optional]
**template** | [**ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplate**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplate.md) |  | 



