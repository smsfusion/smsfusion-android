# HLRApi

All URIs are relative to *https://api.smsfusion.com.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHLR**](HLRApi.md#getHLR) | **GET** /hlr/ | HLR number lookup
[**getHLRCallback**](HLRApi.md#getHLRCallback) | **GET** /hlr-callback/ | HLR number lookup with results going to a callback URL


<a name="getHLR"></a>
# **getHLR**
> HLRCallback getHLR(key, num, cc)

HLR number lookup

Perform HLR on number

### Example
```java
// Import classes:
//import io.swagger.client.api.HLRApi;

HLRApi apiInstance = new HLRApi();
String key = "key_example"; // String | API Key as generated from the <a href='https://www.smsfusion.com.au/admin/api/'>admin panel</a>
String num = "num_example"; // String | A single phone number or <a href='https://www.smsfusion.com.au/help/msisdn/'>MSDISDN</a>
String cc = "cc_example"; // String | 2 character country code <a href='https://en.wikipedia.org/wiki/ISO_3166-2'>ISO 3166-2</a> for formatting local numbers internationally
try {
    HLRCallback result = apiInstance.getHLR(key, num, cc);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HLRApi#getHLR");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| API Key as generated from the &lt;a href&#x3D;&#39;https://www.smsfusion.com.au/admin/api/&#39;&gt;admin panel&lt;/a&gt; |
 **num** | **String**| A single phone number or &lt;a href&#x3D;&#39;https://www.smsfusion.com.au/help/msisdn/&#39;&gt;MSDISDN&lt;/a&gt; |
 **cc** | **String**| 2 character country code &lt;a href&#x3D;&#39;https://en.wikipedia.org/wiki/ISO_3166-2&#39;&gt;ISO 3166-2&lt;/a&gt; for formatting local numbers internationally | [optional]

### Return type

[**HLRCallback**](HLRCallback.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHLRCallback"></a>
# **getHLRCallback**
> HLRResult getHLRCallback(key, num, cb, cc)

HLR number lookup with results going to a callback URL

Perform HLR on number with the result being sent to the callback URL provided

### Example
```java
// Import classes:
//import io.swagger.client.api.HLRApi;

HLRApi apiInstance = new HLRApi();
String key = "key_example"; // String | API Key as generated from the <a href='https://www.smsfusion.com.au/admin/api/'>admin panel</a>
List<String> num = Arrays.asList("num_example"); // List<String> | Comma separated list of phone numbers or <a href='https://www.smsfusion.com.au/help/msisdn/'>MSDISDN</a>'s
String cb = "cb_example"; // String | HTTP or HTTPS callback URL for each result. The result will be sent as POST with a json object included in <b>result</b>. Timeout for callbacks is set to 30 seconds
String cc = "cc_example"; // String | 2 character country code <a href='https://en.wikipedia.org/wiki/ISO_3166-2'>ISO 3166-2</a> for formatting local numbers internationally
try {
    HLRResult result = apiInstance.getHLRCallback(key, num, cb, cc);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HLRApi#getHLRCallback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| API Key as generated from the &lt;a href&#x3D;&#39;https://www.smsfusion.com.au/admin/api/&#39;&gt;admin panel&lt;/a&gt; |
 **num** | [**List&lt;String&gt;**](String.md)| Comma separated list of phone numbers or &lt;a href&#x3D;&#39;https://www.smsfusion.com.au/help/msisdn/&#39;&gt;MSDISDN&lt;/a&gt;&#39;s |
 **cb** | **String**| HTTP or HTTPS callback URL for each result. The result will be sent as POST with a json object included in &lt;b&gt;result&lt;/b&gt;. Timeout for callbacks is set to 30 seconds |
 **cc** | **String**| 2 character country code &lt;a href&#x3D;&#39;https://en.wikipedia.org/wiki/ISO_3166-2&#39;&gt;ISO 3166-2&lt;/a&gt; for formatting local numbers internationally | [optional]

### Return type

[**HLRResult**](HLRResult.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

