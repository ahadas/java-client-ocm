
# IoOpenshiftConfigV1IngressSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **String** | domain is used to generate a default host name for a route when the route&#39;s host name is empty. The generated host name will follow this pattern: \&quot;&lt;route-name&gt;.&lt;route-namespace&gt;.&lt;domain&gt;\&quot;.   It is also used as the default wildcard domain suffix for ingress. The default ingresscontroller domain will follow this pattern: \&quot;*.&lt;domain&gt;\&quot;.   Once set, changing domain is not currently supported. |  [optional]



