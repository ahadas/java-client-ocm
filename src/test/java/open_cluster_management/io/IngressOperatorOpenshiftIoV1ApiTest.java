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
import open_cluster_management.io.IoOpenshiftOperatorIngressV1DNSRecord;
import open_cluster_management.io.IoOpenshiftOperatorIngressV1DNSRecordList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IngressOperatorOpenshiftIoV1Api
 */
@Ignore
public class IngressOperatorOpenshiftIoV1ApiTest {

    private final IngressOperatorOpenshiftIoV1Api api = new IngressOperatorOpenshiftIoV1Api();

    
    /**
     * 
     *
     * create a DNSRecord
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIngressOperatorOpenshiftIoV1NamespacedDNSRecordTest() throws ApiException {
        String namespace = null;
        IoOpenshiftOperatorIngressV1DNSRecord body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoOpenshiftOperatorIngressV1DNSRecord response = api.createIngressOperatorOpenshiftIoV1NamespacedDNSRecord(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of DNSRecord
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIngressOperatorOpenshiftIoV1CollectionNamespacedDNSRecordTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteIngressOperatorOpenshiftIoV1CollectionNamespacedDNSRecord(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a DNSRecord
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIngressOperatorOpenshiftIoV1NamespacedDNSRecordTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteIngressOperatorOpenshiftIoV1NamespacedDNSRecord(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind DNSRecord
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIngressOperatorOpenshiftIoV1DNSRecordForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoOpenshiftOperatorIngressV1DNSRecordList response = api.listIngressOperatorOpenshiftIoV1DNSRecordForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind DNSRecord
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIngressOperatorOpenshiftIoV1NamespacedDNSRecordTest() throws ApiException {
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
        IoOpenshiftOperatorIngressV1DNSRecordList response = api.listIngressOperatorOpenshiftIoV1NamespacedDNSRecord(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified DNSRecord
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchIngressOperatorOpenshiftIoV1NamespacedDNSRecordTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoOpenshiftOperatorIngressV1DNSRecord response = api.patchIngressOperatorOpenshiftIoV1NamespacedDNSRecord(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified DNSRecord
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchIngressOperatorOpenshiftIoV1NamespacedDNSRecordStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoOpenshiftOperatorIngressV1DNSRecord response = api.patchIngressOperatorOpenshiftIoV1NamespacedDNSRecordStatus(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified DNSRecord
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readIngressOperatorOpenshiftIoV1NamespacedDNSRecordTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        IoOpenshiftOperatorIngressV1DNSRecord response = api.readIngressOperatorOpenshiftIoV1NamespacedDNSRecord(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified DNSRecord
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readIngressOperatorOpenshiftIoV1NamespacedDNSRecordStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        IoOpenshiftOperatorIngressV1DNSRecord response = api.readIngressOperatorOpenshiftIoV1NamespacedDNSRecordStatus(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified DNSRecord
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceIngressOperatorOpenshiftIoV1NamespacedDNSRecordTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoOpenshiftOperatorIngressV1DNSRecord body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoOpenshiftOperatorIngressV1DNSRecord response = api.replaceIngressOperatorOpenshiftIoV1NamespacedDNSRecord(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified DNSRecord
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceIngressOperatorOpenshiftIoV1NamespacedDNSRecordStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoOpenshiftOperatorIngressV1DNSRecord body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoOpenshiftOperatorIngressV1DNSRecord response = api.replaceIngressOperatorOpenshiftIoV1NamespacedDNSRecordStatus(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
}