package pl.ania.converter.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency")
public class Currency {
    @GetMapping("/test")
    public String displayHello(){
        return "Testing currency endpoint";
    }
}
