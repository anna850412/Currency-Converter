package pl.ania.converter.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ania.converter.demo.client.RatesApi;
import pl.ania.converter.demo.client.model.SwaggerNbp;

@RestController
public class EmptyEndpoint {
    @Autowired
    private RatesApi ratesApi;
    @GetMapping("/")
    public String displayHello() {
        System.out.println("Czy się cos printuje");
        SwaggerNbp json = ratesApi.getCurrentRates("json");

        return "Testing empty endpoint " + json.getCode();
    }
}
