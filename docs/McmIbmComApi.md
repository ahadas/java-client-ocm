# McmIbmComApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMcmIbmComAPIGroup**](McmIbmComApi.md#getMcmIbmComAPIGroup) | **GET** /apis/mcm.ibm.com/ | 


<a name="getMcmIbmComAPIGroup"></a>
# **getMcmIbmComAPIGroup**
> IoK8sApimachineryPkgApisMetaV1APIGroup getMcmIbmComAPIGroup()



get information of a group

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.McmIbmComApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

McmIbmComApi apiInstance = new McmIbmComApi();
try {
    IoK8sApimachineryPkgApisMetaV1APIGroup result = apiInstance.getMcmIbmComAPIGroup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling McmIbmComApi#getMcmIbmComAPIGroup");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IoK8sApimachineryPkgApisMetaV1APIGroup**](IoK8sApimachineryPkgApisMetaV1APIGroup.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

