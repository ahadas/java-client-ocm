
# IoOpenshiftOperatorV1KubeSchedulerSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**failedRevisionLimit** | **Integer** | failedRevisionLimit is the number of failed static pod installer revisions to keep on disk and in the api -1 &#x3D; unlimited, 0 or unset &#x3D; 5 (default) |  [optional]
**forceRedeploymentReason** | **String** | forceRedeploymentReason can be used to force the redeployment of the operand by providing a unique string. This provides a mechanism to kick a previously failed deployment and provide a reason why you think it will work this time instead of failing again on the same config. |  [optional]
**logLevel** | **String** | logLevel is an intent based logging for an overall component.  It does not give fine grained control, but it is a simple way to manage coarse grained logging choices that operators have to interpret for their operands. |  [optional]
**managementState** | **String** | managementState indicates whether and how the operator should manage the component |  [optional]
**observedConfig** | **Object** | observedConfig holds a sparse config that controller has observed from the cluster state.  It exists in spec because it is an input to the level for the operator |  [optional]
**operatorLogLevel** | **String** | operatorLogLevel is an intent based logging for the operator itself.  It does not give fine grained control, but it is a simple way to manage coarse grained logging choices that operators have to interpret for themselves. |  [optional]
**succeededRevisionLimit** | **Integer** | succeededRevisionLimit is the number of successful static pod installer revisions to keep on disk and in the api -1 &#x3D; unlimited, 0 or unset &#x3D; 5 (default) |  [optional]
**unsupportedConfigOverrides** | **Object** | unsupportedConfigOverrides holds a sparse config that will override any previously set options.  It only needs to be the fields to override it will end up overlaying in the following order: 1. hardcoded defaults 2. observedConfig 3. unsupportedConfigOverrides |  [optional]



