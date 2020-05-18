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

import open_cluster_management.ApiException;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1APIResourceList;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1DeleteOptions;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1Patch;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1Status;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1WatchEvent;
import open_cluster_management.io.IoK8sKubeAggregatorPkgApisApiregistrationV1APIService;
import open_cluster_management.io.IoK8sKubeAggregatorPkgApisApiregistrationV1APIServiceList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiregistrationV1Api
 */
@Ignore
public class ApiregistrationV1ApiTest {

    private final ApiregistrationV1Api api = new ApiregistrationV1Api();

    
    /**
     * 
     *
     * create an APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createApiregistrationV1APIServiceTest() throws ApiException {
        IoK8sKubeAggregatorPkgApisApiregistrationV1APIService body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sKubeAggregatorPkgApisApiregistrationV1APIService response = api.createApiregistrationV1APIService(body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete an APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteApiregistrationV1APIServiceTest() throws ApiException {
        String name = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteApiregistrationV1APIService(name, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteApiregistrationV1CollectionAPIServiceTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String _continue = null;
        String dryRun = null;
        String fieldSelector = null;
        Integer gracePeriodSeconds = null;
        String labelSelector = null;
        Integer limit = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteApiregistrationV1CollectionAPIService(pretty, allowWatchBookmarks, body, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getApiregistrationV1APIResourcesTest() throws ApiException {
        IoK8sApimachineryPkgApisMetaV1APIResourceList response = api.getApiregistrationV1APIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listApiregistrationV1APIServiceTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sKubeAggregatorPkgApisApiregistrationV1APIServiceList response = api.listApiregistrationV1APIService(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchApiregistrationV1APIServiceTest() throws ApiException {
        String name = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        IoK8sKubeAggregatorPkgApisApiregistrationV1APIService response = api.patchApiregistrationV1APIService(name, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchApiregistrationV1APIServiceStatusTest() throws ApiException {
        String name = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        IoK8sKubeAggregatorPkgApisApiregistrationV1APIService response = api.patchApiregistrationV1APIServiceStatus(name, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readApiregistrationV1APIServiceTest() throws ApiException {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        IoK8sKubeAggregatorPkgApisApiregistrationV1APIService response = api.readApiregistrationV1APIService(name, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readApiregistrationV1APIServiceStatusTest() throws ApiException {
        String name = null;
        String pretty = null;
        IoK8sKubeAggregatorPkgApisApiregistrationV1APIService response = api.readApiregistrationV1APIServiceStatus(name, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceApiregistrationV1APIServiceTest() throws ApiException {
        String name = null;
        IoK8sKubeAggregatorPkgApisApiregistrationV1APIService body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sKubeAggregatorPkgApisApiregistrationV1APIService response = api.replaceApiregistrationV1APIService(name, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified APIService
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceApiregistrationV1APIServiceStatusTest() throws ApiException {
        String name = null;
        IoK8sKubeAggregatorPkgApisApiregistrationV1APIService body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sKubeAggregatorPkgApisApiregistrationV1APIService response = api.replaceApiregistrationV1APIServiceStatus(name, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch changes to an object of kind APIService. deprecated: use the &#39;watch&#39; parameter with a list operation instead, filtered to a single item with the &#39;fieldSelector&#39; parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchApiregistrationV1APIServiceTest() throws ApiException {
        String name = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchApiregistrationV1APIService(name, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch individual changes to a list of APIService. deprecated: use the &#39;watch&#39; parameter with a list operation instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchApiregistrationV1APIServiceListTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchApiregistrationV1APIServiceList(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
}
