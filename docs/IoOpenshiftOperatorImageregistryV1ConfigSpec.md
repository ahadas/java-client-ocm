
# IoOpenshiftOperatorImageregistryV1ConfigSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultRoute** | **Boolean** | defaultRoute indicates whether an external facing route for the registry should be created using the default generated hostname. |  [optional]
**disableRedirect** | **Boolean** | disableRedirect controls whether to route all data through the Registry, rather than redirecting to the backend. |  [optional]
**httpSecret** | **String** | httpSecret is the value needed by the registry to secure uploads, generated by default. |  [optional]
**logging** | **Long** | logging determines the level of logging enabled in the registry. | 
**managementState** | **String** | managementState indicates whether the registry instance represented by this config instance is under operator management or not.  Valid values are Managed, Unmanaged, and Removed. | 
**nodeSelector** | **Map&lt;String, String&gt;** | nodeSelector defines the node selection constraints for the registry pod. |  [optional]
**proxy** | [**IoOpenshiftOperatorImageregistryV1ConfigSpecProxy**](IoOpenshiftOperatorImageregistryV1ConfigSpecProxy.md) |  |  [optional]
**readOnly** | **Boolean** | readOnly indicates whether the registry instance should reject attempts to push new images or delete existing ones. |  [optional]
**replicas** | **Integer** | replicas determines the number of registry instances to run. | 
**requests** | [**IoOpenshiftOperatorImageregistryV1ConfigSpecRequests**](IoOpenshiftOperatorImageregistryV1ConfigSpecRequests.md) |  |  [optional]
**resources** | [**IoOpenshiftOperatorImageregistryV1ConfigSpecResources**](IoOpenshiftOperatorImageregistryV1ConfigSpecResources.md) |  |  [optional]
**routes** | [**List&lt;IoOpenshiftOperatorImageregistryV1ConfigSpecRoutes&gt;**](IoOpenshiftOperatorImageregistryV1ConfigSpecRoutes.md) | routes defines additional external facing routes which should be created for the registry. |  [optional]
**storage** | [**IoOpenshiftOperatorImageregistryV1ConfigSpecStorage**](IoOpenshiftOperatorImageregistryV1ConfigSpecStorage.md) |  |  [optional]
**tolerations** | [**List&lt;ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTolerations&gt;**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTolerations.md) | tolerations defines the tolerations for the registry pod. |  [optional]


