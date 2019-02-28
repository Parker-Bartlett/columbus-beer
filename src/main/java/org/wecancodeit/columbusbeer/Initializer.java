package org.wecancodeit.columbusbeer;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.columbusbeer.models.Beer;
import org.wecancodeit.columbusbeer.models.Category;
import org.wecancodeit.columbusbeer.models.Review;
import org.wecancodeit.columbusbeer.repositories.BeersRepository;
import org.wecancodeit.columbusbeer.repositories.CategoriesRepository;
import org.wecancodeit.columbusbeer.repositories.ReviewsRepository;

@Service
public class Initializer implements CommandLineRunner {

	@Resource
	BeersRepository beerRepo;
	
	@Resource
	CategoriesRepository catRepo;
	
	@Resource
	ReviewsRepository reviewsRepo;

	@Override
	public void run(String... args) throws Exception {
		Category category = catRepo.save(new Category("ale"));
		
		Beer beer = beerRepo.save(new Beer("Budlight", category, "Bud"));
		reviewsRepo.save(new Review(beer, "Great", "Title", "Date", 5));
		
		Beer beer2 = beerRepo.save(new Beer("Natty Light", category, "Natty"));
		reviewsRepo.save(new Review(beer2, "Great", "Title", "Date", 5));
		
	}
	
}


//@Service
//public class Initializer implements CommandLineRunner {
//
//	@Resource
//	PeopleRepository peopleRepo;
//
//	@Resource
//	AddressRepository addressRepo;
//
//	@Override
//	public void run(String... args) throws Exception {
//		Address address = addressRepo.save(new Address("123 Fake Street", "Columbus", "OH", "43202"));
//		
//		peopleRepo.save(new Person("Ajax", 31, "#39add1", address));
//		peopleRepo.save(new Person("JavaScript", 41, "#c0ffee", address));
//		peopleRepo.save(new Person("Java", 51, "#bada55", address));
//	}
//
//}