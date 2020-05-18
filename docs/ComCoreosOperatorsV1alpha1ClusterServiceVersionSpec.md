
# ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotations** | **Map&lt;String, String&gt;** | Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. |  [optional]
**apiservicedefinitions** | [**ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecApiservicedefinitions**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecApiservicedefinitions.md) |  |  [optional]
**customresourcedefinitions** | [**ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecCustomresourcedefinitions**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecCustomresourcedefinitions.md) |  |  [optional]
**description** | **String** |  |  [optional]
**displayName** | **String** |  | 
**icon** | [**List&lt;ComCoreosOperatorsV1alpha1CatalogSourceSpecIcon&gt;**](ComCoreosOperatorsV1alpha1CatalogSourceSpecIcon.md) |  |  [optional]
**install** | [**ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall.md) |  | 
**installModes** | [**List&lt;ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallModes&gt;**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallModes.md) | InstallModes specify supported installation types |  [optional]
**keywords** | **List&lt;String&gt;** |  |  [optional]
**labels** | **Map&lt;String, String&gt;** | Map of string keys and values that can be used to organize and categorize (scope and select) objects. |  [optional]
**links** | [**List&lt;ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecLinks&gt;**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecLinks.md) |  |  [optional]
**maintainers** | [**List&lt;ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecMaintainers&gt;**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecMaintainers.md) |  |  [optional]
**maturity** | **String** |  |  [optional]
**minKubeVersion** | **String** |  |  [optional]
**nativeAPIs** | [**List&lt;ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecNativeAPIs&gt;**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecNativeAPIs.md) |  |  [optional]
**provider** | [**ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecLinks**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecLinks.md) |  |  [optional]
**replaces** | **String** | The name of a CSV this one replaces. Should match the &#x60;metadata.Name&#x60; field of the old CSV. |  [optional]
**selector** | [**ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecSelector**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecSelector.md) |  |  [optional]
**version** | **String** | OperatorVersion is a wrapper around semver.Version which supports correct marshaling to YAML and JSON. |  [optional]



