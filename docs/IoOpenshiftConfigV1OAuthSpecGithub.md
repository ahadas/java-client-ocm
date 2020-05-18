
# IoOpenshiftConfigV1OAuthSpecGithub

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ca** | [**IoOpenshiftConfigV1OAuthSpecGithubCa**](IoOpenshiftConfigV1OAuthSpecGithubCa.md) |  |  [optional]
**clientID** | **String** | clientID is the oauth client ID |  [optional]
**clientSecret** | [**IoOpenshiftConfigV1OAuthSpecGithubClientSecret**](IoOpenshiftConfigV1OAuthSpecGithubClientSecret.md) |  |  [optional]
**hostname** | **String** | hostname is the optional domain (e.g. \&quot;mycompany.com\&quot;) for use with a hosted instance of GitHub Enterprise. It must match the GitHub Enterprise settings value configured at /setup/settings#hostname. |  [optional]
**organizations** | **List&lt;String&gt;** | organizations optionally restricts which organizations are allowed to log in |  [optional]
**teams** | **List&lt;String&gt;** | teams optionally restricts which teams are allowed to log in. Format is &lt;org&gt;/&lt;team&gt;. |  [optional]



