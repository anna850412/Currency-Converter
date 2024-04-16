package pl.ania.converter.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConverterApplication.class, args);
		System.out.println("Dziala!!!!");
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
