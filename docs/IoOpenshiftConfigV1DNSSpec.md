
# IoOpenshiftConfigV1DNSSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDomain** | **String** | baseDomain is the base domain of the cluster. All managed DNS records will be sub-domains of this base.   For example, given the base domain &#x60;openshift.example.com&#x60;, an API server DNS record may be created for &#x60;cluster-api.openshift.example.com&#x60;.   Once set, this field cannot be changed. |  [optional]
**privateZone** | [**IoOpenshiftConfigV1DNSSpecPrivateZone**](IoOpenshiftConfigV1DNSSpecPrivateZone.md) |  |  [optional]
**publicZone** | [**IoOpenshiftConfigV1DNSSpecPublicZone**](IoOpenshiftConfigV1DNSSpecPublicZone.md) |  |  [optional]



