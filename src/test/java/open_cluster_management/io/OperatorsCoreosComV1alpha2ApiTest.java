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
import open_cluster_management.io.ComCoreosOperatorsV1alpha2OperatorGroup;
import open_cluster_management.io.ComCoreosOperatorsV1alpha2OperatorGroupList;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1DeleteOptions;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1Patch;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1Status;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OperatorsCoreosComV1alpha2Api
 */
@Ignore
public class OperatorsCoreosComV1alpha2ApiTest {

    private final OperatorsCoreosComV1alpha2Api api = new OperatorsCoreosComV1alpha2Api();

    
    /**
     * 
     *
     * create an OperatorGroup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOperatorsCoreosComV1alpha2NamespacedOperatorGroupTest() throws ApiException {
        String namespace = null;
        ComCoreosOperatorsV1alpha2OperatorGroup body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1alpha2OperatorGroup response = api.createOperatorsCoreosComV1alpha2NamespacedOperatorGroup(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of OperatorGroup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOperatorsCoreosComV1alpha2CollectionNamespacedOperatorGroupTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteOperatorsCoreosComV1alpha2CollectionNamespacedOperatorGroup(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete an OperatorGroup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOperatorsCoreosComV1alpha2NamespacedOperatorGroupTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteOperatorsCoreosComV1alpha2NamespacedOperatorGroup(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind OperatorGroup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOperatorsCoreosComV1alpha2NamespacedOperatorGroupTest() throws ApiException {
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
        ComCoreosOperatorsV1alpha2OperatorGroupList response = api.listOperatorsCoreosComV1alpha2NamespacedOperatorGroup(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind OperatorGroup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOperatorsCoreosComV1alpha2OperatorGroupForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        ComCoreosOperatorsV1alpha2OperatorGroupList response = api.listOperatorsCoreosComV1alpha2OperatorGroupForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified OperatorGroup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchOperatorsCoreosComV1alpha2NamespacedOperatorGroupTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1alpha2OperatorGroup response = api.patchOperatorsCoreosComV1alpha2NamespacedOperatorGroup(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified OperatorGroup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchOperatorsCoreosComV1alpha2NamespacedOperatorGroupStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1alpha2OperatorGroup response = api.patchOperatorsCoreosComV1alpha2NamespacedOperatorGroupStatus(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified OperatorGroup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readOperatorsCoreosComV1alpha2NamespacedOperatorGroupTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        ComCoreosOperatorsV1alpha2OperatorGroup response = api.readOperatorsCoreosComV1alpha2NamespacedOperatorGroup(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified OperatorGroup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readOperatorsCoreosComV1alpha2NamespacedOperatorGroupStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        ComCoreosOperatorsV1alpha2OperatorGroup response = api.readOperatorsCoreosComV1alpha2NamespacedOperatorGroupStatus(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified OperatorGroup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceOperatorsCoreosComV1alpha2NamespacedOperatorGroupTest() throws ApiException {
        String name = null;
        String namespace = null;
        ComCoreosOperatorsV1alpha2OperatorGroup body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1alpha2OperatorGroup response = api.replaceOperatorsCoreosComV1alpha2NamespacedOperatorGroup(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified OperatorGroup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceOperatorsCoreosComV1alpha2NamespacedOperatorGroupStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        ComCoreosOperatorsV1alpha2OperatorGroup body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1alpha2OperatorGroup response = api.replaceOperatorsCoreosComV1alpha2NamespacedOperatorGroupStatus(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
}
