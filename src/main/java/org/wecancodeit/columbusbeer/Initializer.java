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
		Category ipa = catRepo.save(new Category("IPA"));
		Category stout = catRepo.save(new Category("Stout"));
		
		
		Beer beer = beerRepo.save(new Beer("Chasing Mirrors", ipa, "Wylan", "https://scontent-lga3-1.cdninstagram.com/vp/30285ba6569415dcd4c6c3444a1f9aeb/5CEEEF65/t51.2885-15/sh0.08/e35/s640x640/51495326_857893031216015_8125350001436647552_n.jpg?_nc_ht=scontent-lga3-1.cdninstagram.com"));
		reviewsRepo.save(new Review(beer, "17.6° Plato OG 1072.2 ABV 7.1% IPA... Big, bold and creamy with a heavy dose of wheat and flakes backed up with an amalgam of new season tropical hop treats including Citra, Chinook, Centennial and Mosaic. Big,ripe and fleshy with a soft fruit fullness and a pulpy, whipped velvety finish. Now that you know what goes there, what’s to stop you taking it home?"
				+ "", "Delicious brew from Wylan!", "2/22/19", 5));
		
		Beer beer2 = beerRepo.save(new Beer("Russian River Pliny the Younger", ipa, "Russian River Brewing", "https://scontent-lga3-1.cdninstagram.com/vp/30285ba6569415dcd4c6c3444a1f9aeb/5CEEEF65/t51.2885-15/sh0.08/e35/s640x640/51495326_857893031216015_8125350001436647552_n.jpg?_nc_ht=scontent-lga3-1.cdninstagram.com"));
		reviewsRepo.save(new Review(beer2, "10 oz pour on tap at Blue Palms Brewhouse (unfortunately, it kicked later than night so no more--maybe next year!). Appearance is lightly hazy yellow with nice sparkle, thin cap of white head with fair retention and trace leggy lacing. Aroma is strong pine, grapefruit, citrus. Taste is strong grapefruit, pine, lighter tropical fruit and citrus. Palate is medium bodied with smooth, thick texture, soft carbonation and fairly dry, crisp finish as taste, dominated by a pleasant grapefruit/piney bitterness. Overall, very, very nice. Bold aroma and flavor but not quite as complex as Elder. It's no wonder these two…\n" + 
				"", "Very wet beer!", "2019/2/28", 4));
		
		Beer beer3 = beerRepo.save(new Beer("Mikkeller Beer Geek Breakfast", stout, "Mikkeller", "https://scontent-lga3-1.cdninstagram.com/vp/30285ba6569415dcd4c6c3444a1f9aeb/5CEEEF65/t51.2885-15/sh0.08/e35/s640x640/51495326_857893031216015_8125350001436647552_n.jpg?_nc_ht=scontent-lga3-1.cdninstagram.com"));
		reviewsRepo.save(new Review(beer3, "Deep black body with a small, vanishing brown head. Aroma of burnt coffee, vanille, endive. Taste is burnt coffee grounds, grass. Long bitter finish. Medium body, soft carbonation, oily texture\n" 
					+ "",  "My new favorite", "2/23/19", 5));		
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