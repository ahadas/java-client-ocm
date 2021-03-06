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
import open_cluster_management.io.ComCoreosMonitoringV1Alertmanager;
import open_cluster_management.io.ComCoreosMonitoringV1AlertmanagerList;
import open_cluster_management.io.ComCoreosMonitoringV1PodMonitor;
import open_cluster_management.io.ComCoreosMonitoringV1PodMonitorList;
import open_cluster_management.io.ComCoreosMonitoringV1Prometheus;
import open_cluster_management.io.ComCoreosMonitoringV1PrometheusList;
import open_cluster_management.io.ComCoreosMonitoringV1PrometheusRule;
import open_cluster_management.io.ComCoreosMonitoringV1PrometheusRuleList;
import open_cluster_management.io.ComCoreosMonitoringV1ServiceMonitor;
import open_cluster_management.io.ComCoreosMonitoringV1ServiceMonitorList;
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
 * API tests for MonitoringCoreosComV1Api
 */
@Ignore
public class MonitoringCoreosComV1ApiTest {

    private final MonitoringCoreosComV1Api api = new MonitoringCoreosComV1Api();

    
    /**
     * 
     *
     * create an Alertmanager
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMonitoringCoreosComV1NamespacedAlertmanagerTest() throws ApiException {
        String namespace = null;
        ComCoreosMonitoringV1Alertmanager body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosMonitoringV1Alertmanager response = api.createMonitoringCoreosComV1NamespacedAlertmanager(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a PodMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMonitoringCoreosComV1NamespacedPodMonitorTest() throws ApiException {
        String namespace = null;
        ComCoreosMonitoringV1PodMonitor body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosMonitoringV1PodMonitor response = api.createMonitoringCoreosComV1NamespacedPodMonitor(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create Prometheus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMonitoringCoreosComV1NamespacedPrometheusTest() throws ApiException {
        String namespace = null;
        ComCoreosMonitoringV1Prometheus body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosMonitoringV1Prometheus response = api.createMonitoringCoreosComV1NamespacedPrometheus(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a PrometheusRule
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMonitoringCoreosComV1NamespacedPrometheusRuleTest() throws ApiException {
        String namespace = null;
        ComCoreosMonitoringV1PrometheusRule body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosMonitoringV1PrometheusRule response = api.createMonitoringCoreosComV1NamespacedPrometheusRule(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a ServiceMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMonitoringCoreosComV1NamespacedServiceMonitorTest() throws ApiException {
        String namespace = null;
        ComCoreosMonitoringV1ServiceMonitor body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosMonitoringV1ServiceMonitor response = api.createMonitoringCoreosComV1NamespacedServiceMonitor(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of Alertmanager
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMonitoringCoreosComV1CollectionNamespacedAlertmanagerTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteMonitoringCoreosComV1CollectionNamespacedAlertmanager(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of PodMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMonitoringCoreosComV1CollectionNamespacedPodMonitorTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteMonitoringCoreosComV1CollectionNamespacedPodMonitor(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of Prometheus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMonitoringCoreosComV1CollectionNamespacedPrometheusTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteMonitoringCoreosComV1CollectionNamespacedPrometheus(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of PrometheusRule
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMonitoringCoreosComV1CollectionNamespacedPrometheusRuleTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteMonitoringCoreosComV1CollectionNamespacedPrometheusRule(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of ServiceMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMonitoringCoreosComV1CollectionNamespacedServiceMonitorTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteMonitoringCoreosComV1CollectionNamespacedServiceMonitor(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete an Alertmanager
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMonitoringCoreosComV1NamespacedAlertmanagerTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteMonitoringCoreosComV1NamespacedAlertmanager(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a PodMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMonitoringCoreosComV1NamespacedPodMonitorTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteMonitoringCoreosComV1NamespacedPodMonitor(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete Prometheus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMonitoringCoreosComV1NamespacedPrometheusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteMonitoringCoreosComV1NamespacedPrometheus(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a PrometheusRule
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMonitoringCoreosComV1NamespacedPrometheusRuleTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteMonitoringCoreosComV1NamespacedPrometheusRule(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a ServiceMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMonitoringCoreosComV1NamespacedServiceMonitorTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteMonitoringCoreosComV1NamespacedServiceMonitor(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind Alertmanager
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMonitoringCoreosComV1AlertmanagerForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        ComCoreosMonitoringV1AlertmanagerList response = api.listMonitoringCoreosComV1AlertmanagerForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind Alertmanager
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMonitoringCoreosComV1NamespacedAlertmanagerTest() throws ApiException {
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
        ComCoreosMonitoringV1AlertmanagerList response = api.listMonitoringCoreosComV1NamespacedAlertmanager(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind PodMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMonitoringCoreosComV1NamespacedPodMonitorTest() throws ApiException {
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
        ComCoreosMonitoringV1PodMonitorList response = api.listMonitoringCoreosComV1NamespacedPodMonitor(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind Prometheus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMonitoringCoreosComV1NamespacedPrometheusTest() throws ApiException {
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
        ComCoreosMonitoringV1PrometheusList response = api.listMonitoringCoreosComV1NamespacedPrometheus(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind PrometheusRule
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMonitoringCoreosComV1NamespacedPrometheusRuleTest() throws ApiException {
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
        ComCoreosMonitoringV1PrometheusRuleList response = api.listMonitoringCoreosComV1NamespacedPrometheusRule(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind ServiceMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMonitoringCoreosComV1NamespacedServiceMonitorTest() throws ApiException {
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
        ComCoreosMonitoringV1ServiceMonitorList response = api.listMonitoringCoreosComV1NamespacedServiceMonitor(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind PodMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMonitoringCoreosComV1PodMonitorForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        ComCoreosMonitoringV1PodMonitorList response = api.listMonitoringCoreosComV1PodMonitorForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind Prometheus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMonitoringCoreosComV1PrometheusForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        ComCoreosMonitoringV1PrometheusList response = api.listMonitoringCoreosComV1PrometheusForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind PrometheusRule
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMonitoringCoreosComV1PrometheusRuleForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        ComCoreosMonitoringV1PrometheusRuleList response = api.listMonitoringCoreosComV1PrometheusRuleForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind ServiceMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMonitoringCoreosComV1ServiceMonitorForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        ComCoreosMonitoringV1ServiceMonitorList response = api.listMonitoringCoreosComV1ServiceMonitorForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified Alertmanager
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchMonitoringCoreosComV1NamespacedAlertmanagerTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosMonitoringV1Alertmanager response = api.patchMonitoringCoreosComV1NamespacedAlertmanager(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified PodMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchMonitoringCoreosComV1NamespacedPodMonitorTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosMonitoringV1PodMonitor response = api.patchMonitoringCoreosComV1NamespacedPodMonitor(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified Prometheus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchMonitoringCoreosComV1NamespacedPrometheusTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosMonitoringV1Prometheus response = api.patchMonitoringCoreosComV1NamespacedPrometheus(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified PrometheusRule
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchMonitoringCoreosComV1NamespacedPrometheusRuleTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosMonitoringV1PrometheusRule response = api.patchMonitoringCoreosComV1NamespacedPrometheusRule(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified ServiceMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchMonitoringCoreosComV1NamespacedServiceMonitorTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosMonitoringV1ServiceMonitor response = api.patchMonitoringCoreosComV1NamespacedServiceMonitor(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified Alertmanager
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readMonitoringCoreosComV1NamespacedAlertmanagerTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        ComCoreosMonitoringV1Alertmanager response = api.readMonitoringCoreosComV1NamespacedAlertmanager(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified PodMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readMonitoringCoreosComV1NamespacedPodMonitorTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        ComCoreosMonitoringV1PodMonitor response = api.readMonitoringCoreosComV1NamespacedPodMonitor(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified Prometheus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readMonitoringCoreosComV1NamespacedPrometheusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        ComCoreosMonitoringV1Prometheus response = api.readMonitoringCoreosComV1NamespacedPrometheus(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified PrometheusRule
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readMonitoringCoreosComV1NamespacedPrometheusRuleTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        ComCoreosMonitoringV1PrometheusRule response = api.readMonitoringCoreosComV1NamespacedPrometheusRule(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified ServiceMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readMonitoringCoreosComV1NamespacedServiceMonitorTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        ComCoreosMonitoringV1ServiceMonitor response = api.readMonitoringCoreosComV1NamespacedServiceMonitor(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified Alertmanager
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMonitoringCoreosComV1NamespacedAlertmanagerTest() throws ApiException {
        String name = null;
        String namespace = null;
        ComCoreosMonitoringV1Alertmanager body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosMonitoringV1Alertmanager response = api.replaceMonitoringCoreosComV1NamespacedAlertmanager(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified PodMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMonitoringCoreosComV1NamespacedPodMonitorTest() throws ApiException {
        String name = null;
        String namespace = null;
        ComCoreosMonitoringV1PodMonitor body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosMonitoringV1PodMonitor response = api.replaceMonitoringCoreosComV1NamespacedPodMonitor(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified Prometheus
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMonitoringCoreosComV1NamespacedPrometheusTest() throws ApiException {
        String name = null;
        String namespace = null;
        ComCoreosMonitoringV1Prometheus body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosMonitoringV1Prometheus response = api.replaceMonitoringCoreosComV1NamespacedPrometheus(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified PrometheusRule
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMonitoringCoreosComV1NamespacedPrometheusRuleTest() throws ApiException {
        String name = null;
        String namespace = null;
        ComCoreosMonitoringV1PrometheusRule body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosMonitoringV1PrometheusRule response = api.replaceMonitoringCoreosComV1NamespacedPrometheusRule(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified ServiceMonitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMonitoringCoreosComV1NamespacedServiceMonitorTest() throws ApiException {
        String name = null;
        String namespace = null;
        ComCoreosMonitoringV1ServiceMonitor body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        ComCoreosMonitoringV1ServiceMonitor response = api.replaceMonitoringCoreosComV1NamespacedServiceMonitor(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
}
