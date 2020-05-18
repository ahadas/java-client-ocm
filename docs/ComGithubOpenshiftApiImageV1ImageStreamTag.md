
# ComGithubOpenshiftApiImageV1ImageStreamTag

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**conditions** | [**List&lt;ComGithubOpenshiftApiImageV1TagEventCondition&gt;**](ComGithubOpenshiftApiImageV1TagEventCondition.md) | conditions is an array of conditions that apply to the image stream tag. |  [optional]
**generation** | **Long** | generation is the current generation of the tagged image - if tag is provided and this value is not equal to the tag generation, a user has requested an import that has not completed, or conditions will be filled out indicating any error. | 
**image** | [**ComGithubOpenshiftApiImageV1Image**](ComGithubOpenshiftApiImageV1Image.md) | image associated with the ImageStream and tag. | 
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**lookupPolicy** | [**ComGithubOpenshiftApiImageV1ImageLookupPolicy**](ComGithubOpenshiftApiImageV1ImageLookupPolicy.md) | lookupPolicy indicates whether this tag will handle image references in this namespace. | 
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMetaV2**](IoK8sApimachineryPkgApisMetaV1ObjectMetaV2.md) |  |  [optional]
**tag** | [**ComGithubOpenshiftApiImageV1TagReference**](ComGithubOpenshiftApiImageV1TagReference.md) | tag is the spec tag associated with this image stream tag, and it may be null if only pushes have occurred to this image stream. | 



