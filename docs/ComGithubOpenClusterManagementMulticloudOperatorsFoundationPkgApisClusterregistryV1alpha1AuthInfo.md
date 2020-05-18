
# ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1AuthInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controller** | [**ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ObjectReference**](ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ObjectReference.md) | Controller references an object that contains implementation-specific details about how a controller should authenticate. A simple use case for this would be to reference a secret in another namespace that stores a bearer token that can be used to authenticate against this cluster&#39;s API server. |  [optional]
**user** | [**ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ObjectReference**](ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ObjectReference.md) | User references an object that contains implementation-specific details about how a user should authenticate against this cluster. |  [optional]



