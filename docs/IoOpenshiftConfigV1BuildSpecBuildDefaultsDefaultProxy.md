
# IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**httpProxy** | **String** | httpProxy is the URL of the proxy for HTTP requests.  Empty means unset and will not result in an env var. |  [optional]
**httpsProxy** | **String** | httpsProxy is the URL of the proxy for HTTPS requests.  Empty means unset and will not result in an env var. |  [optional]
**noProxy** | **String** | noProxy is a comma-separated list of hostnames and/or CIDRs for which the proxy should not be used. Empty means unset and will not result in an env var. |  [optional]
**readinessEndpoints** | **List&lt;String&gt;** | readinessEndpoints is a list of endpoints used to verify readiness of the proxy. |  [optional]
**trustedCA** | [**IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxyTrustedCA**](IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxyTrustedCA.md) |  |  [optional]



