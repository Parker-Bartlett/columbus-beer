package org.wecancodeit.columbusbeer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.columbusbeer.models.Comment;

@Repository
public interface CommentRepository extends CrudRepository <Comment, Long> {

}
