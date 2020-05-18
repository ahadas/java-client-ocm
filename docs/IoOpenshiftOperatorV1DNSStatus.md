
# IoOpenshiftOperatorV1DNSStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterDomain** | **String** | clusterDomain is the local cluster DNS domain suffix for DNS services. This will be a subdomain as defined in RFC 1034, section 3.5: https://tools.ietf.org/html/rfc1034#section-3.5 Example: \&quot;cluster.local\&quot;   More info: https://kubernetes.io/docs/concepts/services-networking/dns-pod-service | 
**clusterIP** | **String** | clusterIP is the service IP through which this DNS is made available.   In the case of the default DNS, this will be a well known IP that is used as the default nameserver for pods that are using the default ClusterFirst DNS policy.   In general, this IP can be specified in a pod&#39;s spec.dnsConfig.nameservers list or used explicitly when performing name resolution from within the cluster. Example: dig foo.com @&lt;service IP&gt;   More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies | 
**conditions** | [**List&lt;IoOpenshiftOperatorImageregistryV1ConfigStatusConditions&gt;**](IoOpenshiftOperatorImageregistryV1ConfigStatusConditions.md) | conditions provide information about the state of the DNS on the cluster.   These are the supported DNS conditions:     * Available   - True if the following conditions are met:     * DNS controller daemonset is available.   - False if any of those conditions are unsatisfied. |  [optional]



