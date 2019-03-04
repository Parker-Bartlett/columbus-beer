package org.wecancodeit.columbusbeer.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.columbusbeer.models.Beer;
import org.wecancodeit.columbusbeer.models.Category;
import org.wecancodeit.columbusbeer.models.Review;
import org.wecancodeit.columbusbeer.repositories.BeersRepository;
import org.wecancodeit.columbusbeer.repositories.CategoriesRepository;
import org.wecancodeit.columbusbeer.repositories.ReviewsRepository;

@Controller
public class HomeController {

	@Resource
	ReviewsRepository reviews;
	@Resource
	BeersRepository beers;
	@Resource
	CategoriesRepository categories;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("categories", categories.findAll());
		model.addAttribute("reviews", reviews.findAll());
		return "home";
	}

	@GetMapping("/review")
	public String review(Model model) {
		model.addAttribute("reviews", reviews.findAll());
		model.addAttribute("categories", categories.findAll());
		return "review";
	}

	@PostMapping("/review")
	public String reviewSubmit(Beer beer, String review, String title, String date, int rating, String type, String beerName, String beerType, String brewery) {
		Category categoryToMake = categories.findByBeerType(beerType);
		if (categoryToMake == null) {
			categoryToMake = categories.save(new Category(beerType));
		}
		categoryToMake = categories.save(categoryToMake);
		
		Beer beerToMake = beers.findByBeerNameAndBrewery(beerName, brewery);
		if (beerToMake == null) {
		beerToMake = beers.save(new Beer(beerName, categoryToMake, brewery));
		}
		beerToMake = beers.save(beerToMake);
		reviews.save(new Review(beerToMake, review, title, date, rating));
		return "redirect:/";
	}	

//	type testing
	
	@GetMapping("/{id}")
	public String beerOfSelectedType(@PathVariable Long id, Model model) {
		model.addAttribute("beers", beers.findAll());
		return "category";
	}
	
	
	
	
	
}
