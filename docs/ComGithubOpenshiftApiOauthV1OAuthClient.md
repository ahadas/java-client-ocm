
# ComGithubOpenshiftApiOauthV1OAuthClient

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessTokenInactivityTimeoutSeconds** | **Integer** | AccessTokenInactivityTimeoutSeconds overrides the default token inactivity timeout for tokens granted to this client. The value represents the maximum amount of time that can occur between consecutive uses of the token. Tokens become invalid if they are not used within this temporal window. The user will need to acquire a new token to regain access once a token times out. This value needs to be set only if the default set in configuration is not appropriate for this client. Valid values are: - 0: Tokens for this client never time out - X: Tokens time out if there is no activity for X seconds The current minimum allowed value for X is 300 (5 minutes) |  [optional]
**accessTokenMaxAgeSeconds** | **Integer** | AccessTokenMaxAgeSeconds overrides the default access token max age for tokens granted to this client. 0 means no expiration. |  [optional]
**additionalSecrets** | **List&lt;String&gt;** | AdditionalSecrets holds other secrets that may be used to identify the client.  This is useful for rotation and for service account token validation |  [optional]
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**grantMethod** | **String** | GrantMethod is a required field which determines how to handle grants for this client. Valid grant handling methods are:  - auto:   always approves grant requests, useful for trusted clients  - prompt: prompts the end user for approval of grant requests, useful for third-party clients |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMetaV2**](IoK8sApimachineryPkgApisMetaV1ObjectMetaV2.md) |  |  [optional]
**redirectURIs** | **List&lt;String&gt;** | RedirectURIs is the valid redirection URIs associated with a client |  [optional]
**respondWithChallenges** | **Boolean** | RespondWithChallenges indicates whether the client wants authentication needed responses made in the form of challenges instead of redirects |  [optional]
**scopeRestrictions** | [**List&lt;ComGithubOpenshiftApiOauthV1ScopeRestriction&gt;**](ComGithubOpenshiftApiOauthV1ScopeRestriction.md) | ScopeRestrictions describes which scopes this client can request.  Each requested scope is checked against each restriction.  If any restriction matches, then the scope is allowed. If no restriction matches, then the scope is denied. |  [optional]
**secret** | **String** | Secret is the unique secret associated with a client |  [optional]



