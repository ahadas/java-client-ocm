
# IoOpenshiftOperatorV1ConsoleSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customization** | [**IoOpenshiftOperatorV1ConsoleSpecCustomization**](IoOpenshiftOperatorV1ConsoleSpecCustomization.md) |  |  [optional]
**logLevel** | **String** | logLevel is an intent based logging for an overall component.  It does not give fine grained control, but it is a simple way to manage coarse grained logging choices that operators have to interpret for their operands. |  [optional]
**managementState** | **String** | managementState indicates whether and how the operator should manage the component |  [optional]
**observedConfig** | **Object** | observedConfig holds a sparse config that controller has observed from the cluster state.  It exists in spec because it is an input to the level for the operator |  [optional]
**operatorLogLevel** | **String** | operatorLogLevel is an intent based logging for the operator itself.  It does not give fine grained control, but it is a simple way to manage coarse grained logging choices that operators have to interpret for themselves. |  [optional]
**providers** | [**IoOpenshiftOperatorV1ConsoleSpecProviders**](IoOpenshiftOperatorV1ConsoleSpecProviders.md) |  |  [optional]
**unsupportedConfigOverrides** | **Object** | unsupportedConfigOverrides holds a sparse config that will override any previously set options.  It only needs to be the fields to override it will end up overlaying in the following order: 1. hardcoded defaults 2. observedConfig 3. unsupportedConfigOverrides |  [optional]



