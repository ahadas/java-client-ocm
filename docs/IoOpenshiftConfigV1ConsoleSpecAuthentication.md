
# IoOpenshiftConfigV1ConsoleSpecAuthentication

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logoutRedirect** | **String** | An optional, absolute URL to redirect web browsers to after logging out of the console. If not specified, it will redirect to the default login page. This is required when using an identity provider that supports single sign-on (SSO) such as: - OpenID (Keycloak, Azure) - RequestHeader (GSSAPI, SSPI, SAML) - OAuth (GitHub, GitLab, Google) Logging out of the console will destroy the user&#39;s token. The logoutRedirect provides the user the option to perform single logout (SLO) through the identity provider to destroy their single sign-on session. |  [optional]



