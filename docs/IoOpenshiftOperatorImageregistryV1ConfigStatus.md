
# IoOpenshiftOperatorImageregistryV1ConfigStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | [**List&lt;IoOpenshiftOperatorImageregistryV1ConfigStatusConditions&gt;**](IoOpenshiftOperatorImageregistryV1ConfigStatusConditions.md) | conditions is a list of conditions and their status |  [optional]
**generations** | [**List&lt;IoOpenshiftOperatorImageregistryV1ConfigStatusGenerations&gt;**](IoOpenshiftOperatorImageregistryV1ConfigStatusGenerations.md) | generations are used to determine when an item needs to be reconciled or has changed in a way that needs a reaction. |  [optional]
**observedGeneration** | **Long** | observedGeneration is the last generation change you&#39;ve dealt with |  [optional]
**readyReplicas** | **Integer** | readyReplicas indicates how many replicas are ready and at the desired state |  [optional]
**storage** | [**IoOpenshiftOperatorImageregistryV1ConfigStatusStorage**](IoOpenshiftOperatorImageregistryV1ConfigStatusStorage.md) |  | 
**storageManaged** | **Boolean** | storageManaged is a boolean which denotes whether or not we created the registry storage medium (such as an S3 bucket). | 
**version** | **String** | version is the level this availability applies to |  [optional]



