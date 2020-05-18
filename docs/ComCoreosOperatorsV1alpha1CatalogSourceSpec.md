
# ComCoreosOperatorsV1alpha1CatalogSourceSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | Address is a host that OLM can use to connect to a pre-existing registry. Format: &lt;registry-host or ip&gt;:&lt;port&gt; Only used when SourceType &#x3D; SourceTypeGrpc. Ignored when the Image field is set. |  [optional]
**configMap** | **String** | ConfigMap is the name of the ConfigMap to be used to back a configmap-server registry. Only used when SourceType &#x3D; SourceTypeConfigmap or SourceTypeInternal. |  [optional]
**description** | **String** |  |  [optional]
**displayName** | **String** | Metadata |  [optional]
**icon** | [**ComCoreosOperatorsV1alpha1CatalogSourceSpecIcon**](ComCoreosOperatorsV1alpha1CatalogSourceSpecIcon.md) |  |  [optional]
**image** | **String** | Image is an operator-registry container image to instantiate a registry-server with. Only used when SourceType &#x3D; SourceTypeGrpc. If present, the address field is ignored. |  [optional]
**publisher** | **String** |  |  [optional]
**secrets** | **List&lt;String&gt;** | Secrets represent set of secrets that can be used to access the contents of the catalog. It is best to keep this list small, since each will need to be tried for every catalog entry. |  [optional]
**sourceType** | **String** | SourceType is the type of source | 



