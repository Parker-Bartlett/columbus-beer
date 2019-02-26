package org.wecancodeit.columbusbeer.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.columbusbeer.Review;
import org.wecancodeit.columbusbeer.repositories.ReviewsRepository;

@Controller
public class HomeController {

	@Resource
	ReviewsRepository reviews;

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
	public String greetingSubmit(String beer, String review, String title, String date, int rating) {
		reviews.save(new Review(beer, review, title, date, rating));
		return "redirect:/";
	}	

}
