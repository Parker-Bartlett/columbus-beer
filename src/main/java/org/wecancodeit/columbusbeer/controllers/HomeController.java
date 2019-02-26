package org.wecancodeit.columbusbeer.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.columbusbeer.models.Beer;
import org.wecancodeit.columbusbeer.models.Review;
import org.wecancodeit.columbusbeer.repositories.BeersRepository;
import org.wecancodeit.columbusbeer.repositories.ReviewsRepository;

@Controller
public class HomeController {

	@Resource
	ReviewsRepository reviews;
	@Resource
	BeersRepository beers;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("reviews", reviews.findAll());
		return "home";
	}

	@GetMapping("/review")
	public String greetingForm(Model model) {
		model.addAttribute("reviews", reviews.findAll());
		return "review";
	}

	@PostMapping("/review")
	public String greetingSubmit(Beer beer, String review, String title, String date, int rating, String type, String beerName, String beerType, String brewery) {
		Beer beerToMakeReview = new Beer(beerName, beerType, brewery);
		beers.save(beerToMakeReview);
		reviews.save(new Review(beerToMakeReview, review, title, date, rating));
		return "redirect:/";
	}	

}
