package org.wecancodeit.columbusbeer.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.columbusbeer.repositories.BeersRepository;
import org.wecancodeit.columbusbeer.repositories.CategoriesRepository;
import org.wecancodeit.columbusbeer.repositories.ReviewsRepository;

@Controller
@RequestMapping("/beer")
public class BeerController {

	@Resource
	BeersRepository beer;
	@Resource
	ReviewsRepository review;
	@Resource
	CategoriesRepository category;

	@GetMapping("/{id}")
	public String singleBeer(@PathVariable Long id, Model model) {
		model.addAttribute("beer", beer.findById(id).get());
		return "beer";
	}

}
