
# IoOpenshiftConfigV1ClusterVersionStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableUpdates** | **Object** | availableUpdates contains the list of updates that are appropriate for this cluster. This list may be empty if no updates are recommended, if the update service is unavailable, or if an invalid channel has been specified. | 
**conditions** | [**List&lt;IoOpenshiftConfigV1ClusterOperatorStatusConditions&gt;**](IoOpenshiftConfigV1ClusterOperatorStatusConditions.md) | conditions provides information about the cluster version. The condition \&quot;Available\&quot; is set to true if the desiredUpdate has been reached. The condition \&quot;Progressing\&quot; is set to true if an update is being applied. The condition \&quot;Degraded\&quot; is set to true if an update is currently blocked by a temporary or permanent error. Conditions are only valid for the current desiredUpdate when metadata.generation is equal to status.generation. |  [optional]
**desired** | [**IoOpenshiftConfigV1ClusterVersionStatusDesired**](IoOpenshiftConfigV1ClusterVersionStatusDesired.md) |  | 
**history** | [**List&lt;IoOpenshiftConfigV1ClusterVersionStatusHistory&gt;**](IoOpenshiftConfigV1ClusterVersionStatusHistory.md) | history contains a list of the most recent versions applied to the cluster. This value may be empty during cluster startup, and then will be updated when a new update is being applied. The newest update is first in the list and it is ordered by recency. Updates in the history have state Completed if the rollout completed - if an update was failing or halfway applied the state will be Partial. Only a limited amount of update history is preserved. |  [optional]
**observedGeneration** | **Long** | observedGeneration reports which version of the spec is being synced. If this value is not equal to metadata.generation, then the desired and conditions fields may represent a previous version. | 
**versionHash** | **String** | versionHash is a fingerprint of the content that the cluster will be updated with. It is used by the operator to avoid unnecessary work and is for internal use only. | 



