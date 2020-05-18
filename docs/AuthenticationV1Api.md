# AuthenticationV1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthenticationV1TokenReview**](AuthenticationV1Api.md#createAuthenticationV1TokenReview) | **POST** /apis/authentication.k8s.io/v1/tokenreviews | 
[**getAuthenticationV1APIResources**](AuthenticationV1Api.md#getAuthenticationV1APIResources) | **GET** /apis/authentication.k8s.io/v1/ | 


<a name="createAuthenticationV1TokenReview"></a>
# **createAuthenticationV1TokenReview**
> IoK8sApiAuthenticationV1TokenReview createAuthenticationV1TokenReview(body, dryRun, fieldManager, pretty)



create a TokenReview

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.AuthenticationV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthenticationV1Api apiInstance = new AuthenticationV1Api();
IoK8sApiAuthenticationV1TokenReview body = new IoK8sApiAuthenticationV1TokenReview(); // IoK8sApiAuthenticationV1TokenReview | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
String fieldManager = "fieldManager_example"; // String | fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    IoK8sApiAuthenticationV1TokenReview result = apiInstance.createAuthenticationV1TokenReview(body, dryRun, fieldManager, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationV1Api#createAuthenticationV1TokenReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IoK8sApiAuthenticationV1TokenReview**](IoK8sApiAuthenticationV1TokenReview.md)|  |
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **fieldManager** | **String**| fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**IoK8sApiAuthenticationV1TokenReview**](IoK8sApiAuthenticationV1TokenReview.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

<a name="getAuthenticationV1APIResources"></a>
# **getAuthenticationV1APIResources**
> IoK8sApimachineryPkgApisMetaV1APIResourceList getAuthenticationV1APIResources()



get available resources

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.AuthenticationV1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AuthenticationV1Api apiInstance = new AuthenticationV1Api();
try {
    IoK8sApimachineryPkgApisMetaV1APIResourceList result = apiInstance.getAuthenticationV1APIResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationV1Api#getAuthenticationV1APIResources");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IoK8sApimachineryPkgApisMetaV1APIResourceList**](IoK8sApimachineryPkgApisMetaV1APIResourceList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, application/vnd.kubernetes.protobuf
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

