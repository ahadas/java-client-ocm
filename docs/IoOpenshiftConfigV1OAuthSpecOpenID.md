
# IoOpenshiftConfigV1OAuthSpecOpenID

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ca** | [**IoOpenshiftConfigV1OAuthSpecBasicAuthCa**](IoOpenshiftConfigV1OAuthSpecBasicAuthCa.md) |  |  [optional]
**claims** | [**IoOpenshiftConfigV1OAuthSpecOpenIDClaims**](IoOpenshiftConfigV1OAuthSpecOpenIDClaims.md) |  |  [optional]
**clientID** | **String** | clientID is the oauth client ID |  [optional]
**clientSecret** | [**IoOpenshiftConfigV1OAuthSpecGithubClientSecret**](IoOpenshiftConfigV1OAuthSpecGithubClientSecret.md) |  |  [optional]
**extraAuthorizeParameters** | **Map&lt;String, String&gt;** | extraAuthorizeParameters are any custom parameters to add to the authorize request. |  [optional]
**extraScopes** | **List&lt;String&gt;** | extraScopes are any scopes to request in addition to the standard \&quot;openid\&quot; scope. |  [optional]
**issuer** | **String** | issuer is the URL that the OpenID Provider asserts as its Issuer Identifier. It must use the https scheme with no query or fragment component. |  [optional]



