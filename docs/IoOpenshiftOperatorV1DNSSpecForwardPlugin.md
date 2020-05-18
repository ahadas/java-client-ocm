
# IoOpenshiftOperatorV1DNSSpecForwardPlugin

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**upstreams** | **List&lt;String&gt;** | upstreams is a list of resolvers to forward name queries for subdomains of Zones. Upstreams are randomized when more than 1 upstream is specified. Each instance of CoreDNS performs health checking of Upstreams. When a healthy upstream returns an error during the exchange, another resolver is tried from Upstreams. Each upstream is represented by an IP address or IP:port if the upstream listens on a port other than 53.   A maximum of 15 upstreams is allowed per ForwardPlugin. |  [optional]



