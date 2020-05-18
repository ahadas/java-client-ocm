
# ComCoreosOperatorsV1alpha1SubscriptionSpecConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**env** | [**List&lt;ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecEnv&gt;**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecEnv.md) | Env is a list of environment variables to set in the container. Cannot be updated. |  [optional]
**envFrom** | [**List&lt;ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecEnvFrom&gt;**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecEnvFrom.md) | EnvFrom is a list of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Immutable. |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/ |  [optional]
**resources** | [**ComCoreosOperatorsV1alpha1SubscriptionSpecConfigResources**](ComCoreosOperatorsV1alpha1SubscriptionSpecConfigResources.md) |  |  [optional]
**selector** | [**ComCoreosOperatorsV1alpha1SubscriptionSpecConfigSelector**](ComCoreosOperatorsV1alpha1SubscriptionSpecConfigSelector.md) |  |  [optional]
**tolerations** | [**List&lt;ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTolerations&gt;**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTolerations.md) | Tolerations are the pod&#39;s tolerations. |  [optional]
**volumeMounts** | [**List&lt;ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVolumeMounts&gt;**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVolumeMounts.md) | List of VolumeMounts to set in the container. |  [optional]
**volumes** | [**List&lt;ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVolumes&gt;**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVolumes.md) | List of Volumes to set in the podSpec. |  [optional]



