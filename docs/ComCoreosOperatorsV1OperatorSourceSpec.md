
# ComCoreosOperatorsV1OperatorSourceSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorizationToken** | [**ComCoreosOperatorsV1OperatorSourceSpecAuthorizationToken**](ComCoreosOperatorsV1OperatorSourceSpecAuthorizationToken.md) |  |  [optional]
**displayName** | **String** | DisplayName is passed along to the CatalogSourceConfig to be used by the resulting CatalogSource to be used as a pretty name. |  [optional]
**endpoint** | **String** | Endpoint points to the remote app registry server from where operator manifests can be fetched. | 
**publisher** | **String** | Publisher is passed along to the CatalogSourceConfig to be used by the resulting CatalogSource that defines what entity published the artifacts from the OperatorSource. |  [optional]
**registryNamespace** | **String** | RegistryNamespace refers to the namespace in app registry. Only operator manifests under this namespace will be visible. Please note that this is not a k8s namespace. | 
**type** | **String** | Type of operator source. | 



