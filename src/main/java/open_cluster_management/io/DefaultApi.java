/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package open_cluster_management.io;

import open_cluster_management.ApiCallback;
import open_cluster_management.ApiClient;
import open_cluster_management.ApiException;
import open_cluster_management.ApiResponse;
import open_cluster_management.Configuration;
import open_cluster_management.Pair;
import open_cluster_management.ProgressRequestBody;
import open_cluster_management.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import open_cluster_management.io.ComGithubOpenshiftApiTemplateV1Template;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createNamespacedProcessedTemplateV1
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createNamespacedProcessedTemplateV1Call(String namespace, ComGithubOpenshiftApiTemplateV1Template body, String dryRun, String fieldManager, String pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/template.openshift.io/v1/namespaces/{namespace}/processedtemplates"
            .replaceAll("\\{" + "namespace" + "\\}", apiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (dryRun != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dryRun", dryRun));
        if (fieldManager != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fieldManager", fieldManager));
        if (pretty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pretty", pretty));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createNamespacedProcessedTemplateV1ValidateBeforeCall(String namespace, ComGithubOpenshiftApiTemplateV1Template body, String dryRun, String fieldManager, String pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling createNamespacedProcessedTemplateV1(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createNamespacedProcessedTemplateV1(Async)");
        }
        

        com.squareup.okhttp.Call call = createNamespacedProcessedTemplateV1Call(namespace, body, dryRun, fieldManager, pretty, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * create a Template
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @return ComGithubOpenshiftApiTemplateV1Template
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ComGithubOpenshiftApiTemplateV1Template createNamespacedProcessedTemplateV1(String namespace, ComGithubOpenshiftApiTemplateV1Template body, String dryRun, String fieldManager, String pretty) throws ApiException {
        ApiResponse<ComGithubOpenshiftApiTemplateV1Template> resp = createNamespacedProcessedTemplateV1WithHttpInfo(namespace, body, dryRun, fieldManager, pretty);
        return resp.getData();
    }

    /**
     * 
     * create a Template
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @return ApiResponse&lt;ComGithubOpenshiftApiTemplateV1Template&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ComGithubOpenshiftApiTemplateV1Template> createNamespacedProcessedTemplateV1WithHttpInfo(String namespace, ComGithubOpenshiftApiTemplateV1Template body, String dryRun, String fieldManager, String pretty) throws ApiException {
        com.squareup.okhttp.Call call = createNamespacedProcessedTemplateV1ValidateBeforeCall(namespace, body, dryRun, fieldManager, pretty, null, null);
        Type localVarReturnType = new TypeToken<ComGithubOpenshiftApiTemplateV1Template>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * create a Template
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createNamespacedProcessedTemplateV1Async(String namespace, ComGithubOpenshiftApiTemplateV1Template body, String dryRun, String fieldManager, String pretty, final ApiCallback<ComGithubOpenshiftApiTemplateV1Template> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createNamespacedProcessedTemplateV1ValidateBeforeCall(namespace, body, dryRun, fieldManager, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ComGithubOpenshiftApiTemplateV1Template>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}