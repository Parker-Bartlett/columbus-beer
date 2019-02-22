package org.wecancodeit.columbusbeer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.columbusbeer.Form;

@Repository
public interface FormsRepository extends CrudRepository<Form, Long> {

}
