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
import open_cluster_management.io.ComCoreosOperatorsV1CatalogSourceConfig;
import open_cluster_management.io.ComCoreosOperatorsV1CatalogSourceConfigList;
import open_cluster_management.io.ComCoreosOperatorsV1OperatorGroup;
import open_cluster_management.io.ComCoreosOperatorsV1OperatorGroupList;
import open_cluster_management.io.ComCoreosOperatorsV1OperatorSource;
import open_cluster_management.io.ComCoreosOperatorsV1OperatorSourceList;
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
 * API tests for OperatorsCoreosComV1Api
 */
@Ignore
public class OperatorsCoreosComV1ApiTest {

    private final OperatorsCoreosComV1Api api = new OperatorsCoreosComV1Api();

    
    /**
     * 
     *
     * create a CatalogSourceConfig
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOperatorsCoreosComV1NamespacedCatalogSourceConfigTest() throws ApiException {
        String namespace = null;
        ComCoreosOperatorsV1CatalogSourceConfig body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1CatalogSourceConfig response = api.createOperatorsCoreosComV1NamespacedCatalogSourceConfig(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create an OperatorGroup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOperatorsCoreosComV1NamespacedOperatorGroupTest() throws ApiException {
        String namespace = null;
        ComCoreosOperatorsV1OperatorGroup body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1OperatorGroup response = api.createOperatorsCoreosComV1NamespacedOperatorGroup(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create an OperatorSource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOperatorsCoreosComV1NamespacedOperatorSourceTest() throws ApiException {
        String namespace = null;
        ComCoreosOperatorsV1OperatorSource body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1OperatorSource response = api.createOperatorsCoreosComV1NamespacedOperatorSource(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of CatalogSourceConfig
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOperatorsCoreosComV1CollectionNamespacedCatalogSourceConfigTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteOperatorsCoreosComV1CollectionNamespacedCatalogSourceConfig(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

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
    public void deleteOperatorsCoreosComV1CollectionNamespacedOperatorGroupTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteOperatorsCoreosComV1CollectionNamespacedOperatorGroup(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of OperatorSource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOperatorsCoreosComV1CollectionNamespacedOperatorSourceTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteOperatorsCoreosComV1CollectionNamespacedOperatorSource(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a CatalogSourceConfig
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOperatorsCoreosComV1NamespacedCatalogSourceConfigTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteOperatorsCoreosComV1NamespacedCatalogSourceConfig(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

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
    public void deleteOperatorsCoreosComV1NamespacedOperatorGroupTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteOperatorsCoreosComV1NamespacedOperatorGroup(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete an OperatorSource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOperatorsCoreosComV1NamespacedOperatorSourceTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteOperatorsCoreosComV1NamespacedOperatorSource(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind CatalogSourceConfig
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOperatorsCoreosComV1CatalogSourceConfigForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        ComCoreosOperatorsV1CatalogSourceConfigList response = api.listOperatorsCoreosComV1CatalogSourceConfigForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind CatalogSourceConfig
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOperatorsCoreosComV1NamespacedCatalogSourceConfigTest() throws ApiException {
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
        ComCoreosOperatorsV1CatalogSourceConfigList response = api.listOperatorsCoreosComV1NamespacedCatalogSourceConfig(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

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
    public void listOperatorsCoreosComV1NamespacedOperatorGroupTest() throws ApiException {
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
        ComCoreosOperatorsV1OperatorGroupList response = api.listOperatorsCoreosComV1NamespacedOperatorGroup(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind OperatorSource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOperatorsCoreosComV1NamespacedOperatorSourceTest() throws ApiException {
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
        ComCoreosOperatorsV1OperatorSourceList response = api.listOperatorsCoreosComV1NamespacedOperatorSource(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

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
    public void listOperatorsCoreosComV1OperatorGroupForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        ComCoreosOperatorsV1OperatorGroupList response = api.listOperatorsCoreosComV1OperatorGroupForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind OperatorSource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOperatorsCoreosComV1OperatorSourceForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        ComCoreosOperatorsV1OperatorSourceList response = api.listOperatorsCoreosComV1OperatorSourceForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified CatalogSourceConfig
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchOperatorsCoreosComV1NamespacedCatalogSourceConfigTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1CatalogSourceConfig response = api.patchOperatorsCoreosComV1NamespacedCatalogSourceConfig(name, namespace, body, pretty, dryRun, fieldManager);

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
    public void patchOperatorsCoreosComV1NamespacedOperatorGroupTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1OperatorGroup response = api.patchOperatorsCoreosComV1NamespacedOperatorGroup(name, namespace, body, pretty, dryRun, fieldManager);

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
    public void patchOperatorsCoreosComV1NamespacedOperatorGroupStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1OperatorGroup response = api.patchOperatorsCoreosComV1NamespacedOperatorGroupStatus(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified OperatorSource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchOperatorsCoreosComV1NamespacedOperatorSourceTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1OperatorSource response = api.patchOperatorsCoreosComV1NamespacedOperatorSource(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified CatalogSourceConfig
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readOperatorsCoreosComV1NamespacedCatalogSourceConfigTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        ComCoreosOperatorsV1CatalogSourceConfig response = api.readOperatorsCoreosComV1NamespacedCatalogSourceConfig(name, namespace, pretty, resourceVersion);

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
    public void readOperatorsCoreosComV1NamespacedOperatorGroupTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        ComCoreosOperatorsV1OperatorGroup response = api.readOperatorsCoreosComV1NamespacedOperatorGroup(name, namespace, pretty, resourceVersion);

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
    public void readOperatorsCoreosComV1NamespacedOperatorGroupStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        ComCoreosOperatorsV1OperatorGroup response = api.readOperatorsCoreosComV1NamespacedOperatorGroupStatus(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified OperatorSource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readOperatorsCoreosComV1NamespacedOperatorSourceTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        ComCoreosOperatorsV1OperatorSource response = api.readOperatorsCoreosComV1NamespacedOperatorSource(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified CatalogSourceConfig
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceOperatorsCoreosComV1NamespacedCatalogSourceConfigTest() throws ApiException {
        String name = null;
        String namespace = null;
        ComCoreosOperatorsV1CatalogSourceConfig body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1CatalogSourceConfig response = api.replaceOperatorsCoreosComV1NamespacedCatalogSourceConfig(name, namespace, body, pretty, dryRun, fieldManager);

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
    public void replaceOperatorsCoreosComV1NamespacedOperatorGroupTest() throws ApiException {
        String name = null;
        String namespace = null;
        ComCoreosOperatorsV1OperatorGroup body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1OperatorGroup response = api.replaceOperatorsCoreosComV1NamespacedOperatorGroup(name, namespace, body, pretty, dryRun, fieldManager);

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
    public void replaceOperatorsCoreosComV1NamespacedOperatorGroupStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        ComCoreosOperatorsV1OperatorGroup body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1OperatorGroup response = api.replaceOperatorsCoreosComV1NamespacedOperatorGroupStatus(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified OperatorSource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceOperatorsCoreosComV1NamespacedOperatorSourceTest() throws ApiException {
        String name = null;
        String namespace = null;
        ComCoreosOperatorsV1OperatorSource body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosOperatorsV1OperatorSource response = api.replaceOperatorsCoreosComV1NamespacedOperatorSource(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
}
