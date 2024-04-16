package pl.ania.converter.demo.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.ania.converter.demo.client.woocommerce.ProductsApi;
import pl.ania.converter.demo.client.woocommerce.model.Product;
import pl.ania.converter.demo.service.ConverterService;

@Controller
public class HomeController {
@Autowired
    ConverterService converterService;
@Autowired
    ProductsApi productsApi;
    @GetMapping("/ania")
    public String getHome(Model model) {
        List<Double> bid = converterService.calculateBid();
        String result1 = String.valueOf(bid);
        List<Double> sortedResult1 = bid;
        Collections.sort(sortedResult1, Collections.reverseOrder());
        result1 = sortedResult1.stream().map(Object::toString).collect(Collectors.joining(", "));

        List<BigDecimal> ask = converterService.calculateAsk();
        String result2 = String.valueOf(ask);
        List<BigDecimal> sortedResult2 = ask;
        Collections.sort(sortedResult2);
        result2 = sortedResult2.stream().map(Object::toString).collect(Collectors.joining(", "));

        model.addAttribute("bid", result1);
        model.addAttribute("ask", result2);
        return "ania.html";   // refers to classpath resource /templates/home.html
    }
}