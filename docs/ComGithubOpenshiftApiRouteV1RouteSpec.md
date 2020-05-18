
# ComGithubOpenshiftApiRouteV1RouteSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alternateBackends** | [**List&lt;ComGithubOpenshiftApiRouteV1RouteTargetReference&gt;**](ComGithubOpenshiftApiRouteV1RouteTargetReference.md) | alternateBackends allows up to 3 additional backends to be assigned to the route. Only the Service kind is allowed, and it will be defaulted to Service. Use the weight field in RouteTargetReference object to specify relative preference. |  [optional]
**host** | **String** | host is an alias/DNS that points to the service. Optional. If not specified a route name will typically be automatically chosen. Must follow DNS952 subdomain conventions. |  [optional]
**path** | **String** | path that the router watches for, to route traffic for to the service. Optional |  [optional]
**port** | [**ComGithubOpenshiftApiRouteV1RoutePort**](ComGithubOpenshiftApiRouteV1RoutePort.md) | If specified, the port to be used by the router. Most routers will use all endpoints exposed by the service by default - set this value to instruct routers which port to use. |  [optional]
**subdomain** | **String** | subdomain is a DNS subdomain that is requested within the ingress controller&#39;s domain (as a subdomain). If host is set this field is ignored. An ingress controller may choose to ignore this suggested name, in which case the controller will report the assigned name in the status.ingress array or refuse to admit the route. If this value is set and the server does not support this field host will be populated automatically. Otherwise host is left empty. The field may have multiple parts separated by a dot, but not all ingress controllers may honor the request. This field may not be changed after creation except by a user with the update routes/custom-host permission.  Example: subdomain &#x60;frontend&#x60; automatically receives the router subdomain &#x60;apps.mycluster.com&#x60; to have a full hostname &#x60;frontend.apps.mycluster.com&#x60;. |  [optional]
**tls** | [**ComGithubOpenshiftApiRouteV1TLSConfig**](ComGithubOpenshiftApiRouteV1TLSConfig.md) | The tls field provides the ability to configure certificates and termination for the route. |  [optional]
**to** | [**ComGithubOpenshiftApiRouteV1RouteTargetReference**](ComGithubOpenshiftApiRouteV1RouteTargetReference.md) | to is an object the route should use as the primary backend. Only the Service kind is allowed, and it will be defaulted to Service. If the weight field (0-256 default 100) is set to zero, no traffic will be sent to this backend. | 
**wildcardPolicy** | **String** | Wildcard policy if any for the route. Currently only &#39;Subdomain&#39; or &#39;None&#39; is allowed. |  [optional]



