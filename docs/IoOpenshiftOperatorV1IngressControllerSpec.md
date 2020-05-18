
# IoOpenshiftOperatorV1IngressControllerSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultCertificate** | [**IoOpenshiftOperatorV1IngressControllerSpecDefaultCertificate**](IoOpenshiftOperatorV1IngressControllerSpecDefaultCertificate.md) |  |  [optional]
**domain** | **String** | domain is a DNS name serviced by the ingress controller and is used to configure multiple features:   * For the LoadBalancerService endpoint publishing strategy, domain is   used to configure DNS records. See endpointPublishingStrategy.   * When using a generated default certificate, the certificate will be valid   for domain and its subdomains. See defaultCertificate.   * The value is published to individual Route statuses so that end-users   know where to target external DNS records.   domain must be unique among all IngressControllers, and cannot be updated.   If empty, defaults to ingress.config.openshift.io/cluster .spec.domain. |  [optional]
**endpointPublishingStrategy** | [**IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategy**](IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategy.md) |  |  [optional]
**namespaceSelector** | [**IoOpenshiftOperatorV1IngressControllerSpecNamespaceSelector**](IoOpenshiftOperatorV1IngressControllerSpecNamespaceSelector.md) |  |  [optional]
**nodePlacement** | [**IoOpenshiftOperatorV1IngressControllerSpecNodePlacement**](IoOpenshiftOperatorV1IngressControllerSpecNodePlacement.md) |  |  [optional]
**replicas** | **Integer** | replicas is the desired number of ingress controller replicas. If unset, defaults to 2. |  [optional]
**routeSelector** | [**IoOpenshiftOperatorV1IngressControllerSpecRouteSelector**](IoOpenshiftOperatorV1IngressControllerSpecRouteSelector.md) |  |  [optional]
**tlsSecurityProfile** | [**IoOpenshiftOperatorV1IngressControllerSpecTlsSecurityProfile**](IoOpenshiftOperatorV1IngressControllerSpecTlsSecurityProfile.md) |  |  [optional]



