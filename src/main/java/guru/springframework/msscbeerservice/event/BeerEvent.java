package guru.springframework.msscbeerservice.event;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class BeerEvent implements Serializable {

    private static final long serialVersionUID = -8754280930566530156L;

    private final BeerDto beerDto;

}
