
# IoOpenshiftOperatorV1IngressControllerStatusTlsProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ciphers** | **List&lt;String&gt;** | ciphers is used to specify the cipher algorithms that are negotiated during the TLS handshake.  Operators may remove entries their operands do not support.  For example, to use DES-CBC3-SHA  (yaml):     ciphers:     - DES-CBC3-SHA |  [optional]
**minTLSVersion** | **String** | minTLSVersion is used to specify the minimal version of the TLS protocol that is negotiated during the TLS handshake. For example, to use TLS versions 1.1, 1.2 and 1.3 (yaml):     minTLSVersion: TLSv1.1   NOTE: currently the highest minTLSVersion allowed is VersionTLS12 |  [optional]



