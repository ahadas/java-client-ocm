# AutoscalingOpenshiftIoV1beta1Api

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler**](AutoscalingOpenshiftIoV1beta1Api.md#createAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler) | **POST** /apis/autoscaling.openshift.io/v1beta1/namespaces/{namespace}/machineautoscalers | 
[**deleteAutoscalingOpenshiftIoV1beta1CollectionNamespacedMachineAutoscaler**](AutoscalingOpenshiftIoV1beta1Api.md#deleteAutoscalingOpenshiftIoV1beta1CollectionNamespacedMachineAutoscaler) | **DELETE** /apis/autoscaling.openshift.io/v1beta1/namespaces/{namespace}/machineautoscalers | 
[**deleteAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler**](AutoscalingOpenshiftIoV1beta1Api.md#deleteAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler) | **DELETE** /apis/autoscaling.openshift.io/v1beta1/namespaces/{namespace}/machineautoscalers/{name} | 
[**listAutoscalingOpenshiftIoV1beta1MachineAutoscalerForAllNamespaces**](AutoscalingOpenshiftIoV1beta1Api.md#listAutoscalingOpenshiftIoV1beta1MachineAutoscalerForAllNamespaces) | **GET** /apis/autoscaling.openshift.io/v1beta1/machineautoscalers | 
[**listAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler**](AutoscalingOpenshiftIoV1beta1Api.md#listAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler) | **GET** /apis/autoscaling.openshift.io/v1beta1/namespaces/{namespace}/machineautoscalers | 
[**patchAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler**](AutoscalingOpenshiftIoV1beta1Api.md#patchAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler) | **PATCH** /apis/autoscaling.openshift.io/v1beta1/namespaces/{namespace}/machineautoscalers/{name} | 
[**patchAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus**](AutoscalingOpenshiftIoV1beta1Api.md#patchAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus) | **PATCH** /apis/autoscaling.openshift.io/v1beta1/namespaces/{namespace}/machineautoscalers/{name}/status | 
[**readAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler**](AutoscalingOpenshiftIoV1beta1Api.md#readAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler) | **GET** /apis/autoscaling.openshift.io/v1beta1/namespaces/{namespace}/machineautoscalers/{name} | 
[**readAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus**](AutoscalingOpenshiftIoV1beta1Api.md#readAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus) | **GET** /apis/autoscaling.openshift.io/v1beta1/namespaces/{namespace}/machineautoscalers/{name}/status | 
[**replaceAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler**](AutoscalingOpenshiftIoV1beta1Api.md#replaceAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler) | **PUT** /apis/autoscaling.openshift.io/v1beta1/namespaces/{namespace}/machineautoscalers/{name} | 
[**replaceAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus**](AutoscalingOpenshiftIoV1beta1Api.md#replaceAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus) | **PUT** /apis/autoscaling.openshift.io/v1beta1/namespaces/{namespace}/machineautoscalers/{name}/status | 


<a name="createAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler"></a>
# **createAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler**
> IoOpenshiftAutoscalingV1beta1MachineAutoscaler createAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler(namespace, body, pretty, dryRun, fieldManager)



create a MachineAutoscaler

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.AutoscalingOpenshiftIoV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingOpenshiftIoV1beta1Api apiInstance = new AutoscalingOpenshiftIoV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoOpenshiftAutoscalingV1beta1MachineAutoscaler body = new IoOpenshiftAutoscalingV1beta1MachineAutoscaler(); // IoOpenshiftAutoscalingV1beta1MachineAutoscaler | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
String fieldManager = "fieldManager_example"; // String | fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint.
try {
    IoOpenshiftAutoscalingV1beta1MachineAutoscaler result = apiInstance.createAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler(namespace, body, pretty, dryRun, fieldManager);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingOpenshiftIoV1beta1Api#createAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoOpenshiftAutoscalingV1beta1MachineAutoscaler**](IoOpenshiftAutoscalingV1beta1MachineAutoscaler.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **fieldManager** | **String**| fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. | [optional]

### Return type

[**IoOpenshiftAutoscalingV1beta1MachineAutoscaler**](IoOpenshiftAutoscalingV1beta1MachineAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="deleteAutoscalingOpenshiftIoV1beta1CollectionNamespacedMachineAutoscaler"></a>
# **deleteAutoscalingOpenshiftIoV1beta1CollectionNamespacedMachineAutoscaler**
> IoK8sApimachineryPkgApisMetaV1Status deleteAutoscalingOpenshiftIoV1beta1CollectionNamespacedMachineAutoscaler(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch)



delete collection of MachineAutoscaler

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.AutoscalingOpenshiftIoV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingOpenshiftIoV1beta1Api apiInstance = new AutoscalingOpenshiftIoV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Boolean allowWatchBookmarks = true; // Boolean | allowWatchBookmarks requests watch events with type \"BOOKMARK\". Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server's discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored.  This field is beta.
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \"next key\".  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteAutoscalingOpenshiftIoV1beta1CollectionNamespacedMachineAutoscaler(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingOpenshiftIoV1beta1Api#deleteAutoscalingOpenshiftIoV1beta1CollectionNamespacedMachineAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **allowWatchBookmarks** | **Boolean**| allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored.  This field is beta. | [optional]
 **_continue** | **String**| The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **limit** | **Integer**| limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**IoK8sApimachineryPkgApisMetaV1Status**](IoK8sApimachineryPkgApisMetaV1Status.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="deleteAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler"></a>
# **deleteAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler**
> IoK8sApimachineryPkgApisMetaV1Status deleteAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy)



delete a MachineAutoscaler

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.AutoscalingOpenshiftIoV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingOpenshiftIoV1beta1Api apiInstance = new AutoscalingOpenshiftIoV1beta1Api();
String name = "name_example"; // String | name of the MachineAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
IoK8sApimachineryPkgApisMetaV1DeleteOptions body = new IoK8sApimachineryPkgApisMetaV1DeleteOptions(); // IoK8sApimachineryPkgApisMetaV1DeleteOptions | 
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
Integer gracePeriodSeconds = 56; // Integer | The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
Boolean orphanDependents = true; // Boolean | Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
String propagationPolicy = "propagationPolicy_example"; // String | Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.
try {
    IoK8sApimachineryPkgApisMetaV1Status result = apiInstance.deleteAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingOpenshiftIoV1beta1Api#deleteAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the MachineAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **body** | [**IoK8sApimachineryPkgApisMetaV1DeleteOptions**](IoK8sApimachineryPkgApisMetaV1DeleteOptions.md)|  | [optional]
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **gracePeriodSeconds** | **Integer**| The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. | [optional]
 **orphanDependents** | **Boolean**| Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. | [optional]
 **propagationPolicy** | **String**| Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. | [optional]

### Return type

[**IoK8sApimachineryPkgApisMetaV1Status**](IoK8sApimachineryPkgApisMetaV1Status.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="listAutoscalingOpenshiftIoV1beta1MachineAutoscalerForAllNamespaces"></a>
# **listAutoscalingOpenshiftIoV1beta1MachineAutoscalerForAllNamespaces**
> IoOpenshiftAutoscalingV1beta1MachineAutoscalerList listAutoscalingOpenshiftIoV1beta1MachineAutoscalerForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch)



list objects of kind MachineAutoscaler

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.AutoscalingOpenshiftIoV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingOpenshiftIoV1beta1Api apiInstance = new AutoscalingOpenshiftIoV1beta1Api();
Boolean allowWatchBookmarks = true; // Boolean | allowWatchBookmarks requests watch events with type \"BOOKMARK\". Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server's discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored.  This field is beta.
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \"next key\".  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoOpenshiftAutoscalingV1beta1MachineAutoscalerList result = apiInstance.listAutoscalingOpenshiftIoV1beta1MachineAutoscalerForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingOpenshiftIoV1beta1Api#listAutoscalingOpenshiftIoV1beta1MachineAutoscalerForAllNamespaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowWatchBookmarks** | **Boolean**| allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored.  This field is beta. | [optional]
 **_continue** | **String**| The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **limit** | **Integer**| limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. | [optional]
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**IoOpenshiftAutoscalingV1beta1MachineAutoscalerList**](IoOpenshiftAutoscalingV1beta1MachineAutoscalerList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="listAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler"></a>
# **listAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler**
> IoOpenshiftAutoscalingV1beta1MachineAutoscalerList listAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch)



list objects of kind MachineAutoscaler

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.AutoscalingOpenshiftIoV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingOpenshiftIoV1beta1Api apiInstance = new AutoscalingOpenshiftIoV1beta1Api();
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
Boolean allowWatchBookmarks = true; // Boolean | allowWatchBookmarks requests watch events with type \"BOOKMARK\". Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server's discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored.  This field is beta.
String _continue = "_continue_example"; // String | The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \"next key\".  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
String fieldSelector = "fieldSelector_example"; // String | A selector to restrict the list of returned objects by their fields. Defaults to everything.
String labelSelector = "labelSelector_example"; // String | A selector to restrict the list of returned objects by their labels. Defaults to everything.
Integer limit = 56; // Integer | limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
String resourceVersion = "resourceVersion_example"; // String | When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
Integer timeoutSeconds = 56; // Integer | Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity.
Boolean watch = true; // Boolean | Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion.
try {
    IoOpenshiftAutoscalingV1beta1MachineAutoscalerList result = apiInstance.listAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingOpenshiftIoV1beta1Api#listAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **allowWatchBookmarks** | **Boolean**| allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored.  This field is beta. | [optional]
 **_continue** | **String**| The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. | [optional]
 **fieldSelector** | **String**| A selector to restrict the list of returned objects by their fields. Defaults to everything. | [optional]
 **labelSelector** | **String**| A selector to restrict the list of returned objects by their labels. Defaults to everything. | [optional]
 **limit** | **Integer**| limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. | [optional]
 **resourceVersion** | **String**| When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]
 **timeoutSeconds** | **Integer**| Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. | [optional]
 **watch** | **Boolean**| Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. | [optional]

### Return type

[**IoOpenshiftAutoscalingV1beta1MachineAutoscalerList**](IoOpenshiftAutoscalingV1beta1MachineAutoscalerList.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="patchAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler"></a>
# **patchAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler**
> IoOpenshiftAutoscalingV1beta1MachineAutoscaler patchAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler(name, namespace, body, pretty, dryRun, fieldManager)



partially update the specified MachineAutoscaler

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.AutoscalingOpenshiftIoV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingOpenshiftIoV1beta1Api apiInstance = new AutoscalingOpenshiftIoV1beta1Api();
String name = "name_example"; // String | name of the MachineAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sApimachineryPkgApisMetaV1Patch body = new IoK8sApimachineryPkgApisMetaV1Patch(); // IoK8sApimachineryPkgApisMetaV1Patch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
String fieldManager = "fieldManager_example"; // String | fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint.
try {
    IoOpenshiftAutoscalingV1beta1MachineAutoscaler result = apiInstance.patchAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler(name, namespace, body, pretty, dryRun, fieldManager);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingOpenshiftIoV1beta1Api#patchAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the MachineAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sApimachineryPkgApisMetaV1Patch**](IoK8sApimachineryPkgApisMetaV1Patch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **fieldManager** | **String**| fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. | [optional]

### Return type

[**IoOpenshiftAutoscalingV1beta1MachineAutoscaler**](IoOpenshiftAutoscalingV1beta1MachineAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/apply-patch+yaml
 - **Accept**: application/json, application/yaml

<a name="patchAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus"></a>
# **patchAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus**
> IoOpenshiftAutoscalingV1beta1MachineAutoscaler patchAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus(name, namespace, body, pretty, dryRun, fieldManager)



partially update status of the specified MachineAutoscaler

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.AutoscalingOpenshiftIoV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingOpenshiftIoV1beta1Api apiInstance = new AutoscalingOpenshiftIoV1beta1Api();
String name = "name_example"; // String | name of the MachineAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoK8sApimachineryPkgApisMetaV1Patch body = new IoK8sApimachineryPkgApisMetaV1Patch(); // IoK8sApimachineryPkgApisMetaV1Patch | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
String fieldManager = "fieldManager_example"; // String | fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint.
try {
    IoOpenshiftAutoscalingV1beta1MachineAutoscaler result = apiInstance.patchAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus(name, namespace, body, pretty, dryRun, fieldManager);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingOpenshiftIoV1beta1Api#patchAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the MachineAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoK8sApimachineryPkgApisMetaV1Patch**](IoK8sApimachineryPkgApisMetaV1Patch.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **fieldManager** | **String**| fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. | [optional]

### Return type

[**IoOpenshiftAutoscalingV1beta1MachineAutoscaler**](IoOpenshiftAutoscalingV1beta1MachineAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/merge-patch+json, application/apply-patch+yaml
 - **Accept**: application/json, application/yaml

<a name="readAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler"></a>
# **readAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler**
> IoOpenshiftAutoscalingV1beta1MachineAutoscaler readAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler(name, namespace, pretty, resourceVersion)



read the specified MachineAutoscaler

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.AutoscalingOpenshiftIoV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingOpenshiftIoV1beta1Api apiInstance = new AutoscalingOpenshiftIoV1beta1Api();
String name = "name_example"; // String | name of the MachineAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
try {
    IoOpenshiftAutoscalingV1beta1MachineAutoscaler result = apiInstance.readAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler(name, namespace, pretty, resourceVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingOpenshiftIoV1beta1Api#readAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the MachineAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **resourceVersion** | **String**| When specified: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]

### Return type

[**IoOpenshiftAutoscalingV1beta1MachineAutoscaler**](IoOpenshiftAutoscalingV1beta1MachineAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="readAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus"></a>
# **readAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus**
> IoOpenshiftAutoscalingV1beta1MachineAutoscaler readAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus(name, namespace, pretty, resourceVersion)



read status of the specified MachineAutoscaler

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.AutoscalingOpenshiftIoV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingOpenshiftIoV1beta1Api apiInstance = new AutoscalingOpenshiftIoV1beta1Api();
String name = "name_example"; // String | name of the MachineAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String resourceVersion = "resourceVersion_example"; // String | When specified: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it's 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
try {
    IoOpenshiftAutoscalingV1beta1MachineAutoscaler result = apiInstance.readAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus(name, namespace, pretty, resourceVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingOpenshiftIoV1beta1Api#readAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the MachineAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **resourceVersion** | **String**| When specified: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. | [optional]

### Return type

[**IoOpenshiftAutoscalingV1beta1MachineAutoscaler**](IoOpenshiftAutoscalingV1beta1MachineAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="replaceAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler"></a>
# **replaceAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler**
> IoOpenshiftAutoscalingV1beta1MachineAutoscaler replaceAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler(name, namespace, body, pretty, dryRun, fieldManager)



replace the specified MachineAutoscaler

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.AutoscalingOpenshiftIoV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingOpenshiftIoV1beta1Api apiInstance = new AutoscalingOpenshiftIoV1beta1Api();
String name = "name_example"; // String | name of the MachineAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoOpenshiftAutoscalingV1beta1MachineAutoscaler body = new IoOpenshiftAutoscalingV1beta1MachineAutoscaler(); // IoOpenshiftAutoscalingV1beta1MachineAutoscaler | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
String fieldManager = "fieldManager_example"; // String | fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint.
try {
    IoOpenshiftAutoscalingV1beta1MachineAutoscaler result = apiInstance.replaceAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler(name, namespace, body, pretty, dryRun, fieldManager);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingOpenshiftIoV1beta1Api#replaceAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscaler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the MachineAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoOpenshiftAutoscalingV1beta1MachineAutoscaler**](IoOpenshiftAutoscalingV1beta1MachineAutoscaler.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **fieldManager** | **String**| fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. | [optional]

### Return type

[**IoOpenshiftAutoscalingV1beta1MachineAutoscaler**](IoOpenshiftAutoscalingV1beta1MachineAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="replaceAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus"></a>
# **replaceAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus**
> IoOpenshiftAutoscalingV1beta1MachineAutoscaler replaceAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus(name, namespace, body, pretty, dryRun, fieldManager)



replace status of the specified MachineAutoscaler

### Example
```java
// Import classes:
//import open_cluster_management.ApiClient;
//import open_cluster_management.ApiException;
//import open_cluster_management.Configuration;
//import open_cluster_management.auth.*;
//import open_cluster_management.io.AutoscalingOpenshiftIoV1beta1Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: BearerToken
ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
BearerToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//BearerToken.setApiKeyPrefix("Token");

AutoscalingOpenshiftIoV1beta1Api apiInstance = new AutoscalingOpenshiftIoV1beta1Api();
String name = "name_example"; // String | name of the MachineAutoscaler
String namespace = "namespace_example"; // String | object name and auth scope, such as for teams and projects
IoOpenshiftAutoscalingV1beta1MachineAutoscaler body = new IoOpenshiftAutoscalingV1beta1MachineAutoscaler(); // IoOpenshiftAutoscalingV1beta1MachineAutoscaler | 
String pretty = "pretty_example"; // String | If 'true', then the output is pretty printed.
String dryRun = "dryRun_example"; // String | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
String fieldManager = "fieldManager_example"; // String | fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint.
try {
    IoOpenshiftAutoscalingV1beta1MachineAutoscaler result = apiInstance.replaceAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus(name, namespace, body, pretty, dryRun, fieldManager);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoscalingOpenshiftIoV1beta1Api#replaceAutoscalingOpenshiftIoV1beta1NamespacedMachineAutoscalerStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name of the MachineAutoscaler |
 **namespace** | **String**| object name and auth scope, such as for teams and projects |
 **body** | [**IoOpenshiftAutoscalingV1beta1MachineAutoscaler**](IoOpenshiftAutoscalingV1beta1MachineAutoscaler.md)|  |
 **pretty** | **String**| If &#39;true&#39;, then the output is pretty printed. | [optional]
 **dryRun** | **String**| When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed | [optional]
 **fieldManager** | **String**| fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. | [optional]

### Return type

[**IoOpenshiftAutoscalingV1beta1MachineAutoscaler**](IoOpenshiftAutoscalingV1beta1MachineAutoscaler.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

