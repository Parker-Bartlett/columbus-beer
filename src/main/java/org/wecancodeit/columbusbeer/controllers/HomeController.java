package org.wecancodeit.columbusbeer.controllers;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.columbusbeer.models.Beer;
import org.wecancodeit.columbusbeer.models.Comment;
import org.wecancodeit.columbusbeer.models.Review;
import org.wecancodeit.columbusbeer.models.Tag;
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


//	type testing
	
	@GetMapping("/{id}")
	public String beerOfSelectedType(@PathVariable Long id, Model model) {
		model.addAttribute("beers", beers.findAll());
		return "category";
	}
	@PostMapping("/deleteReview") //trying to create method to delete review. method built in Beer.java
	public String deleteReview(Long id) {
//		Optional<Review> review = reviews.findById(id);
		reviews.deleteById(id);
		return "redirect:/";		
	}

}
