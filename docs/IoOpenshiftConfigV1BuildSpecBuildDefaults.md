
# IoOpenshiftConfigV1BuildSpecBuildDefaults

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultProxy** | [**IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy**](IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy.md) |  |  [optional]
**env** | [**List&lt;ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecEnv&gt;**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecEnv.md) | Env is a set of default environment variables that will be applied to the build if the specified variables do not exist on the build |  [optional]
**gitProxy** | [**IoOpenshiftConfigV1BuildSpecBuildDefaultsGitProxy**](IoOpenshiftConfigV1BuildSpecBuildDefaultsGitProxy.md) |  |  [optional]
**imageLabels** | [**List&lt;IoOpenshiftConfigV1BuildSpecBuildDefaultsImageLabels&gt;**](IoOpenshiftConfigV1BuildSpecBuildDefaultsImageLabels.md) | ImageLabels is a list of docker labels that are applied to the resulting image. User can override a default label by providing a label with the same name in their Build/BuildConfig. |  [optional]
**resources** | [**IoOpenshiftConfigV1BuildSpecBuildDefaultsResources**](IoOpenshiftConfigV1BuildSpecBuildDefaultsResources.md) |  |  [optional]



