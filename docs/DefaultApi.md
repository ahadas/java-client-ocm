# DefaultApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNamespacedProcessedTemplateV1**](DefaultApi.md#createNamespacedProcessedTemplateV1) | **POST** /apis/template.openshift.io/v1/namespaces/{namespace}/processedtemplates | 


<a name="createNamespacedProcessedTemplateV1"></a>
# **createNamespacedProcessedTemplateV1**
> ComGithubOpenshiftApiTemplateV1Template createNamespacedProcessedTemplateV1(namespace, body, dryRun, fieldManager, pretty)



create a Template

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
ComGithubOpenshiftApiTemplateV1Template body = new ComGithubOpenshiftApiTemplateV1Template(); // ComGithubOpenshiftApiTemplateV1Template | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
String fieldManager = "fieldManager_example"; // String | fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
try {
    ComGithubOpenshiftApiTemplateV1Template result = apiInstance.createNamespacedProcessedTemplateV1(namespace, body, dryRun, fieldManager, pretty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createNamespacedProcessedTemplateV1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**ComGithubOpenshiftApiTemplateV1Template**](ComGithubOpenshiftApiTemplateV1Template.md)|  |
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **fieldManager** | **String**| fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]

### Return type

[**ComGithubOpenshiftApiTemplateV1Template**](ComGithubOpenshiftApiTemplateV1Template.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

