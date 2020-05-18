
# IoOpenshiftConfigV1APIServerSpecServingCerts

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**namedCertificates** | [**List&lt;IoOpenshiftConfigV1APIServerSpecServingCertsNamedCertificates&gt;**](IoOpenshiftConfigV1APIServerSpecServingCertsNamedCertificates.md) | namedCertificates references secrets containing the TLS cert info for serving secure traffic to specific hostnames. If no named certificates are provided, or no named certificates match the server name as understood by a client, the defaultServingCertificate will be used. |  [optional]



