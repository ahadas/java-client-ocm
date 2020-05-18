
# IoOpenshiftConfigV1BuildSpecBuildOverrides

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**imageLabels** | [**List&lt;IoOpenshiftConfigV1BuildSpecBuildDefaultsImageLabels&gt;**](IoOpenshiftConfigV1BuildSpecBuildDefaultsImageLabels.md) | ImageLabels is a list of docker labels that are applied to the resulting image. If user provided a label in their Build/BuildConfig with the same name as one in this list, the user&#39;s label will be overwritten. |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the build pod to fit on a node |  [optional]
**tolerations** | [**List&lt;ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTolerations&gt;**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTolerations.md) | Tolerations is a list of Tolerations that will override any existing tolerations set on a build pod. |  [optional]



