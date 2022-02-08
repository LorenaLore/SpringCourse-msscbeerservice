package guru.springframework.msscbeerservice.event;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {

    private static final long serialVersionUID = -8754280930566530156L;

    private BeerDto beerDto;

}
