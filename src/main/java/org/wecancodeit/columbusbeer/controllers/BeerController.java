package org.wecancodeit.columbusbeer.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.columbusbeer.models.Beer;
import org.wecancodeit.columbusbeer.models.Tag;
import org.wecancodeit.columbusbeer.repositories.BeersRepository;
import org.wecancodeit.columbusbeer.repositories.CategoriesRepository;
import org.wecancodeit.columbusbeer.repositories.ReviewsRepository;
import org.wecancodeit.columbusbeer.repositories.TagsRepository;

@Controller
@RequestMapping("/beer")
public class BeerController {

	@Resource
	BeersRepository beers;
	@Resource
	ReviewsRepository reviews;
	@Resource
	CategoriesRepository categories;
	@Resource
	TagsRepository tags;
	

	@GetMapping("/{id}")
	public String singleBeer(@PathVariable Long id, Model model) {
		model.addAttribute("beer", beers.findById(id).get());
		model.addAttribute("categories", categories.findAll());
		model.addAttribute("review", reviews.findAll());
		return "beer";
	}

	@PostMapping("/{id}")
	public String submitTagName(@PathVariable Long id, String tagName) {
		Tag tagToSave = tags.findByTagName(tagName);
		Beer beer = beers.findById(id).get();
		
		
		if(tagToSave == null) {
			tagToSave = tags.save(new Tag(tagName));
		} 
		beer.addTagToTags(tagToSave);
		beers.save(beer);

		return "redirect:/beer/" +id;
	}
	
}
