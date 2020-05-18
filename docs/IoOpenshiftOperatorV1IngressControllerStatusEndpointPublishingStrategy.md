
# IoOpenshiftOperatorV1IngressControllerStatusEndpointPublishingStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hostNetwork** | **Object** | hostNetwork holds parameters for the HostNetwork endpoint publishing strategy. Present only if type is HostNetwork. |  [optional]
**loadBalancer** | [**IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategyLoadBalancer**](IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategyLoadBalancer.md) |  |  [optional]
**_private** | **Object** | private holds parameters for the Private endpoint publishing strategy. Present only if type is Private. |  [optional]
**type** | **String** | type is the publishing strategy to use. Valid values are:   * LoadBalancerService   Publishes the ingress controller using a Kubernetes LoadBalancer Service.   In this configuration, the ingress controller deployment uses container networking. A LoadBalancer Service is created to publish the deployment.   See: https://kubernetes.io/docs/concepts/services-networking/service/#loadbalancer   If domain is set, a wildcard DNS record will be managed to point at the LoadBalancer Service&#39;s external name. DNS records are managed only in DNS zones defined by dns.config.openshift.io/cluster .spec.publicZone and .spec.privateZone.   Wildcard DNS management is currently supported only on the AWS, Azure, and GCP platforms.   * HostNetwork   Publishes the ingress controller on node ports where the ingress controller is deployed.   In this configuration, the ingress controller deployment uses host networking, bound to node ports 80 and 443. The user is responsible for configuring an external load balancer to publish the ingress controller via the node ports.   * Private   Does not publish the ingress controller.   In this configuration, the ingress controller deployment uses container networking, and is not explicitly published. The user must manually publish the ingress controller. | 



