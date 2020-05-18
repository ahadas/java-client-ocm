
# IoOpenshiftConfigV1OAuthSpecRequestHeader

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ca** | [**IoOpenshiftConfigV1OAuthSpecRequestHeaderCa**](IoOpenshiftConfigV1OAuthSpecRequestHeaderCa.md) |  |  [optional]
**challengeURL** | **String** | challengeURL is a URL to redirect unauthenticated /authorize requests to Unauthenticated requests from OAuth clients which expect WWW-Authenticate challenges will be redirected here. ${url} is replaced with the current URL, escaped to be safe in a query parameter   https://www.example.com/sso-login?then&#x3D;${url} ${query} is replaced with the current query string   https://www.example.com/auth-proxy/oauth/authorize?${query} Required when challenge is set to true. |  [optional]
**clientCommonNames** | **List&lt;String&gt;** | clientCommonNames is an optional list of common names to require a match from. If empty, any client certificate validated against the clientCA bundle is considered authoritative. |  [optional]
**emailHeaders** | **List&lt;String&gt;** | emailHeaders is the set of headers to check for the email address |  [optional]
**headers** | **List&lt;String&gt;** | headers is the set of headers to check for identity information |  [optional]
**loginURL** | **String** | loginURL is a URL to redirect unauthenticated /authorize requests to Unauthenticated requests from OAuth clients which expect interactive logins will be redirected here ${url} is replaced with the current URL, escaped to be safe in a query parameter   https://www.example.com/sso-login?then&#x3D;${url} ${query} is replaced with the current query string   https://www.example.com/auth-proxy/oauth/authorize?${query} Required when login is set to true. |  [optional]
**nameHeaders** | **List&lt;String&gt;** | nameHeaders is the set of headers to check for the display name |  [optional]
**preferredUsernameHeaders** | **List&lt;String&gt;** | preferredUsernameHeaders is the set of headers to check for the preferred username |  [optional]



