package pl.ania.converter.demo.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rates {
    @JsonProperty("no")
    private String number;
    @JsonProperty("effectiveDate")
    private String date;
    private Double bid;
    private BigDecimal ask;

}
