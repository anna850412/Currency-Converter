package pl.ania.converter.demo;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WooCommerceEndpoint {
    @GetMapping(value = "/woocommerce/product", produces = MediaType.APPLICATION_JSON_VALUE)
    public String displayHello() {

        String response = String.valueOf("[{\n" +
                "    \"id\": 799,\n" +
                "    \"name\": \"Ship Your Idea\",\n" +
                "    \"slug\": \"ship-your-idea-22\",  \n" +
                "    \"price\": \"30\",    \n" +
                "    \"price_html\": \"<span class=\\\"woocommerce-Price-amount amount\\\"><span class=\\\"woocommerce-Price-currencySymbol\\\">&#36;</span>30</span>\",    \n" +
                "    \"categories\": [\n" +
                "      {\n" +
                "        \"id\": 9,\n" +
                "        \"name\": \"Clothing\",\n" +
                "        \"slug\": \"clothing\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 14,\n" +
                "        \"name\": \"T-shirts\",\n" +
                "        \"slug\": \"t-shirts\"\n" +
                "      }\n" +
                "    ]\n" +
                "},\n" +
                "{\n" +
                "    \"id\": 798,\n" +
                "    \"name\": \"T-shirt\",\n" +
                "    \"slug\": \"ship-your-idea-22\",  \n" +
                "    \"price\": \"50\",    \n" +
                "    \"price_html\": \"<span class=\\\"woocommerce-Price-amount amount\\\"><span class=\\\"woocommerce-Price-currencySymbol\\\">&#36;</span>50</span>\",    \n" +
                "    \"categories\": [\n" +
                "      {\n" +
                "        \"id\": 9,\n" +
                "        \"name\": \"Clothing\",\n" +
                "        \"slug\": \"clothing\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 14,\n" +
                "        \"name\": \"T-shirts\",\n" +
                "        \"slug\": \"t-shirts\"\n" +
                "      }\n" +
                "    ]\n" +
                "},{\n" +
                "    \"id\": 780,\n" +
                "    \"name\": \"Rock\",\n" +
                "    \"slug\": \"ship-your-idea-22\",  \n" +
                "    \"price\": \"80\",    \n" +
                "    \"price_html\": \"<span class=\\\"woocommerce-Price-amount amount\\\"><span class=\\\"woocommerce-Price-currencySymbol\\\">&#36;</span>80</span>\",    \n" +
                "    \"categories\": [\n" +
                "      {\n" +
                "        \"id\": 9,\n" +
                "        \"name\": \"Clothing\",\n" +
                "        \"slug\": \"clothing\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 14,\n" +
                "        \"name\": \"T-shirts\",\n" +
                "        \"slug\": \"t-shirts\"\n" +
                "      }\n" +
                "    ]\n" +
                "}\n" +
                "    ]");

        return response;
    }
}
