
# ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterConditions** | [**List&lt;ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ClusterConditionFilter&gt;**](ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ClusterConditionFilter.md) |  |  [optional]
**clusterLabels** | [**IoK8sApimachineryPkgApisMetaV1LabelSelector**](IoK8sApimachineryPkgApisMetaV1LabelSelector.md) | Target Cluster is a selector of cluster |  [optional]
**clusterNames** | **List&lt;String&gt;** | Target Clusters |  [optional]
**clusterReplicas** | **Integer** | ////////////////////////////////////////////////////////////////////////// number of replicas Application wants to |  [optional]
**clusterSelector** | [**IoK8sApimachineryPkgApisMetaV1LabelSelector**](IoK8sApimachineryPkgApisMetaV1LabelSelector.md) | Deprecated since 3.1.2: replaced by resource hint |  [optional]
**compliances** | **List&lt;String&gt;** | Set ComplianceFilters |  [optional]
**replicas** | **Integer** | Deprecated since 3.1.2: replaced by ClusterReplicas |  [optional]
**resourceHint** | [**ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceHint**](ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceHint.md) | Select Resource |  [optional]
**resourceSelector** | [**ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceHint**](ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceHint.md) | Deprecated since 3.1.2: replaced by resource hint |  [optional]



