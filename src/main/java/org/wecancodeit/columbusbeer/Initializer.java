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
		Category wheat = catRepo.save(new Category("Wheat"));
		
		
		
		Beer beer1 = beerRepo.save(new Beer("Chasing Mirrors", ipa, "Wylan", "https://scontent-lga3-1.cdninstagram.com/vp/30285ba6569415dcd4c6c3444a1f9aeb/5CEEEF65/t51.2885-15/sh0.08/e35/s640x640/51495326_857893031216015_8125350001436647552_n.jpg?_nc_ht=scontent-lga3-1.cdninstagram.com"));
		reviewsRepo.save(new Review(beer1, "17.6° Plato OG 1072.2 ABV 7.1% IPA... Big, bold and creamy with a heavy dose of wheat and flakes backed up with an amalgam of new season tropical hop treats including Citra, Chinook, Centennial and Mosaic. Big,ripe and fleshy with a soft fruit fullness and a pulpy, whipped velvety finish. Now that you know what goes there, what’s to stop you taking it home?"
				+ "", "Delicious brew from Wylan!", "2/22/19", 5));
		
		Beer beer2 = beerRepo.save(new Beer("Russian River Pliny the Younger", ipa, "Russian River Brewing", "https://www.americancraftbeer.com/wp-content/uploads/2018/01/pliny-the-younger-600.jpg"));
		reviewsRepo.save(new Review(beer2, "10 oz pour on tap at Blue Palms Brewhouse (unfortunately, it kicked later than night so no more--maybe next year!). Appearance is lightly hazy yellow with nice sparkle, thin cap of white head with fair retention and trace leggy lacing. Aroma is strong pine, grapefruit, citrus. Taste is strong grapefruit, pine, lighter tropical fruit and citrus. Palate is medium bodied with smooth, thick texture, soft carbonation and fairly dry, crisp finish as taste, dominated by a pleasant grapefruit/piney bitterness. Overall, very, very nice. Bold aroma and flavor but not quite as complex as Elder. It's no wonder these two…\n" + 
				"", "Very wet beer!", "2019/2/28", 4));
		
		Beer beer3 = beerRepo.save(new Beer("Mikkeller Beer Geek Breakfast", stout, "Mikkeller", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRC18j6KoDf_y85NEv1B4VOFmiTZ8XrS79s_XBIPyJt-DMip5sV"));
		reviewsRepo.save(new Review(beer3, "Deep black body with a small, vanishing brown head. Aroma of burnt coffee, vanille, endive. Taste is burnt coffee grounds, grass. Long bitter finish. Medium body, soft carbonation, oily texture\n" 
					+ "",  "My new favorite", "2/23/19", 5));		
		
		
		//WHEAT BEERS//
		Beer wheat1 = beerRepo.save(new Beer("Samuel Adams Cherry Wheat", wheat, "Samuel Adams", 
				"https://www.anconaswine.com/images/sites/anconaswine/labels/w5582186zc_1.jpg"));
						reviewsRepo.save(new Review(wheat1, 
				"Poured from bottle into tulip. Hazy orange color, very light head. Cherry cough syrup is all I can smell. Still a fairly strong Cherry cough syrup flavor but not quite as much as the smell, lingers several seconds and finally you transition into a little bit of wheat flavor. Its strangely unnatural amounts of cherry. Fairly light bodied decent carbonation"
								+ "", "Not a fan of this one.", "3/01/19", 1));


						Beer wheat2 = beerRepo.save(new Beer("Witte Wheat Ale", wheat, "Ommegang", 
				"https://res.cloudinary.com/ratebeer/image/upload/w_152,h_309,c_pad,d_beer_img_default.png,f_auto/beer_33198"));
						reviewsRepo.save(new Review(wheat2, "Ar: Refined, herbal hops - pils malt, some pepper and coriander. Ap: Cloudy straw golden - medium-large white head with good retention, fine bubbles, and a thick cap of foam remaining. T: Clean pils malt, some sulfur - crackers, some lime and orange pith - hints of pepper - lean lemony finish, with a low bitterness. P: Light body with very high carbonation - finish is very dry. O: Fair wit - a bit too clean, comes off somewhat flat. 2019 Edit: Flavor has much more pronounced black pepper and citrus throughout. Definately improved, particularly on the previously lackluster finish. +1 to Taste and +3 to Overall."
				+ "", "One of Ommegang's Best", "3/03/19", 5));




					Beer wheat3 = beerRepo.save(new Beer("Hell or High Watermelon", wheat, "21st Amendment", 
				"https://i.ebayimg.com/images/g/w6QAAOSw1lBbUSdQ/s-l300.jpg"));
						reviewsRepo.save(new Review(wheat3, 
				"Purchase from my local BevMo. Fionn Whitehead a top of a hazy golden body. The taste of cool it's sweet the watermelon comes a parent but there's something off on the aftertaste.  It smells of watermelon and  salt? Kind of tastes like a gose. Not bad but I'm probably not purchase it again.", "So So, but interesting.", "3/03/19", 3));
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