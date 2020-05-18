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
import open_cluster_management.io.IoK8sApiAppsV1beta1ControllerRevision;
import open_cluster_management.io.IoK8sApiAppsV1beta1ControllerRevisionList;
import open_cluster_management.io.IoK8sApiAppsV1beta1Deployment;
import open_cluster_management.io.IoK8sApiAppsV1beta1DeploymentList;
import open_cluster_management.io.IoK8sApiAppsV1beta1DeploymentRollback;
import open_cluster_management.io.IoK8sApiAppsV1beta1Scale;
import open_cluster_management.io.IoK8sApiAppsV1beta1StatefulSet;
import open_cluster_management.io.IoK8sApiAppsV1beta1StatefulSetList;
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
 * API tests for AppsV1beta1Api
 */
@Ignore
public class AppsV1beta1ApiTest {

    private final AppsV1beta1Api api = new AppsV1beta1Api();

    
    /**
     * 
     *
     * create a ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAppsV1beta1NamespacedControllerRevisionTest() throws ApiException {
        String namespace = null;
        IoK8sApiAppsV1beta1ControllerRevision body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAppsV1beta1ControllerRevision response = api.createAppsV1beta1NamespacedControllerRevision(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAppsV1beta1NamespacedDeploymentTest() throws ApiException {
        String namespace = null;
        IoK8sApiAppsV1beta1Deployment body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAppsV1beta1Deployment response = api.createAppsV1beta1NamespacedDeployment(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create rollback of a Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAppsV1beta1NamespacedDeploymentRollbackTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApiAppsV1beta1DeploymentRollback body = null;
        String dryRun = null;
        String fieldManager = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.createAppsV1beta1NamespacedDeploymentRollback(name, namespace, body, dryRun, fieldManager, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAppsV1beta1NamespacedStatefulSetTest() throws ApiException {
        String namespace = null;
        IoK8sApiAppsV1beta1StatefulSet body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAppsV1beta1StatefulSet response = api.createAppsV1beta1NamespacedStatefulSet(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAppsV1beta1CollectionNamespacedControllerRevisionTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteAppsV1beta1CollectionNamespacedControllerRevision(namespace, pretty, allowWatchBookmarks, body, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAppsV1beta1CollectionNamespacedDeploymentTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteAppsV1beta1CollectionNamespacedDeployment(namespace, pretty, allowWatchBookmarks, body, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAppsV1beta1CollectionNamespacedStatefulSetTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteAppsV1beta1CollectionNamespacedStatefulSet(namespace, pretty, allowWatchBookmarks, body, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAppsV1beta1NamespacedControllerRevisionTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteAppsV1beta1NamespacedControllerRevision(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAppsV1beta1NamespacedDeploymentTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteAppsV1beta1NamespacedDeployment(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAppsV1beta1NamespacedStatefulSetTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteAppsV1beta1NamespacedStatefulSet(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

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
    public void getAppsV1beta1APIResourcesTest() throws ApiException {
        IoK8sApimachineryPkgApisMetaV1APIResourceList response = api.getAppsV1beta1APIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAppsV1beta1ControllerRevisionForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApiAppsV1beta1ControllerRevisionList response = api.listAppsV1beta1ControllerRevisionForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAppsV1beta1DeploymentForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApiAppsV1beta1DeploymentList response = api.listAppsV1beta1DeploymentForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAppsV1beta1NamespacedControllerRevisionTest() throws ApiException {
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
        IoK8sApiAppsV1beta1ControllerRevisionList response = api.listAppsV1beta1NamespacedControllerRevision(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAppsV1beta1NamespacedDeploymentTest() throws ApiException {
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
        IoK8sApiAppsV1beta1DeploymentList response = api.listAppsV1beta1NamespacedDeployment(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAppsV1beta1NamespacedStatefulSetTest() throws ApiException {
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
        IoK8sApiAppsV1beta1StatefulSetList response = api.listAppsV1beta1NamespacedStatefulSet(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAppsV1beta1StatefulSetForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApiAppsV1beta1StatefulSetList response = api.listAppsV1beta1StatefulSetForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchAppsV1beta1NamespacedControllerRevisionTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        IoK8sApiAppsV1beta1ControllerRevision response = api.patchAppsV1beta1NamespacedControllerRevision(name, namespace, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchAppsV1beta1NamespacedDeploymentTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        IoK8sApiAppsV1beta1Deployment response = api.patchAppsV1beta1NamespacedDeployment(name, namespace, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update scale of the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchAppsV1beta1NamespacedDeploymentScaleTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        IoK8sApiAppsV1beta1Scale response = api.patchAppsV1beta1NamespacedDeploymentScale(name, namespace, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchAppsV1beta1NamespacedDeploymentStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        IoK8sApiAppsV1beta1Deployment response = api.patchAppsV1beta1NamespacedDeploymentStatus(name, namespace, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchAppsV1beta1NamespacedStatefulSetTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        IoK8sApiAppsV1beta1StatefulSet response = api.patchAppsV1beta1NamespacedStatefulSet(name, namespace, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update scale of the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchAppsV1beta1NamespacedStatefulSetScaleTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        IoK8sApiAppsV1beta1Scale response = api.patchAppsV1beta1NamespacedStatefulSetScale(name, namespace, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchAppsV1beta1NamespacedStatefulSetStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        IoK8sApiAppsV1beta1StatefulSet response = api.patchAppsV1beta1NamespacedStatefulSetStatus(name, namespace, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAppsV1beta1NamespacedControllerRevisionTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        IoK8sApiAppsV1beta1ControllerRevision response = api.readAppsV1beta1NamespacedControllerRevision(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAppsV1beta1NamespacedDeploymentTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        IoK8sApiAppsV1beta1Deployment response = api.readAppsV1beta1NamespacedDeployment(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read scale of the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAppsV1beta1NamespacedDeploymentScaleTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApiAppsV1beta1Scale response = api.readAppsV1beta1NamespacedDeploymentScale(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAppsV1beta1NamespacedDeploymentStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApiAppsV1beta1Deployment response = api.readAppsV1beta1NamespacedDeploymentStatus(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAppsV1beta1NamespacedStatefulSetTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        IoK8sApiAppsV1beta1StatefulSet response = api.readAppsV1beta1NamespacedStatefulSet(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read scale of the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAppsV1beta1NamespacedStatefulSetScaleTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApiAppsV1beta1Scale response = api.readAppsV1beta1NamespacedStatefulSetScale(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAppsV1beta1NamespacedStatefulSetStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApiAppsV1beta1StatefulSet response = api.readAppsV1beta1NamespacedStatefulSetStatus(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAppsV1beta1NamespacedControllerRevisionTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApiAppsV1beta1ControllerRevision body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAppsV1beta1ControllerRevision response = api.replaceAppsV1beta1NamespacedControllerRevision(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAppsV1beta1NamespacedDeploymentTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApiAppsV1beta1Deployment body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAppsV1beta1Deployment response = api.replaceAppsV1beta1NamespacedDeployment(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace scale of the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAppsV1beta1NamespacedDeploymentScaleTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApiAppsV1beta1Scale body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAppsV1beta1Scale response = api.replaceAppsV1beta1NamespacedDeploymentScale(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAppsV1beta1NamespacedDeploymentStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApiAppsV1beta1Deployment body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAppsV1beta1Deployment response = api.replaceAppsV1beta1NamespacedDeploymentStatus(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAppsV1beta1NamespacedStatefulSetTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApiAppsV1beta1StatefulSet body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAppsV1beta1StatefulSet response = api.replaceAppsV1beta1NamespacedStatefulSet(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace scale of the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAppsV1beta1NamespacedStatefulSetScaleTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApiAppsV1beta1Scale body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAppsV1beta1Scale response = api.replaceAppsV1beta1NamespacedStatefulSetScale(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAppsV1beta1NamespacedStatefulSetStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApiAppsV1beta1StatefulSet body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAppsV1beta1StatefulSet response = api.replaceAppsV1beta1NamespacedStatefulSetStatus(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch individual changes to a list of ControllerRevision. deprecated: use the &#39;watch&#39; parameter with a list operation instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAppsV1beta1ControllerRevisionListForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAppsV1beta1ControllerRevisionListForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch individual changes to a list of Deployment. deprecated: use the &#39;watch&#39; parameter with a list operation instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAppsV1beta1DeploymentListForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAppsV1beta1DeploymentListForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch changes to an object of kind ControllerRevision. deprecated: use the &#39;watch&#39; parameter with a list operation instead, filtered to a single item with the &#39;fieldSelector&#39; parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAppsV1beta1NamespacedControllerRevisionTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAppsV1beta1NamespacedControllerRevision(name, namespace, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch individual changes to a list of ControllerRevision. deprecated: use the &#39;watch&#39; parameter with a list operation instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAppsV1beta1NamespacedControllerRevisionListTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAppsV1beta1NamespacedControllerRevisionList(namespace, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch changes to an object of kind Deployment. deprecated: use the &#39;watch&#39; parameter with a list operation instead, filtered to a single item with the &#39;fieldSelector&#39; parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAppsV1beta1NamespacedDeploymentTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAppsV1beta1NamespacedDeployment(name, namespace, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch individual changes to a list of Deployment. deprecated: use the &#39;watch&#39; parameter with a list operation instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAppsV1beta1NamespacedDeploymentListTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAppsV1beta1NamespacedDeploymentList(namespace, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch changes to an object of kind StatefulSet. deprecated: use the &#39;watch&#39; parameter with a list operation instead, filtered to a single item with the &#39;fieldSelector&#39; parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAppsV1beta1NamespacedStatefulSetTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAppsV1beta1NamespacedStatefulSet(name, namespace, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch individual changes to a list of StatefulSet. deprecated: use the &#39;watch&#39; parameter with a list operation instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAppsV1beta1NamespacedStatefulSetListTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAppsV1beta1NamespacedStatefulSetList(namespace, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch individual changes to a list of StatefulSet. deprecated: use the &#39;watch&#39; parameter with a list operation instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAppsV1beta1StatefulSetListForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAppsV1beta1StatefulSetListForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
}