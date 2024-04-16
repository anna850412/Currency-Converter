package pl.ania.converter.demo.impl;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ania.converter.demo.service.ConverterService;

@RestController
@RequestMapping("/calculate")
public class ConverterImpl {
    @Autowired
    private ConverterService converterService;

    @GetMapping("/bid")
    public List<Double> calculateBid() {
        List<Double> result = converterService.calculateBid();
        return result;
    }

    @GetMapping("/ask")
    public List<BigDecimal> calculateAsk() {
        List<BigDecimal> result = converterService.calculateAsk();
        return result;
    }
    @GetMapping("/calculateAll")
    public String calculateAll() {
        String result1 = String.valueOf(converterService.calculateBid());
        String result2 = String.valueOf(converterService.calculateAsk());
        return "Value of bid " + result1 + "Value of ask " + result2;
    }

}
