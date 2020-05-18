
# ComGithubOpenshiftApiAppsV1DeploymentConfigStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableReplicas** | **Integer** | AvailableReplicas is the total number of available pods targeted by this deployment config. | 
**conditions** | [**List&lt;ComGithubOpenshiftApiAppsV1DeploymentCondition&gt;**](ComGithubOpenshiftApiAppsV1DeploymentCondition.md) | Conditions represents the latest available observations of a deployment config&#39;s current state. |  [optional]
**details** | [**ComGithubOpenshiftApiAppsV1DeploymentDetails**](ComGithubOpenshiftApiAppsV1DeploymentDetails.md) | Details are the reasons for the update to this deployment config. This could be based on a change made by the user or caused by an automatic trigger |  [optional]
**latestVersion** | **Long** | LatestVersion is used to determine whether the current deployment associated with a deployment config is out of sync. | 
**observedGeneration** | **Long** | ObservedGeneration is the most recent generation observed by the deployment config controller. | 
**readyReplicas** | **Integer** | Total number of ready pods targeted by this deployment. |  [optional]
**replicas** | **Integer** | Replicas is the total number of pods targeted by this deployment config. | 
**unavailableReplicas** | **Integer** | UnavailableReplicas is the total number of unavailable pods targeted by this deployment config. | 
**updatedReplicas** | **Integer** | UpdatedReplicas is the total number of non-terminated pods targeted by this deployment config that have the desired template spec. | 



