
# IoOpenshiftConfigV1OperatorHubSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disableAllDefaultSources** | **Boolean** | disableAllDefaultSources allows you to disable all the default hub sources. If this is true, a specific entry in sources can be used to enable a default source. If this is false, a specific entry in sources can be used to disable or enable a default source. |  [optional]
**sources** | [**List&lt;IoOpenshiftConfigV1OperatorHubSpecSources&gt;**](IoOpenshiftConfigV1OperatorHubSpecSources.md) | sources is the list of default hub sources and their configuration. If the list is empty, it implies that the default hub sources are enabled on the cluster unless disableAllDefaultSources is true. If disableAllDefaultSources is true and sources is not empty, the configuration present in sources will take precedence. The list of default hub sources and their current state will always be reflected in the status block. |  [optional]



