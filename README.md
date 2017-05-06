# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.HLRApi;

public class HLRApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.smsfusion.com.au/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*HLRApi* | [**getHLR**](docs/HLRApi.md#getHLR) | **GET** /hlr/ | HLR number lookup
*HLRApi* | [**getHLRCallback**](docs/HLRApi.md#getHLRCallback) | **GET** /hlr-callback/ | HLR number lookup with results going to a callback URL
*SMSApi* | [**sendSMS**](docs/SMSApi.md#sendSMS) | **GET** /sms/ | Send an SMS


## Documentation for Models

 - [HLRCallback](docs/HLRCallback.md)
 - [HLRError](docs/HLRError.md)
 - [HLRResult](docs/HLRResult.md)
 - [OutOfCredit](docs/OutOfCredit.md)
 - [SMSResult](docs/SMSResult.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@smsfusion.com.au

