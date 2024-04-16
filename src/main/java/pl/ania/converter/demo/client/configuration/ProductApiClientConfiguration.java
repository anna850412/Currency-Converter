package pl.ania.converter.demo.client.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.ania.converter.demo.client.woocommerce.ProductsApi;
import pl.ania.converter.demo.client.woocommerce.handler.ApiClient;

@Configuration
public class ProductApiClientConfiguration {
    @Bean
    public ProductsApi productsApi() {
        return new ProductsApi(apiClient());
    }

    @Bean
    public ApiClient apiClient() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8090/woocommerce");
        return apiClient;
    }
}
