/**
 * SMS Fusion API
 * This is the SMS Fusion API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@smsfusion.com.au
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.HLRCallback;
import io.swagger.client.model.HLRError;
import io.swagger.client.model.HLRResult;
import io.swagger.client.model.OutOfCredit;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class HLRApi {
  String basePath = "https://api.smsfusion.com.au/";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * HLR number lookup
  * Perform HLR on number
   * @param key API Key as generated from the &lt;a href&#x3D;&#39;https://www.smsfusion.com.au/admin/api/&#39;&gt;admin panel&lt;/a&gt;
   * @param num A single phone number or &lt;a href&#x3D;&#39;https://www.smsfusion.com.au/help/msisdn/&#39;&gt;MSDISDN&lt;/a&gt;
   * @param cc 2 character country code &lt;a href&#x3D;&#39;https://en.wikipedia.org/wiki/ISO_3166-2&#39;&gt;ISO 3166-2&lt;/a&gt; for formatting local numbers internationally
   * @return HLRCallback
  */
  public HLRCallback getHLR (String key, String num, String cc) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'key' is set
    if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getHLR",
        new ApiException(400, "Missing the required parameter 'key' when calling getHLR"));
    }
    // verify the required parameter 'num' is set
    if (num == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'num' when calling getHLR",
        new ApiException(400, "Missing the required parameter 'num' when calling getHLR"));
    }

    // create path and map variables
    String path = "/hlr/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "key", key));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "num", num));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cc", cc));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "api_key" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (HLRCallback) ApiInvoker.deserialize(localVarResponse, "", HLRCallback.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * HLR number lookup
   * Perform HLR on number
   * @param key API Key as generated from the &lt;a href&#x3D;&#39;https://www.smsfusion.com.au/admin/api/&#39;&gt;admin panel&lt;/a&gt;   * @param num A single phone number or &lt;a href&#x3D;&#39;https://www.smsfusion.com.au/help/msisdn/&#39;&gt;MSDISDN&lt;/a&gt;   * @param cc 2 character country code &lt;a href&#x3D;&#39;https://en.wikipedia.org/wiki/ISO_3166-2&#39;&gt;ISO 3166-2&lt;/a&gt; for formatting local numbers internationally
  */
  public void getHLR (String key, String num, String cc, final Response.Listener<HLRCallback> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getHLR",
         new ApiException(400, "Missing the required parameter 'key' when calling getHLR"));
    }
    
    // verify the required parameter 'num' is set
    if (num == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'num' when calling getHLR",
         new ApiException(400, "Missing the required parameter 'num' when calling getHLR"));
    }
    

    // create path and map variables
    String path = "/hlr/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "key", key));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "num", num));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cc", cc));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "api_key" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((HLRCallback) ApiInvoker.deserialize(localVarResponse,  "", HLRCallback.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * HLR number lookup with results going to a callback URL
  * Perform HLR on number with the result being sent to the callback URL provided
   * @param key API Key as generated from the &lt;a href&#x3D;&#39;https://www.smsfusion.com.au/admin/api/&#39;&gt;admin panel&lt;/a&gt;
   * @param num Comma separated list of phone numbers or &lt;a href&#x3D;&#39;https://www.smsfusion.com.au/help/msisdn/&#39;&gt;MSDISDN&lt;/a&gt;&#39;s
   * @param cb HTTP or HTTPS callback URL for each result. The result will be sent as POST with a json object included in &lt;b&gt;result&lt;/b&gt;. Timeout for callbacks is set to 30 seconds
   * @param cc 2 character country code &lt;a href&#x3D;&#39;https://en.wikipedia.org/wiki/ISO_3166-2&#39;&gt;ISO 3166-2&lt;/a&gt; for formatting local numbers internationally
   * @return HLRResult
  */
  public HLRResult getHLRCallback (String key, List<String> num, String cb, String cc) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'key' is set
    if (key == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getHLRCallback",
        new ApiException(400, "Missing the required parameter 'key' when calling getHLRCallback"));
    }
    // verify the required parameter 'num' is set
    if (num == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'num' when calling getHLRCallback",
        new ApiException(400, "Missing the required parameter 'num' when calling getHLRCallback"));
    }
    // verify the required parameter 'cb' is set
    if (cb == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'cb' when calling getHLRCallback",
        new ApiException(400, "Missing the required parameter 'cb' when calling getHLRCallback"));
    }

    // create path and map variables
    String path = "/hlr-callback/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "key", key));
    queryParams.addAll(ApiInvoker.parameterToPairs("csv", "num", num));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cb", cb));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cc", cc));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "api_key" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (HLRResult) ApiInvoker.deserialize(localVarResponse, "", HLRResult.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * HLR number lookup with results going to a callback URL
   * Perform HLR on number with the result being sent to the callback URL provided
   * @param key API Key as generated from the &lt;a href&#x3D;&#39;https://www.smsfusion.com.au/admin/api/&#39;&gt;admin panel&lt;/a&gt;   * @param num Comma separated list of phone numbers or &lt;a href&#x3D;&#39;https://www.smsfusion.com.au/help/msisdn/&#39;&gt;MSDISDN&lt;/a&gt;&#39;s   * @param cb HTTP or HTTPS callback URL for each result. The result will be sent as POST with a json object included in &lt;b&gt;result&lt;/b&gt;. Timeout for callbacks is set to 30 seconds   * @param cc 2 character country code &lt;a href&#x3D;&#39;https://en.wikipedia.org/wiki/ISO_3166-2&#39;&gt;ISO 3166-2&lt;/a&gt; for formatting local numbers internationally
  */
  public void getHLRCallback (String key, List<String> num, String cb, String cc, final Response.Listener<HLRResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'key' is set
    if (key == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'key' when calling getHLRCallback",
         new ApiException(400, "Missing the required parameter 'key' when calling getHLRCallback"));
    }
    
    // verify the required parameter 'num' is set
    if (num == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'num' when calling getHLRCallback",
         new ApiException(400, "Missing the required parameter 'num' when calling getHLRCallback"));
    }
    
    // verify the required parameter 'cb' is set
    if (cb == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'cb' when calling getHLRCallback",
         new ApiException(400, "Missing the required parameter 'cb' when calling getHLRCallback"));
    }
    

    // create path and map variables
    String path = "/hlr-callback/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "key", key));
    queryParams.addAll(ApiInvoker.parameterToPairs("csv", "num", num));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cb", cb));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cc", cc));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "api_key" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((HLRResult) ApiInvoker.deserialize(localVarResponse,  "", HLRResult.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
