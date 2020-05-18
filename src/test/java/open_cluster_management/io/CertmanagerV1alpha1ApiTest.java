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
import open_cluster_management.io.IoK8sCertmanagerV1alpha1Certificate;
import open_cluster_management.io.IoK8sCertmanagerV1alpha1CertificateList;
import open_cluster_management.io.IoK8sCertmanagerV1alpha1CertificateRequest;
import open_cluster_management.io.IoK8sCertmanagerV1alpha1CertificateRequestList;
import open_cluster_management.io.IoK8sCertmanagerV1alpha1Challenge;
import open_cluster_management.io.IoK8sCertmanagerV1alpha1ChallengeList;
import open_cluster_management.io.IoK8sCertmanagerV1alpha1ClusterIssuer;
import open_cluster_management.io.IoK8sCertmanagerV1alpha1ClusterIssuerList;
import open_cluster_management.io.IoK8sCertmanagerV1alpha1Issuer;
import open_cluster_management.io.IoK8sCertmanagerV1alpha1IssuerList;
import open_cluster_management.io.IoK8sCertmanagerV1alpha1Order;
import open_cluster_management.io.IoK8sCertmanagerV1alpha1OrderList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CertmanagerV1alpha1Api
 */
@Ignore
public class CertmanagerV1alpha1ApiTest {

