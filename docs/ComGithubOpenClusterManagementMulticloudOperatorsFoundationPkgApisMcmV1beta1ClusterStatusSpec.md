
# ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterStatusSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capacity** | **Map&lt;String, String&gt;** | Capacity |  [optional]
**consoleURL** | **String** | ConcoleURL shows the url of icp console in managed cluster |  [optional]
**endpointOperatorVersion** | **String** | Version of Endpoint Operator |  [optional]
**endpointVersion** | **String** | Version of Endpoint |  [optional]
**klusterletCA** | **byte[]** | KlusterletCA is the ca data for klusterlet to authorize apiserver |  [optional]
**klusterletEndpoint** | [**IoK8sApiCoreV1EndpointAddress**](IoK8sApiCoreV1EndpointAddress.md) | KlusterletEndpoint shows the endpoint to connect to klusterlet of managed cluster |  [optional]
**klusterletPort** | [**IoK8sApiCoreV1EndpointPort**](IoK8sApiCoreV1EndpointPort.md) | KlusterletPort shows the port to connect to klusterlet of managed cluster |  [optional]
**klusterletVersion** | **String** | Version of Klusterlet |  [optional]
**masterAddresses** | [**List&lt;IoK8sApiCoreV1EndpointAddress&gt;**](IoK8sApiCoreV1EndpointAddress.md) | MasterIP shows the master IP of managed cluster |  [optional]
**monitoringScrapeTarget** | **String** | MonitoringScrapeTarget is the scrape target to be used |  [optional]
**usage** | **Map&lt;String, String&gt;** | Usage |  [optional]
**version** | **String** | Version of member cluster |  [optional]



