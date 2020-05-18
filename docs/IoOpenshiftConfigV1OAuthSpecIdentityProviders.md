
# IoOpenshiftConfigV1OAuthSpecIdentityProviders

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basicAuth** | [**IoOpenshiftConfigV1OAuthSpecBasicAuth**](IoOpenshiftConfigV1OAuthSpecBasicAuth.md) |  |  [optional]
**github** | [**IoOpenshiftConfigV1OAuthSpecGithub**](IoOpenshiftConfigV1OAuthSpecGithub.md) |  |  [optional]
**gitlab** | [**IoOpenshiftConfigV1OAuthSpecGitlab**](IoOpenshiftConfigV1OAuthSpecGitlab.md) |  |  [optional]
**google** | [**IoOpenshiftConfigV1OAuthSpecGoogle**](IoOpenshiftConfigV1OAuthSpecGoogle.md) |  |  [optional]
**htpasswd** | [**IoOpenshiftConfigV1OAuthSpecHtpasswd**](IoOpenshiftConfigV1OAuthSpecHtpasswd.md) |  |  [optional]
**keystone** | [**IoOpenshiftConfigV1OAuthSpecKeystone**](IoOpenshiftConfigV1OAuthSpecKeystone.md) |  |  [optional]
**ldap** | [**IoOpenshiftConfigV1OAuthSpecLdap**](IoOpenshiftConfigV1OAuthSpecLdap.md) |  |  [optional]
**mappingMethod** | **String** | mappingMethod determines how identities from this provider are mapped to users Defaults to \&quot;claim\&quot; |  [optional]
**name** | **String** | name is used to qualify the identities returned by this provider. - It MUST be unique and not shared by any other identity provider used - It MUST be a valid path segment: name cannot equal \&quot;.\&quot; or \&quot;..\&quot; or contain \&quot;/\&quot; or \&quot;%\&quot; or \&quot;:\&quot;   Ref: https://godoc.org/github.com/openshift/origin/pkg/user/apis/user/validation#ValidateIdentityProviderName |  [optional]
**openID** | [**IoOpenshiftConfigV1OAuthSpecOpenID**](IoOpenshiftConfigV1OAuthSpecOpenID.md) |  |  [optional]
**requestHeader** | [**IoOpenshiftConfigV1OAuthSpecRequestHeader**](IoOpenshiftConfigV1OAuthSpecRequestHeader.md) |  |  [optional]
**type** | **String** | type identifies the identity provider type for this entry. |  [optional]



