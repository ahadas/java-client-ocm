
# ComGithubOpenshiftApiImageV1ImageStreamLayers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**blobs** | [**Map&lt;String, ComGithubOpenshiftApiImageV1ImageLayerData&gt;**](ComGithubOpenshiftApiImageV1ImageLayerData.md) | blobs is a map of blob name to metadata about the blob. | 
**images** | [**Map&lt;String, ComGithubOpenshiftApiImageV1ImageBlobReferences&gt;**](ComGithubOpenshiftApiImageV1ImageBlobReferences.md) | images is a map between an image name and the names of the blobs and config that comprise the image. | 
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMetaV2**](IoK8sApimachineryPkgApisMetaV1ObjectMetaV2.md) |  |  [optional]



