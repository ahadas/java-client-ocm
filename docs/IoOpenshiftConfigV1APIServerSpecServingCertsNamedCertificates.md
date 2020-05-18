
# IoOpenshiftConfigV1APIServerSpecServingCertsNamedCertificates

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**names** | **List&lt;String&gt;** | names is a optional list of explicit DNS names (leading wildcards allowed) that should use this certificate to serve secure traffic. If no names are provided, the implicit names will be extracted from the certificates. Exact names trump over wildcard names. Explicit names defined here trump over extracted implicit names. |  [optional]
**servingCertificate** | [**IoOpenshiftConfigV1APIServerSpecServingCertsServingCertificate**](IoOpenshiftConfigV1APIServerSpecServingCertsServingCertificate.md) |  |  [optional]



