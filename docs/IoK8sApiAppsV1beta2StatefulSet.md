
# IoK8sApiAppsV1beta2StatefulSet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMeta**](IoK8sApimachineryPkgApisMetaV1ObjectMeta.md) |  |  [optional]
**spec** | [**IoK8sApiAppsV1beta2StatefulSetSpec**](IoK8sApiAppsV1beta2StatefulSetSpec.md) | Spec defines the desired identities of pods in this set. |  [optional]
**status** | [**IoK8sApiAppsV1beta2StatefulSetStatus**](IoK8sApiAppsV1beta2StatefulSetStatus.md) | Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time. |  [optional]



