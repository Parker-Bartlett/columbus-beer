package org.wecancodeit.columbusbeer;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wecancodeit.columbusbeer.models.Beer;
import org.wecancodeit.columbusbeer.models.Review;
import org.wecancodeit.columbusbeer.repositories.BeersRepository;
import org.wecancodeit.columbusbeer.repositories.CategoriesRepository;
import org.wecancodeit.columbusbeer.repositories.ReviewsRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class ReviewTest {
	
	@Resource
	private TestEntityManager entityManager;
	 
	@Resource 
	private BeersRepository beersRepo;
	
	@Resource
	private CategoriesRepository categoriesRepo;
	
	@Resource ReviewsRepository reviewsRepo;
	Review underTest;
//	@Before
//	public void setup() {
//		underTest = reviewsRepo.save(new Review(beersRepo.save(new Beer("name", null, null)), "tastes good", "drunk","03/04/19", 4));
//	}
//	@Test
//	public void shouldSaveAndLoadReview() {
//		entityManager.persist(underTest);
//	    entityManager.flush(); 
//	    entityManager.clear();
//	    
//	    Long id;
//		Review reviewFromDatabase = reviewsRepo.findById(id)
//		
//	    assertThat(reviewFromDatabase.getBeer(),is(new Beer("coors", null, null)));
//	    assertThat(reviewFromDatabase.getReview(), is("tastes good"));
//	    assertThat(reviewFromDatabase.getTitle(), is("drunk"));
//	    assertThat(reviewFromDatabase.getDate(), is("03/04/19"));
//	    assertThat(reviewFromDatabase.getRating(), is (4));
//	    
//	}

}
