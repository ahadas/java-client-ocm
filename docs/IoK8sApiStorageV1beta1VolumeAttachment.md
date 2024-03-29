
# IoK8sApiStorageV1beta1VolumeAttachment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMeta**](IoK8sApimachineryPkgApisMetaV1ObjectMeta.md) | Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata |  [optional]
**spec** | [**IoK8sApiStorageV1beta1VolumeAttachmentSpec**](IoK8sApiStorageV1beta1VolumeAttachmentSpec.md) | Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system. | 
**status** | [**IoK8sApiStorageV1beta1VolumeAttachmentStatus**](IoK8sApiStorageV1beta1VolumeAttachmentStatus.md) | Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher. |  [optional]



