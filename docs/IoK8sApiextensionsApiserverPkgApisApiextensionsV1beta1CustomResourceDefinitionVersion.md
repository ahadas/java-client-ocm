
# IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalPrinterColumns** | [**List&lt;IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition&gt;**](IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition.md) | additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. Top-level and per-version columns are mutually exclusive. Per-version columns must not all be set to identical values (top-level columns should be used instead). If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used. |  [optional]
**name** | **String** | name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at &#x60;/apis/&lt;group&gt;/&lt;version&gt;/...&#x60; if &#x60;served&#x60; is true. | 
**schema** | [**IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceValidation**](IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceValidation.md) | schema describes the schema used for validation and pruning of this version of the custom resource. Top-level and per-version schemas are mutually exclusive. Per-version schemas must not all be set to identical values (top-level validation schema should be used instead). |  [optional]
**served** | **Boolean** | served is a flag enabling/disabling this version from being served via REST APIs | 
**storage** | **Boolean** | storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage&#x3D;true. | 
**subresources** | [**IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceSubresources**](IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceSubresources.md) | subresources specify what subresources this version of the defined custom resource have. Top-level and per-version subresources are mutually exclusive. Per-version subresources must not all be set to identical values (top-level subresources should be used instead). |  [optional]



