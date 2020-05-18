
# IoOpenshiftTunedV1TunedSpecMatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | Node or Pod label name. | 
**match** | **List&lt;Object&gt;** | Additional rules governing application of the tuned profile connected by logical AND operator. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Match type: [node/pod]. If omitted, \&quot;node\&quot; is assumed. |  [optional]
**value** | **String** | Node or Pod label value. If omitted, the presence of label name is enough to match. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NODE | &quot;node&quot;
POD | &quot;pod&quot;



