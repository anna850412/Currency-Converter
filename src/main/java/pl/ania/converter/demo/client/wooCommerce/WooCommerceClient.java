package pl.ania.converter.demo.client.wooCommerce;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.ania.converter.demo.client.configuration.ProductApiClientConfiguration;
import pl.ania.converter.demo.client.woocommerce.ProductsApi;
import pl.ania.converter.demo.client.woocommerce.handler.ApiClient;
import pl.ania.converter.demo.model.response.Product;

@RestController
@RequestMapping("/api")
public class WooCommerceClient {
    @Autowired
    private ProductsApi productsApi;

    @GetMapping(value = "/products")
    public ResponseEntity<Product> getProducts(){
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://localhost:8090/woocommerce/product";
        ResponseEntity<Product> response = restTemplate.getForEntity(fooResourceUrl, Product.class);
        System.out.println("Printing html price of product " +  response.getBody().getPriceHtml());
        return response;
    }
    @GetMapping(value = "/swaggerProducts")
    public List<pl.ania.converter.demo.client.woocommerce.model.Product> getProductsFromSwagger() {

            productsApi.getApiClient().setBasePath("http://localhost:8090/woocommerce");
        //        ApiClient apiClient = new ApiClient();
//        apiClient.setBasePath("http://localhost:8090/woocommerce/product");
        return productsApi.getCurrentProducts();
    }

}
