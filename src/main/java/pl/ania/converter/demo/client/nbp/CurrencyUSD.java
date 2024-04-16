package pl.ania.converter.demo.client.nbp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/usd")
public class CurrencyUSD {
    @GetMapping("/today")
    public ResponseEntity<String> getTodayRate() {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://api.nbp.pl/api/exchangerates/rates/c/usd/today/?format=json/";
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
        System.out.println("Response body" + response);
        return response;
    }

}
