package org.wecancodeit.columbusbeer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.columbusbeer.models.Tag;

@Repository
public interface TagsRepository extends CrudRepository<Tag, Long>{

}
