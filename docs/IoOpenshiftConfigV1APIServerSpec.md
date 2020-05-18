
# IoOpenshiftConfigV1APIServerSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalCORSAllowedOrigins** | **List&lt;String&gt;** | additionalCORSAllowedOrigins lists additional, user-defined regular expressions describing hosts for which the API server allows access using the CORS headers. This may be needed to access the API and the integrated OAuth server from JavaScript applications. The values are regular expressions that correspond to the Golang regular expression language. |  [optional]
**clientCA** | [**IoOpenshiftConfigV1APIServerSpecClientCA**](IoOpenshiftConfigV1APIServerSpecClientCA.md) |  |  [optional]
**encryption** | [**IoOpenshiftConfigV1APIServerSpecEncryption**](IoOpenshiftConfigV1APIServerSpecEncryption.md) |  |  [optional]
**servingCerts** | [**IoOpenshiftConfigV1APIServerSpecServingCerts**](IoOpenshiftConfigV1APIServerSpecServingCerts.md) |  |  [optional]
**tlsSecurityProfile** | [**IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile**](IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile.md) |  |  [optional]



