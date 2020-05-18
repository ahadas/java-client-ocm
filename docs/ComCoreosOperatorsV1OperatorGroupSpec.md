
# ComCoreosOperatorsV1OperatorGroupSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selector** | [**ComCoreosOperatorsV1OperatorGroupSpecSelector**](ComCoreosOperatorsV1OperatorGroupSpecSelector.md) |  |  [optional]
**serviceAccountName** | **String** | ServiceAccountName is the admin specified service account which will be used to deploy operator(s) in this operator group. |  [optional]
**staticProvidedAPIs** | **Boolean** | Static tells OLM not to update the OperatorGroup&#39;s providedAPIs annotation |  [optional]
**targetNamespaces** | **List&lt;String&gt;** | TargetNamespaces is an explicit set of namespaces to target. If it is set, Selector is ignored. |  [optional]



