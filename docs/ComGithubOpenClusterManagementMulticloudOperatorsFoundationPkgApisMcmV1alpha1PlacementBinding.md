
# ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementBinding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMeta**](IoK8sApimachineryPkgApisMetaV1ObjectMeta.md) | Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata |  [optional]
**placementRef** | [**ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicyRef**](ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicyRef.md) | PlacementPolicyRef references a PlacementPolicy |  [optional]
**subjects** | [**List&lt;ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1Subject&gt;**](ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1Subject.md) | Subjects holds references to the objects the role applies to. |  [optional]



