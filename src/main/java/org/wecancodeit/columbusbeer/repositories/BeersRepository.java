package org.wecancodeit.columbusbeer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.columbusbeer.models.Beer;

@Repository
public interface BeersRepository extends CrudRepository<Beer, Long> {

	Beer findByBeerNameAndBrewery(String beerName, String brewery);

}
