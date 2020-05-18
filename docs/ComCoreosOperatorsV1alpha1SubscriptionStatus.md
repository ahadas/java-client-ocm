
# ComCoreosOperatorsV1alpha1SubscriptionStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogHealth** | [**List&lt;ComCoreosOperatorsV1alpha1SubscriptionStatusCatalogHealth&gt;**](ComCoreosOperatorsV1alpha1SubscriptionStatusCatalogHealth.md) | CatalogHealth contains the Subscription&#39;s view of its relevant CatalogSources&#39; status. It is used to determine SubscriptionStatusConditions related to CatalogSources. |  [optional]
**conditions** | [**List&lt;ComCoreosOperatorsV1alpha1SubscriptionStatusConditions&gt;**](ComCoreosOperatorsV1alpha1SubscriptionStatusConditions.md) | Conditions is a list of the latest available observations about a Subscription&#39;s current state. |  [optional]
**currentCSV** | **String** | CurrentCSV is the CSV the Subscription is progressing to. |  [optional]
**installPlanRef** | [**ComCoreosOperatorsV1alpha1SubscriptionStatusInstallPlanRef**](ComCoreosOperatorsV1alpha1SubscriptionStatusInstallPlanRef.md) |  |  [optional]
**installedCSV** | **String** | InstalledCSV is the CSV currently installed by the Subscription. |  [optional]
**installplan** | [**ComCoreosOperatorsV1alpha1SubscriptionStatusInstallplan**](ComCoreosOperatorsV1alpha1SubscriptionStatusInstallplan.md) |  |  [optional]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) | LastUpdated represents the last time that the Subscription status was updated. | 
**reason** | **String** | Reason is the reason the Subscription was transitioned to its current state. |  [optional]
**state** | **String** | State represents the current state of the Subscription |  [optional]



