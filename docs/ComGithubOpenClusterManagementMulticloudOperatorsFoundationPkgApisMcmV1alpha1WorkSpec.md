
# ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionType** | **String** | ActionType is the type of the action |  [optional]
**cluster** | [**IoK8sApiCoreV1LocalObjectReference**](IoK8sApiCoreV1LocalObjectReference.md) | Cluster is a selector of cluster |  [optional]
**helm** | [**ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec**](ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec.md) | HelmWork is the work to process helm operation |  [optional]
**kube** | [**ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1KubeWorkSpec**](ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1KubeWorkSpec.md) | KubeWorkSpec is the work to process kubernetes operation |  [optional]
**scope** | [**ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceFilter**](ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceFilter.md) | Scope is the scope of the work to be apply to in a cluster |  [optional]
**type** | **String** | Type defins the type of the woke to be done |  [optional]



