package pl.ania.converter.demo.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class Product {
    private Integer id;
    private String name;
    private String price;
    @JsonProperty("price_html")
    private String priceHtml;
    @JsonProperty("categories")
    private List<Category> categoryList;
}
