package org.wecancodeit.columbusbeer.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.columbusbeer.models.Beer;
import org.wecancodeit.columbusbeer.models.Review;

@Repository
public interface ReviewsRepository extends CrudRepository<Review,Long> {

	void deleteById(Long id);

	Optional<Beer> findByBeer(Beer beerToFind);

		
}
