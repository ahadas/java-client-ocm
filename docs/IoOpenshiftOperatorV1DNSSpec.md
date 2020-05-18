
# IoOpenshiftOperatorV1DNSSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**servers** | [**List&lt;IoOpenshiftOperatorV1DNSSpecServers&gt;**](IoOpenshiftOperatorV1DNSSpecServers.md) | servers is a list of DNS resolvers that provide name query delegation for one or more subdomains outside the scope of the cluster domain. If servers consists of more than one Server, longest suffix match will be used to determine the Server.   For example, if there are two Servers, one for \&quot;foo.com\&quot; and another for \&quot;a.foo.com\&quot;, and the name query is for \&quot;www.a.foo.com\&quot;, it will be routed to the Server with Zone \&quot;a.foo.com\&quot;.   If this field is nil, no servers are created. |  [optional]



