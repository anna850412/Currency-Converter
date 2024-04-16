package pl.ania.converter.demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ania.converter.demo.client.nbp.NbpClient;
import pl.ania.converter.demo.client.wooCommerce.WooCommerceClient;
import pl.ania.converter.demo.client.woocommerce.ProductsApi;
import pl.ania.converter.demo.client.woocommerce.model.Product;


@Service
public class ConverterService {
    @Autowired
    private ProductsApi productsApi;

    public List<Product> findAvailableProducts() {
        return productsApi.getCurrentProducts();
    }
    @Autowired
    private NbpClient nbpClient;

    @Autowired
    private WooCommerceClient wooCommerceClient;

    public List<Double> calculateBid() {
        List<Double> listOfConvertedPricesForBid = new ArrayList<>();
        List<Product> products = findAvailableProducts();

        Double bid = nbpClient.getTodayRate().getBody().getRatesList().get(0).getBid();
        for(Product product : products){
            double result = Double.parseDouble(product.getPrice()) * bid;
            listOfConvertedPricesForBid.add(result);
        }

        return listOfConvertedPricesForBid;
    }

    public List<BigDecimal> calculateAsk() {
        List<BigDecimal> listOfConvertedPricesForAsk = new ArrayList<>();
        List<Product> products = findAvailableProducts();

        BigDecimal ask = nbpClient.getTodayRate().getBody().getRatesList().get(0).getAsk();
//        String price = Objects.requireNonNull(findAvailableProducts()).toString();
//
//        BigDecimal convertedPrice = new BigDecimal(price);

        for (Product product : products){
            BigDecimal price = new BigDecimal(product.getPrice());
            BigDecimal result = ask.multiply(price);
            listOfConvertedPricesForAsk.add(result);
        }

        return listOfConvertedPricesForAsk;
    }

}
