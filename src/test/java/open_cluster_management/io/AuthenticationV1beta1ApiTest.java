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
import open_cluster_management.io.IoK8sApiAuthenticationV1beta1TokenReview;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1APIResourceList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationV1beta1Api
 */
@Ignore
public class AuthenticationV1beta1ApiTest {

    private final AuthenticationV1beta1Api api = new AuthenticationV1beta1Api();

    
    /**
     * 
     *
     * create a TokenReview
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAuthenticationV1beta1TokenReviewTest() throws ApiException {
        IoK8sApiAuthenticationV1beta1TokenReview body = null;
        String dryRun = null;
        String fieldManager = null;
        String pretty = null;
        IoK8sApiAuthenticationV1beta1TokenReview response = api.createAuthenticationV1beta1TokenReview(body, dryRun, fieldManager, pretty);

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
    public void getAuthenticationV1beta1APIResourcesTest() throws ApiException {
        IoK8sApimachineryPkgApisMetaV1APIResourceList response = api.getAuthenticationV1beta1APIResources();

        // TODO: test validations
    }
    
}
