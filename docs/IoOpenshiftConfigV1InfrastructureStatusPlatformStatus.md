
# IoOpenshiftConfigV1InfrastructureStatusPlatformStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aws** | [**IoOpenshiftConfigV1InfrastructureStatusPlatformStatusAws**](IoOpenshiftConfigV1InfrastructureStatusPlatformStatusAws.md) |  |  [optional]
**azure** | [**IoOpenshiftConfigV1InfrastructureStatusPlatformStatusAzure**](IoOpenshiftConfigV1InfrastructureStatusPlatformStatusAzure.md) |  |  [optional]
**baremetal** | [**IoOpenshiftConfigV1InfrastructureStatusPlatformStatusBaremetal**](IoOpenshiftConfigV1InfrastructureStatusPlatformStatusBaremetal.md) |  |  [optional]
**gcp** | [**IoOpenshiftConfigV1InfrastructureStatusPlatformStatusGcp**](IoOpenshiftConfigV1InfrastructureStatusPlatformStatusGcp.md) |  |  [optional]
**openstack** | [**IoOpenshiftConfigV1InfrastructureStatusPlatformStatusOpenstack**](IoOpenshiftConfigV1InfrastructureStatusPlatformStatusOpenstack.md) |  |  [optional]
**ovirt** | [**IoOpenshiftConfigV1InfrastructureStatusPlatformStatusOvirt**](IoOpenshiftConfigV1InfrastructureStatusPlatformStatusOvirt.md) |  |  [optional]
**type** | **String** | type is the underlying infrastructure provider for the cluster. This value controls whether infrastructure automation such as service load balancers, dynamic volume provisioning, machine creation and deletion, and other integrations are enabled. If None, no infrastructure automation is enabled. Allowed values are \&quot;AWS\&quot;, \&quot;Azure\&quot;, \&quot;BareMetal\&quot;, \&quot;GCP\&quot;, \&quot;Libvirt\&quot;, \&quot;OpenStack\&quot;, \&quot;VSphere\&quot;, \&quot;oVirt\&quot;, and \&quot;None\&quot;. Individual components may not support all platforms, and must handle unrecognized platforms as None if they do not support that platform. |  [optional]



