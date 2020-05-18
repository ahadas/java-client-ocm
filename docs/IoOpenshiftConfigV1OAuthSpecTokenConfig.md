
# IoOpenshiftConfigV1OAuthSpecTokenConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessTokenInactivityTimeoutSeconds** | **Integer** | accessTokenInactivityTimeoutSeconds defines the default token inactivity timeout for tokens granted by any client. The value represents the maximum amount of time that can occur between consecutive uses of the token. Tokens become invalid if they are not used within this temporal window. The user will need to acquire a new token to regain access once a token times out. Valid values are integer values:   x &lt; 0  Tokens time out is enabled but tokens never timeout unless configured per client (e.g. &#x60;-1&#x60;)   x &#x3D; 0  Tokens time out is disabled (default)   x &gt; 0  Tokens time out if there is no activity for x seconds The current minimum allowed value for X is 300 (5 minutes) |  [optional]
**accessTokenMaxAgeSeconds** | **Integer** | accessTokenMaxAgeSeconds defines the maximum age of access tokens |  [optional]



