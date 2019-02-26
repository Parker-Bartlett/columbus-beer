package org.wecancodeit.columbusbeer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.columbusbeer.models.Category;

@Repository
public interface CategoriesRepository extends CrudRepository<Category, Long> {

	Category findByBeerType(String beerType);

}
