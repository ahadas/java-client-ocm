
# IoOpenshiftConfigV1NetworkSpecExternalIP

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoAssignCIDRs** | **List&lt;String&gt;** | autoAssignCIDRs is a list of CIDRs from which to automatically assign Service.ExternalIP. These are assigned when the service is of type LoadBalancer. In general, this is only useful for bare-metal clusters. In Openshift 3.x, this was misleadingly called \&quot;IngressIPs\&quot;. Automatically assigned External IPs are not affected by any ExternalIPPolicy rules. Currently, only one entry may be provided. |  [optional]
**policy** | [**IoOpenshiftConfigV1NetworkSpecExternalIPPolicy**](IoOpenshiftConfigV1NetworkSpecExternalIPPolicy.md) |  |  [optional]



