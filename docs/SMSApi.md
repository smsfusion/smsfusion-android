# SMSApi

All URIs are relative to *https://api.smsfusion.com.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendSMS**](SMSApi.md#sendSMS) | **GET** /sms/ | Send an SMS


<a name="sendSMS"></a>
# **sendSMS**
> SMSResult sendSMS(key, num, msg, from, deliverby, dlrcb, replycb, replyemail, validity, cc)

Send an SMS

Send one or more SMS

### Example
```java
// Import classes:
//import io.swagger.client.api.SMSApi;

SMSApi apiInstance = new SMSApi();
String key = "key_example"; // String | API Key as generated from the <a href='https://www.smsfusion.com.au/admin/api/'>admin panel</a>
List<String> num = Arrays.asList("num_example"); // List<String> | Comma separated list of phone numbers or <a href='https://www.smsfusion.com.au/help/msisdn/'>MSDISDN</a>'s
String msg = "msg_example"; // String | Message content to send
String from = "from_example"; // String | MSISDN or vanity alphanumeric source number
String deliverby = "deliverby_example"; // String | UTC encoded time to send the SMS
String dlrcb = "dlrcb_example"; // String | HTTP or HTTPS callback URL for delivery reports. Timeout for callbacks is set to 30 seconds
String replycb = "replycb_example"; // String | HTTP or HTTPS callback URL for replies. Timeout for callbacks is set to 30 seconds
String replyemail = "replyemail_example"; // String | Email address to send replies to
Integer validity = 56; // Integer | Time in minutes to keep the SMS valid for
String cc = "cc_example"; // String | 2 character country code <a href='https://en.wikipedia.org/wiki/ISO_3166-2'>ISO 3166-2</a> for formatting local numbers internationally
try {
    SMSResult result = apiInstance.sendSMS(key, num, msg, from, deliverby, dlrcb, replycb, replyemail, validity, cc);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SMSApi#sendSMS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| API Key as generated from the &lt;a href&#x3D;&#39;https://www.smsfusion.com.au/admin/api/&#39;&gt;admin panel&lt;/a&gt; |
 **num** | [**List&lt;String&gt;**](String.md)| Comma separated list of phone numbers or &lt;a href&#x3D;&#39;https://www.smsfusion.com.au/help/msisdn/&#39;&gt;MSDISDN&lt;/a&gt;&#39;s |
 **msg** | **String**| Message content to send |
 **from** | **String**| MSISDN or vanity alphanumeric source number | [optional]
 **deliverby** | **String**| UTC encoded time to send the SMS | [optional]
 **dlrcb** | **String**| HTTP or HTTPS callback URL for delivery reports. Timeout for callbacks is set to 30 seconds | [optional]
 **replycb** | **String**| HTTP or HTTPS callback URL for replies. Timeout for callbacks is set to 30 seconds | [optional]
 **replyemail** | **String**| Email address to send replies to | [optional]
 **validity** | **Integer**| Time in minutes to keep the SMS valid for | [optional]
 **cc** | **String**| 2 character country code &lt;a href&#x3D;&#39;https://en.wikipedia.org/wiki/ISO_3166-2&#39;&gt;ISO 3166-2&lt;/a&gt; for formatting local numbers internationally | [optional]

### Return type

[**SMSResult**](SMSResult.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

