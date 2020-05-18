
# ComCoreosOperatorsV1alpha1SubscriptionStatusConditions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastHeartbeatTime** | [**OffsetDateTime**](OffsetDateTime.md) | LastHeartbeatTime is the last time we got an update on a given condition |  [optional]
**lastTransitionTime** | [**OffsetDateTime**](OffsetDateTime.md) | LastTransitionTime is the last time the condition transit from one status to another |  [optional]
**message** | **String** | Message is a human-readable message indicating details about last transition. |  [optional]
**reason** | **String** | Reason is a one-word CamelCase reason for the condition&#39;s last transition. |  [optional]
**status** | **String** | Status is the status of the condition, one of True, False, Unknown. | 
**type** | **String** | Type is the type of Subscription condition. | 



