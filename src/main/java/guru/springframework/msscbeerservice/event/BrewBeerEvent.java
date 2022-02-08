package guru.springframework.msscbeerservice.event;

import guru.springframework.msscbeerservice.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent {

    BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
