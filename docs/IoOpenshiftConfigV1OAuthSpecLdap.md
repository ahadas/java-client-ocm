
# IoOpenshiftConfigV1OAuthSpecLdap

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**IoOpenshiftConfigV1OAuthSpecLdapAttributes**](IoOpenshiftConfigV1OAuthSpecLdapAttributes.md) |  |  [optional]
**bindDN** | **String** | bindDN is an optional DN to bind with during the search phase. |  [optional]
**bindPassword** | [**IoOpenshiftConfigV1OAuthSpecLdapBindPassword**](IoOpenshiftConfigV1OAuthSpecLdapBindPassword.md) |  |  [optional]
**ca** | [**IoOpenshiftConfigV1OAuthSpecBasicAuthCa**](IoOpenshiftConfigV1OAuthSpecBasicAuthCa.md) |  |  [optional]
**insecure** | **Boolean** | insecure, if true, indicates the connection should not use TLS WARNING: Should not be set to &#x60;true&#x60; with the URL scheme \&quot;ldaps://\&quot; as \&quot;ldaps://\&quot; URLs always          attempt to connect using TLS, even when &#x60;insecure&#x60; is set to &#x60;true&#x60; When &#x60;true&#x60;, \&quot;ldap://\&quot; URLS connect insecurely. When &#x60;false&#x60;, \&quot;ldap://\&quot; URLs are upgraded to a TLS connection using StartTLS as specified in https://tools.ietf.org/html/rfc2830. |  [optional]
**url** | **String** | url is an RFC 2255 URL which specifies the LDAP search parameters to use. The syntax of the URL is: ldap://host:port/basedn?attribute?scope?filter |  [optional]



