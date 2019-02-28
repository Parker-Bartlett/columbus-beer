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
@RequestMapping("/category")
public class CategoryContoller {
	@Resource
	ReviewsRepository reviews;
	@Resource
	BeersRepository beers;
	@Resource
	CategoriesRepository categories;

@GetMapping("/{id}")
public String findOneCategory (@PathVariable Long id, Model model) {
	model.addAttribute("category" , categories.findById(id).get());
	return "category";
	
}

}	