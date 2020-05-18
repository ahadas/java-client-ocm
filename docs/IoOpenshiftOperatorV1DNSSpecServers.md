
# IoOpenshiftOperatorV1DNSSpecServers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**forwardPlugin** | [**IoOpenshiftOperatorV1DNSSpecForwardPlugin**](IoOpenshiftOperatorV1DNSSpecForwardPlugin.md) |  |  [optional]
**name** | **String** | name is required and specifies a unique name for the server. Name must comply with the Service Name Syntax of rfc6335. |  [optional]
**zones** | **List&lt;String&gt;** | zones is required and specifies the subdomains that Server is authoritative for. Zones must conform to the rfc1123 definition of a subdomain. Specifying the cluster domain (i.e., \&quot;cluster.local\&quot;) is invalid. |  [optional]



