package pl.ania.converter.demo.client.nbp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.ania.converter.demo.model.response.NbpResponse;

@RestController
@RequestMapping("/eur")
public class NbpClient {
    @GetMapping("/today")
    public ResponseEntity<NbpResponse> getTodayRate() {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://api.nbp.pl/api/exchangerates/rates/c/eur/today/?format=json/";
        ResponseEntity<NbpResponse> response = restTemplate.getForEntity(fooResourceUrl, NbpResponse.class);

        System.out.println("Response body " + response.getBody().getRatesList().get(0).getAsk());
        return response;
    }
}
