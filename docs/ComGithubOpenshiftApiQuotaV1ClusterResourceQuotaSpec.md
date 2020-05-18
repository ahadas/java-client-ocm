
# ComGithubOpenshiftApiQuotaV1ClusterResourceQuotaSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quota** | [**IoK8sApiCoreV1ResourceQuotaSpec**](IoK8sApiCoreV1ResourceQuotaSpec.md) | Quota defines the desired quota | 
**selector** | [**ComGithubOpenshiftApiQuotaV1ClusterResourceQuotaSelector**](ComGithubOpenshiftApiQuotaV1ClusterResourceQuotaSelector.md) | Selector is the selector used to match projects. It should only select active projects on the scale of dozens (though it can select many more less active projects).  These projects will contend on object creation through this resource. | 



