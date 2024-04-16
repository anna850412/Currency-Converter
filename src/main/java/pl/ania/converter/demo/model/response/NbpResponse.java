package pl.ania.converter.demo.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class NbpResponse {

    private String table;
    private String currency;
    private String code;
    @JsonProperty("rates")
    private List<Rates> ratesList;

}
