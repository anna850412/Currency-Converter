# ProductsApi

All URIs are relative to *http://localhost:8090/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentProducts**](ProductsApi.md#getCurrentProducts) | **GET** /product | Get current products


<a name="getCurrentProducts"></a>
# **getCurrentProducts**
> List&lt;Product&gt; getCurrentProducts()

Get current products

Multiple status values can be provided with comma separated strings

### Example
```java
// Import classes:
//import pl.ania.converter.demo.client.woocommerce.handler.ApiException;
//import pl.ania.converter.demo.client.woocommerce.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
try {
    List<Product> result = apiInstance.getCurrentProducts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#getCurrentProducts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

