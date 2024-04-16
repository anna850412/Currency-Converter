package pl.ania.converter.demo.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NewClient {

    @GetMapping("/connection")
    public ResponseEntity<String> getConnectionToSpringBoot(){
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://localhost:8090/eur/today";
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
        System.out.println("Response body" + response);
        return response;
    }
}
