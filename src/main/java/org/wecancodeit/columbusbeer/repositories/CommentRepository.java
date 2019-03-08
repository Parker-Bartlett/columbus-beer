package org.wecancodeit.columbusbeer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.columbusbeer.models.Comment;
import org.wecancodeit.columbusbeer.models.Review;

@Repository
public interface CommentRepository extends CrudRepository <Comment, Long> {

	void deleteByReview(Review review);

//	void remove(CommentRepository comments);

}
