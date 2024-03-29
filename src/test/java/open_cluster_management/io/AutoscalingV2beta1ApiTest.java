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
import open_cluster_management.io.IoK8sApiAutoscalingV2beta1HorizontalPodAutoscaler;
import open_cluster_management.io.IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerList;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1APIResourceList;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1DeleteOptions;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1Patch;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1Status;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1WatchEvent;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AutoscalingV2beta1Api
 */
@Ignore
public class AutoscalingV2beta1ApiTest {

    private final AutoscalingV2beta1Api api = new AutoscalingV2beta1Api();

    
    /**
     * 
     *
     * create a HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAutoscalingV2beta1NamespacedHorizontalPodAutoscalerTest() throws ApiException {
        String namespace = null;
        IoK8sApiAutoscalingV2beta1HorizontalPodAutoscaler body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAutoscalingV2beta1HorizontalPodAutoscaler response = api.createAutoscalingV2beta1NamespacedHorizontalPodAutoscaler(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAutoscalingV2beta1CollectionNamespacedHorizontalPodAutoscalerTest() throws ApiException {
        String namespace = null;
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteAutoscalingV2beta1CollectionNamespacedHorizontalPodAutoscaler(namespace, pretty, allowWatchBookmarks, body, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAutoscalingV2beta1NamespacedHorizontalPodAutoscalerTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteAutoscalingV2beta1NamespacedHorizontalPodAutoscaler(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

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
    public void getAutoscalingV2beta1APIResourcesTest() throws ApiException {
        IoK8sApimachineryPkgApisMetaV1APIResourceList response = api.getAutoscalingV2beta1APIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAutoscalingV2beta1HorizontalPodAutoscalerForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerList response = api.listAutoscalingV2beta1HorizontalPodAutoscalerForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAutoscalingV2beta1NamespacedHorizontalPodAutoscalerTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerList response = api.listAutoscalingV2beta1NamespacedHorizontalPodAutoscaler(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchAutoscalingV2beta1NamespacedHorizontalPodAutoscalerTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        IoK8sApiAutoscalingV2beta1HorizontalPodAutoscaler response = api.patchAutoscalingV2beta1NamespacedHorizontalPodAutoscaler(name, namespace, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchAutoscalingV2beta1NamespacedHorizontalPodAutoscalerStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        IoK8sApiAutoscalingV2beta1HorizontalPodAutoscaler response = api.patchAutoscalingV2beta1NamespacedHorizontalPodAutoscalerStatus(name, namespace, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAutoscalingV2beta1NamespacedHorizontalPodAutoscalerTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        IoK8sApiAutoscalingV2beta1HorizontalPodAutoscaler response = api.readAutoscalingV2beta1NamespacedHorizontalPodAutoscaler(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAutoscalingV2beta1NamespacedHorizontalPodAutoscalerStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApiAutoscalingV2beta1HorizontalPodAutoscaler response = api.readAutoscalingV2beta1NamespacedHorizontalPodAutoscalerStatus(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAutoscalingV2beta1NamespacedHorizontalPodAutoscalerTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApiAutoscalingV2beta1HorizontalPodAutoscaler body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAutoscalingV2beta1HorizontalPodAutoscaler response = api.replaceAutoscalingV2beta1NamespacedHorizontalPodAutoscaler(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified HorizontalPodAutoscaler
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAutoscalingV2beta1NamespacedHorizontalPodAutoscalerStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApiAutoscalingV2beta1HorizontalPodAutoscaler body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAutoscalingV2beta1HorizontalPodAutoscaler response = api.replaceAutoscalingV2beta1NamespacedHorizontalPodAutoscalerStatus(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch individual changes to a list of HorizontalPodAutoscaler. deprecated: use the &#39;watch&#39; parameter with a list operation instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAutoscalingV2beta1HorizontalPodAutoscalerListForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAutoscalingV2beta1HorizontalPodAutoscalerListForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch changes to an object of kind HorizontalPodAutoscaler. deprecated: use the &#39;watch&#39; parameter with a list operation instead, filtered to a single item with the &#39;fieldSelector&#39; parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAutoscalingV2beta1NamespacedHorizontalPodAutoscalerTest() throws ApiException {
        String name = null;
        String namespace = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAutoscalingV2beta1NamespacedHorizontalPodAutoscaler(name, namespace, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch individual changes to a list of HorizontalPodAutoscaler. deprecated: use the &#39;watch&#39; parameter with a list operation instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAutoscalingV2beta1NamespacedHorizontalPodAutoscalerListTest() throws ApiException {
        String namespace = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAutoscalingV2beta1NamespacedHorizontalPodAutoscalerList(namespace, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
}
