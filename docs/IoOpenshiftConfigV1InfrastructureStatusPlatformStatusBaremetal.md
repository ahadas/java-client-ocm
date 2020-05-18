
# IoOpenshiftConfigV1InfrastructureStatusPlatformStatusBaremetal

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiServerInternalIP** | **String** | apiServerInternalIP is an IP address to contact the Kubernetes API server that can be used by components inside the cluster, like kubelets using the infrastructure rather than Kubernetes networking. It is the IP that the Infrastructure.status.apiServerInternalURI points to. It is the IP for a self-hosted load balancer in front of the API servers. |  [optional]
**ingressIP** | **String** | ingressIP is an external IP which routes to the default ingress controller. The IP is a suitable target of a wildcard DNS record used to resolve default route host names. |  [optional]
**nodeDNSIP** | **String** | nodeDNSIP is the IP address for the internal DNS used by the nodes. Unlike the one managed by the DNS operator, &#x60;NodeDNSIP&#x60; provides name resolution for the nodes themselves. There is no DNS-as-a-service for BareMetal deployments. In order to minimize necessary changes to the datacenter DNS, a DNS service is hosted as a static pod to serve those hostnames to the nodes in the cluster. |  [optional]



