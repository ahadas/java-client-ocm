
# IoOpenshiftOperatorV1IngressControllerStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableReplicas** | **Integer** | availableReplicas is number of observed available replicas according to the ingress controller deployment. |  [optional]
**conditions** | [**List&lt;IoOpenshiftOperatorImageregistryV1ConfigStatusConditions&gt;**](IoOpenshiftOperatorImageregistryV1ConfigStatusConditions.md) | conditions is a list of conditions and their status.   Available means the ingress controller deployment is available and servicing route and ingress resources (i.e, .status.availableReplicas equals .spec.replicas)   There are additional conditions which indicate the status of other ingress controller features and capabilities.     * LoadBalancerManaged   - True if the following conditions are met:     * The endpoint publishing strategy requires a service load balancer.   - False if any of those conditions are unsatisfied.     * LoadBalancerReady   - True if the following conditions are met:     * A load balancer is managed.     * The load balancer is ready.   - False if any of those conditions are unsatisfied.     * DNSManaged   - True if the following conditions are met:     * The endpoint publishing strategy and platform support DNS.     * The ingress controller domain is set.     * dns.config.openshift.io/cluster configures DNS zones.   - False if any of those conditions are unsatisfied.     * DNSReady   - True if the following conditions are met:     * DNS is managed.     * DNS records have been successfully created.   - False if any of those conditions are unsatisfied. |  [optional]
**domain** | **String** | domain is the actual domain in use. |  [optional]
**endpointPublishingStrategy** | [**IoOpenshiftOperatorV1IngressControllerStatusEndpointPublishingStrategy**](IoOpenshiftOperatorV1IngressControllerStatusEndpointPublishingStrategy.md) |  |  [optional]
**observedGeneration** | **Long** | observedGeneration is the most recent generation observed. |  [optional]
**selector** | **String** | selector is a label selector, in string format, for ingress controller pods corresponding to the IngressController. The number of matching pods should equal the value of availableReplicas. |  [optional]
**tlsProfile** | [**IoOpenshiftOperatorV1IngressControllerStatusTlsProfile**](IoOpenshiftOperatorV1IngressControllerStatusTlsProfile.md) |  |  [optional]



