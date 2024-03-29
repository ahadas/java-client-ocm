
# IoK8sApiRbacV1beta1ClusterRole

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationRule** | [**IoK8sApiRbacV1beta1AggregationRule**](IoK8sApiRbacV1beta1AggregationRule.md) | AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller. |  [optional]
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMeta**](IoK8sApimachineryPkgApisMetaV1ObjectMeta.md) | Standard object&#39;s metadata. |  [optional]
**rules** | [**List&lt;IoK8sApiRbacV1beta1PolicyRule&gt;**](IoK8sApiRbacV1beta1PolicyRule.md) | Rules holds all the PolicyRules for this ClusterRole |  [optional]



