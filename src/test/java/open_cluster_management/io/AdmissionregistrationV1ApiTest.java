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
import open_cluster_management.io.IoK8sApiAdmissionregistrationV1MutatingWebhookConfiguration;
import open_cluster_management.io.IoK8sApiAdmissionregistrationV1MutatingWebhookConfigurationList;
import open_cluster_management.io.IoK8sApiAdmissionregistrationV1ValidatingWebhookConfiguration;
import open_cluster_management.io.IoK8sApiAdmissionregistrationV1ValidatingWebhookConfigurationList;
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
 * API tests for AdmissionregistrationV1Api
 */
@Ignore
public class AdmissionregistrationV1ApiTest {

    private final AdmissionregistrationV1Api api = new AdmissionregistrationV1Api();

    
    /**
     * 
     *
     * create a MutatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAdmissionregistrationV1MutatingWebhookConfigurationTest() throws ApiException {
        IoK8sApiAdmissionregistrationV1MutatingWebhookConfiguration body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAdmissionregistrationV1MutatingWebhookConfiguration response = api.createAdmissionregistrationV1MutatingWebhookConfiguration(body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a ValidatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAdmissionregistrationV1ValidatingWebhookConfigurationTest() throws ApiException {
        IoK8sApiAdmissionregistrationV1ValidatingWebhookConfiguration body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAdmissionregistrationV1ValidatingWebhookConfiguration response = api.createAdmissionregistrationV1ValidatingWebhookConfiguration(body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of MutatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAdmissionregistrationV1CollectionMutatingWebhookConfigurationTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteAdmissionregistrationV1CollectionMutatingWebhookConfiguration(pretty, allowWatchBookmarks, body, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of ValidatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAdmissionregistrationV1CollectionValidatingWebhookConfigurationTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteAdmissionregistrationV1CollectionValidatingWebhookConfiguration(pretty, allowWatchBookmarks, body, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a MutatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAdmissionregistrationV1MutatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteAdmissionregistrationV1MutatingWebhookConfiguration(name, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a ValidatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAdmissionregistrationV1ValidatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        IoK8sApimachineryPkgApisMetaV1Status response = api.deleteAdmissionregistrationV1ValidatingWebhookConfiguration(name, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

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
    public void getAdmissionregistrationV1APIResourcesTest() throws ApiException {
        IoK8sApimachineryPkgApisMetaV1APIResourceList response = api.getAdmissionregistrationV1APIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind MutatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAdmissionregistrationV1MutatingWebhookConfigurationTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApiAdmissionregistrationV1MutatingWebhookConfigurationList response = api.listAdmissionregistrationV1MutatingWebhookConfiguration(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind ValidatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAdmissionregistrationV1ValidatingWebhookConfigurationTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApiAdmissionregistrationV1ValidatingWebhookConfigurationList response = api.listAdmissionregistrationV1ValidatingWebhookConfiguration(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified MutatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchAdmissionregistrationV1MutatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        IoK8sApiAdmissionregistrationV1MutatingWebhookConfiguration response = api.patchAdmissionregistrationV1MutatingWebhookConfiguration(name, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified ValidatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchAdmissionregistrationV1ValidatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        IoK8sApiAdmissionregistrationV1ValidatingWebhookConfiguration response = api.patchAdmissionregistrationV1ValidatingWebhookConfiguration(name, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified MutatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAdmissionregistrationV1MutatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        IoK8sApiAdmissionregistrationV1MutatingWebhookConfiguration response = api.readAdmissionregistrationV1MutatingWebhookConfiguration(name, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified ValidatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAdmissionregistrationV1ValidatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        IoK8sApiAdmissionregistrationV1ValidatingWebhookConfiguration response = api.readAdmissionregistrationV1ValidatingWebhookConfiguration(name, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified MutatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAdmissionregistrationV1MutatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        IoK8sApiAdmissionregistrationV1MutatingWebhookConfiguration body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAdmissionregistrationV1MutatingWebhookConfiguration response = api.replaceAdmissionregistrationV1MutatingWebhookConfiguration(name, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified ValidatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAdmissionregistrationV1ValidatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        IoK8sApiAdmissionregistrationV1ValidatingWebhookConfiguration body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        IoK8sApiAdmissionregistrationV1ValidatingWebhookConfiguration response = api.replaceAdmissionregistrationV1ValidatingWebhookConfiguration(name, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch changes to an object of kind MutatingWebhookConfiguration. deprecated: use the &#39;watch&#39; parameter with a list operation instead, filtered to a single item with the &#39;fieldSelector&#39; parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAdmissionregistrationV1MutatingWebhookConfigurationTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAdmissionregistrationV1MutatingWebhookConfiguration(name, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch individual changes to a list of MutatingWebhookConfiguration. deprecated: use the &#39;watch&#39; parameter with a list operation instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAdmissionregistrationV1MutatingWebhookConfigurationListTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAdmissionregistrationV1MutatingWebhookConfigurationList(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch changes to an object of kind ValidatingWebhookConfiguration. deprecated: use the &#39;watch&#39; parameter with a list operation instead, filtered to a single item with the &#39;fieldSelector&#39; parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAdmissionregistrationV1ValidatingWebhookConfigurationTest() throws ApiException {
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
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAdmissionregistrationV1ValidatingWebhookConfiguration(name, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * watch individual changes to a list of ValidatingWebhookConfiguration. deprecated: use the &#39;watch&#39; parameter with a list operation instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAdmissionregistrationV1ValidatingWebhookConfigurationListTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        IoK8sApimachineryPkgApisMetaV1WatchEvent response = api.watchAdmissionregistrationV1ValidatingWebhookConfigurationList(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
}
