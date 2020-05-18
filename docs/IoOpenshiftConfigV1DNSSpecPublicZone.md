
# IoOpenshiftConfigV1DNSSpecPublicZone

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | id is the identifier that can be used to find the DNS hosted zone.   on AWS zone can be fetched using &#x60;ID&#x60; as id in [1] on Azure zone can be fetched using &#x60;ID&#x60; as a pre-determined name in [2], on GCP zone can be fetched using &#x60;ID&#x60; as a pre-determined name in [3].   [1]: https://docs.aws.amazon.com/cli/latest/reference/route53/get-hosted-zone.html#options [2]: https://docs.microsoft.com/en-us/cli/azure/network/dns/zone?view&#x3D;azure-cli-latest#az-network-dns-zone-show [3]: https://cloud.google.com/dns/docs/reference/v1/managedZones/get |  [optional]
**tags** | **Map&lt;String, String&gt;** | tags can be used to query the DNS hosted zone.   on AWS, resourcegroupstaggingapi [1] can be used to fetch a zone using &#x60;Tags&#x60; as tag-filters,   [1]: https://docs.aws.amazon.com/cli/latest/reference/resourcegroupstaggingapi/get-resources.html#options |  [optional]



