package org.wecancodeit.columbusbeer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.columbusbeer.models.Review;

@Repository
public interface ReviewsRepository extends CrudRepository<Review,Long> {

}
