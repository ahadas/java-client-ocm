
# IoOpenshiftConfigV1AuthenticationSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**oauthMetadata** | [**IoOpenshiftConfigV1AuthenticationSpecOauthMetadata**](IoOpenshiftConfigV1AuthenticationSpecOauthMetadata.md) |  |  [optional]
**type** | **String** | type identifies the cluster managed, user facing authentication mode in use. Specifically, it manages the component that responds to login attempts. The default is IntegratedOAuth. |  [optional]
**webhookTokenAuthenticators** | [**List&lt;IoOpenshiftConfigV1AuthenticationSpecWebhookTokenAuthenticators&gt;**](IoOpenshiftConfigV1AuthenticationSpecWebhookTokenAuthenticators.md) | webhookTokenAuthenticators configures remote token reviewers. These remote authentication webhooks can be used to verify bearer tokens via the tokenreviews.authentication.k8s.io REST API.  This is required to honor bearer tokens that are provisioned by an external authentication service. The namespace for these secrets is openshift-config. |  [optional]



