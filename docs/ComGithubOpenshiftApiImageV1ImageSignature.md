
# ComGithubOpenshiftApiImageV1ImageSignature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**conditions** | [**List&lt;ComGithubOpenshiftApiImageV1SignatureCondition&gt;**](ComGithubOpenshiftApiImageV1SignatureCondition.md) | Conditions represent the latest available observations of a signature&#39;s current state. |  [optional]
**content** | **byte[]** | Required: An opaque binary string which is an image&#39;s signature. | 
**created** | **String** | If specified, it is the time of signature&#39;s creation. |  [optional]
**imageIdentity** | **String** | A human readable string representing image&#39;s identity. It could be a product name and version, or an image pull spec (e.g. \&quot;registry.access.redhat.com/rhel7/rhel:7.2\&quot;). |  [optional]
**issuedBy** | [**ComGithubOpenshiftApiImageV1SignatureIssuer**](ComGithubOpenshiftApiImageV1SignatureIssuer.md) | If specified, it holds information about an issuer of signing certificate or key (a person or entity who signed the signing certificate or key). |  [optional]
**issuedTo** | [**ComGithubOpenshiftApiImageV1SignatureSubject**](ComGithubOpenshiftApiImageV1SignatureSubject.md) | If specified, it holds information about a subject of signing certificate or key (a person or entity who signed the image). |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMetaV2**](IoK8sApimachineryPkgApisMetaV1ObjectMetaV2.md) |  |  [optional]
**signedClaims** | **Map&lt;String, String&gt;** | Contains claims from the signature. |  [optional]
**type** | **String** | Required: Describes a type of stored blob. | 



