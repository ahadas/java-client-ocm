
# IoOpenshiftConfigV1ImageSpecRegistrySources

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedRegistries** | **List&lt;String&gt;** | allowedRegistries are whitelisted for image pull/push. All other registries are blocked.   Only one of BlockedRegistries or AllowedRegistries may be set. |  [optional]
**blockedRegistries** | **List&lt;String&gt;** | blockedRegistries are blacklisted from image pull/push. All other registries are allowed.   Only one of BlockedRegistries or AllowedRegistries may be set. |  [optional]
**insecureRegistries** | **List&lt;String&gt;** | insecureRegistries are registries which do not have a valid TLS certificates or only support HTTP connections. |  [optional]



