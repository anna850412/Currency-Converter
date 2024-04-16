# RatesApi

All URIs are relative to *https://api.nbp.pl/api/exchangerates*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentRates**](RatesApi.md#getCurrentRates) | **GET** /rates/c/eur/today | Get current rates


<a name="getCurrentRates"></a>
# **getCurrentRates**
> SwaggerNbp getCurrentRates(format)

Get current rates

Multiple status values can be provided with comma separated strings

### Example
```java
// Import classes:
//import pl.ania.converter.demo.client.handler.ApiException;
//import pl.ania.converter.demo.client.RatesApi;


RatesApi apiInstance = new RatesApi();
String format = "format_example"; // String | Decyduje o formacie response
try {
    SwaggerNbp result = apiInstance.getCurrentRates(format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatesApi#getCurrentRates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Decyduje o formacie response | [optional]

### Return type

[**SwaggerNbp**](SwaggerNbp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