    private final CertmanagerV1alpha1Api api = new CertmanagerV1alpha1Api();

    
    /**
     * 
     *
     * create a ClusterIssuer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCertmanagerV1alpha1ClusterIssuerTest() throws ApiException {
        IoK8sCertmanagerV1alpha1ClusterIssuer body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1ClusterIssuer response = api.createCertmanagerV1alpha1ClusterIssuer(body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCertmanagerV1alpha1NamespacedCertificateTest() throws ApiException {
        String namespace = null;
        IoK8sCertmanagerV1alpha1Certificate body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1Certificate response = api.createCertmanagerV1alpha1NamespacedCertificate(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a CertificateRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCertmanagerV1alpha1NamespacedCertificateRequestTest() throws ApiException {
        String namespace = null;
        IoK8sCertmanagerV1alpha1CertificateRequest body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1CertificateRequest response = api.createCertmanagerV1alpha1NamespacedCertificateRequest(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a Challenge
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCertmanagerV1alpha1NamespacedChallengeTest() throws ApiException {
        String namespace = null;
        IoK8sCertmanagerV1alpha1Challenge body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1Challenge response = api.createCertmanagerV1alpha1NamespacedChallenge(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create an Issuer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCertmanagerV1alpha1NamespacedIssuerTest() throws ApiException {
        String namespace = null;
        IoK8sCertmanagerV1alpha1Issuer body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1Issuer response = api.createCertmanagerV1alpha1NamespacedIssuer(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create an Order
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCertmanagerV1alpha1NamespacedOrderTest() throws ApiException {
        String namespace = null;
        IoK8sCertmanagerV1alpha1Order body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1Order response = api.createCertmanagerV1alpha1NamespacedOrder(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a ClusterIssuer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCertmanagerV1alpha1ClusterIssuerTest() throws ApiException {
        String name = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteCertmanagerV1alpha1ClusterIssuer(name, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of ClusterIssuer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCertmanagerV1alpha1CollectionClusterIssuerTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteCertmanagerV1alpha1CollectionClusterIssuer(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCertmanagerV1alpha1CollectionNamespacedCertificateTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteCertmanagerV1alpha1CollectionNamespacedCertificate(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of CertificateRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCertmanagerV1alpha1CollectionNamespacedCertificateRequestTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteCertmanagerV1alpha1CollectionNamespacedCertificateRequest(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of Challenge
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCertmanagerV1alpha1CollectionNamespacedChallengeTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteCertmanagerV1alpha1CollectionNamespacedChallenge(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of Issuer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCertmanagerV1alpha1CollectionNamespacedIssuerTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteCertmanagerV1alpha1CollectionNamespacedIssuer(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of Order
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCertmanagerV1alpha1CollectionNamespacedOrderTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteCertmanagerV1alpha1CollectionNamespacedOrder(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCertmanagerV1alpha1NamespacedCertificateTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteCertmanagerV1alpha1NamespacedCertificate(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a CertificateRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCertmanagerV1alpha1NamespacedCertificateRequestTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteCertmanagerV1alpha1NamespacedCertificateRequest(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a Challenge
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCertmanagerV1alpha1NamespacedChallengeTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteCertmanagerV1alpha1NamespacedChallenge(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete an Issuer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCertmanagerV1alpha1NamespacedIssuerTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteCertmanagerV1alpha1NamespacedIssuer(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete an Order
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCertmanagerV1alpha1NamespacedOrderTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteCertmanagerV1alpha1NamespacedOrder(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCertmanagerV1alpha1CertificateForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sCertmanagerV1alpha1CertificateList response = api.listCertmanagerV1alpha1CertificateForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind CertificateRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCertmanagerV1alpha1CertificateRequestForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sCertmanagerV1alpha1CertificateRequestList response = api.listCertmanagerV1alpha1CertificateRequestForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind Challenge
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCertmanagerV1alpha1ChallengeForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sCertmanagerV1alpha1ChallengeList response = api.listCertmanagerV1alpha1ChallengeForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind ClusterIssuer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCertmanagerV1alpha1ClusterIssuerTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sCertmanagerV1alpha1ClusterIssuerList response = api.listCertmanagerV1alpha1ClusterIssuer(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind Issuer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCertmanagerV1alpha1IssuerForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sCertmanagerV1alpha1IssuerList response = api.listCertmanagerV1alpha1IssuerForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCertmanagerV1alpha1NamespacedCertificateTest() throws ApiException {
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
        IoK8sCertmanagerV1alpha1CertificateList response = api.listCertmanagerV1alpha1NamespacedCertificate(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind CertificateRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCertmanagerV1alpha1NamespacedCertificateRequestTest() throws ApiException {
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
        IoK8sCertmanagerV1alpha1CertificateRequestList response = api.listCertmanagerV1alpha1NamespacedCertificateRequest(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind Challenge
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCertmanagerV1alpha1NamespacedChallengeTest() throws ApiException {
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
        IoK8sCertmanagerV1alpha1ChallengeList response = api.listCertmanagerV1alpha1NamespacedChallenge(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind Issuer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCertmanagerV1alpha1NamespacedIssuerTest() throws ApiException {
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
        IoK8sCertmanagerV1alpha1IssuerList response = api.listCertmanagerV1alpha1NamespacedIssuer(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind Order
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCertmanagerV1alpha1NamespacedOrderTest() throws ApiException {
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
        IoK8sCertmanagerV1alpha1OrderList response = api.listCertmanagerV1alpha1NamespacedOrder(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list objects of kind Order
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCertmanagerV1alpha1OrderForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sCertmanagerV1alpha1OrderList response = api.listCertmanagerV1alpha1OrderForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified ClusterIssuer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchCertmanagerV1alpha1ClusterIssuerTest() throws ApiException {
        String name = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1ClusterIssuer response = api.patchCertmanagerV1alpha1ClusterIssuer(name, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchCertmanagerV1alpha1NamespacedCertificateTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1Certificate response = api.patchCertmanagerV1alpha1NamespacedCertificate(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified CertificateRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchCertmanagerV1alpha1NamespacedCertificateRequestTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1CertificateRequest response = api.patchCertmanagerV1alpha1NamespacedCertificateRequest(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified Challenge
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchCertmanagerV1alpha1NamespacedChallengeTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1Challenge response = api.patchCertmanagerV1alpha1NamespacedChallenge(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified Issuer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchCertmanagerV1alpha1NamespacedIssuerTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1Issuer response = api.patchCertmanagerV1alpha1NamespacedIssuer(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified Order
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchCertmanagerV1alpha1NamespacedOrderTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1Order response = api.patchCertmanagerV1alpha1NamespacedOrder(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified ClusterIssuer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readCertmanagerV1alpha1ClusterIssuerTest() throws ApiException {
        String name = null;
        String pretty = null;
        String resourceVersion = null;
        IoK8sCertmanagerV1alpha1ClusterIssuer response = api.readCertmanagerV1alpha1ClusterIssuer(name, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readCertmanagerV1alpha1NamespacedCertificateTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        IoK8sCertmanagerV1alpha1Certificate response = api.readCertmanagerV1alpha1NamespacedCertificate(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified CertificateRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readCertmanagerV1alpha1NamespacedCertificateRequestTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        IoK8sCertmanagerV1alpha1CertificateRequest response = api.readCertmanagerV1alpha1NamespacedCertificateRequest(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified Challenge
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readCertmanagerV1alpha1NamespacedChallengeTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        IoK8sCertmanagerV1alpha1Challenge response = api.readCertmanagerV1alpha1NamespacedChallenge(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified Issuer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readCertmanagerV1alpha1NamespacedIssuerTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        IoK8sCertmanagerV1alpha1Issuer response = api.readCertmanagerV1alpha1NamespacedIssuer(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified Order
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readCertmanagerV1alpha1NamespacedOrderTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String resourceVersion = null;
        IoK8sCertmanagerV1alpha1Order response = api.readCertmanagerV1alpha1NamespacedOrder(name, namespace, pretty, resourceVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified ClusterIssuer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceCertmanagerV1alpha1ClusterIssuerTest() throws ApiException {
        String name = null;
        IoK8sCertmanagerV1alpha1ClusterIssuer body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1ClusterIssuer response = api.replaceCertmanagerV1alpha1ClusterIssuer(name, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceCertmanagerV1alpha1NamespacedCertificateTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sCertmanagerV1alpha1Certificate body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1Certificate response = api.replaceCertmanagerV1alpha1NamespacedCertificate(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified CertificateRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceCertmanagerV1alpha1NamespacedCertificateRequestTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sCertmanagerV1alpha1CertificateRequest body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1CertificateRequest response = api.replaceCertmanagerV1alpha1NamespacedCertificateRequest(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified Challenge
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceCertmanagerV1alpha1NamespacedChallengeTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sCertmanagerV1alpha1Challenge body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1Challenge response = api.replaceCertmanagerV1alpha1NamespacedChallenge(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified Issuer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceCertmanagerV1alpha1NamespacedIssuerTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sCertmanagerV1alpha1Issuer body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1Issuer response = api.replaceCertmanagerV1alpha1NamespacedIssuer(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified Order
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceCertmanagerV1alpha1NamespacedOrderTest() throws ApiException {
        String name = null;
        String namespace = null;
        IoK8sCertmanagerV1alpha1Order body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sCertmanagerV1alpha1Order response = api.replaceCertmanagerV1alpha1NamespacedOrder(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
}