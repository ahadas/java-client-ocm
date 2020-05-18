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
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1DeleteOptions;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1Patch;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1Status;
import open_cluster_management.io.IoOpenshiftTunedV1Tuned;
import open_cluster_management.io.IoOpenshiftTunedV1TunedList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TunedOpenshiftIoV1Api
 */
@Ignore
public class TunedOpenshiftIoV1ApiTest {

    private final TunedOpenshiftIoV1Api api = new TunedOpenshiftIoV1Api();

    
    /**
     * 
     *
     * create a Tuned
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTunedOpenshiftIoV1NamespacedTunedTest() throws ApiException {
        String namespace = null;
        IoOpenshiftTunedV1Tuned body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoOpenshiftTunedV1Tuned response = api.createTunedOpenshiftIoV1NamespacedTuned(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of Tuned
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTunedOpenshiftIoV1CollectionNamespacedTunedTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteTunedOpenshiftIoV1CollectionNamespacedTuned(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a Tuned
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTunedOpenshiftIoV1NamespacedTunedTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteTunedOpenshiftIoV1NamespacedTuned(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind Tuned
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTunedOpenshiftIoV1NamespacedTunedTest() throws ApiException {
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
        IoOpenshiftTunedV1TunedList response = api.listTunedOpenshiftIoV1NamespacedTuned(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind Tuned
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTunedOpenshiftIoV1TunedForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoOpenshiftTunedV1TunedList response = api.listTunedOpenshiftIoV1TunedForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified Tuned
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchTunedOpenshiftIoV1NamespacedTunedTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoOpenshiftTunedV1Tuned response = api.patchTunedOpenshiftIoV1NamespacedTuned(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified Tuned
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readTunedOpenshiftIoV1NamespacedTunedTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        IoOpenshiftTunedV1Tuned response = api.readTunedOpenshiftIoV1NamespacedTuned(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified Tuned
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceTunedOpenshiftIoV1NamespacedTunedTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoOpenshiftTunedV1Tuned body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoOpenshiftTunedV1Tuned response = api.replaceTunedOpenshiftIoV1NamespacedTuned(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
}
