# ApisApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAPIVersions**](ApisApi.md#getAPIVersions) | **GET** /apis/ | 


<a name="getAPIVersions"></a>
# **getAPIVersions**
> IoK8sApimachineryPkgApisMetaV1APIGroupList getAPIVersions()



get available API versions

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.ApisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

ApisApi apiInstance = new ApisApi();
try {
    IoK8sApimachineryPkgApisMetaV1APIGroupList result = apiInstance.getAPIVersions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApisApi#getAPIVersions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IoK8sApimachineryPkgApisMetaV1APIGroupList**](IoK8sApimachineryPkgApisMetaV1APIGroupList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

