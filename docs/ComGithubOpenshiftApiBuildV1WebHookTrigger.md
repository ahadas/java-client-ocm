
# ComGithubOpenshiftApiBuildV1WebHookTrigger

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowEnv** | **Boolean** | allowEnv determines whether the webhook can set environment variables; can only be set to true for GenericWebHook. |  [optional]
**secret** | **String** | secret used to validate requests. Deprecated: use SecretReference instead. |  [optional]
**secretReference** | [**ComGithubOpenshiftApiBuildV1SecretLocalReference**](ComGithubOpenshiftApiBuildV1SecretLocalReference.md) | secretReference is a reference to a secret in the same namespace, containing the value to be validated when the webhook is invoked. The secret being referenced must contain a key named \&quot;WebHookSecretKey\&quot;, the value of which will be checked against the value supplied in the webhook invocation. |  [optional]



