
	package org.wecancodeit.columbusbeer.controllers;

	import javax.annotation.Resource;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.wecancodeit.columbusbeer.repositories.BeersRepository;
	import org.wecancodeit.columbusbeer.repositories.CategoriesRepository;
	import org.wecancodeit.columbusbeer.repositories.CommentRepository;
	import org.wecancodeit.columbusbeer.repositories.ReviewsRepository;
	import org.wecancodeit.columbusbeer.repositories.TagsRepository;

	@Controller
	public class TagController {
		
		@Resource
		ReviewsRepository reviews;
		@Resource
		BeersRepository beers;
		@Resource
		CategoriesRepository categories;
		@Resource
		TagsRepository tags;
		@Resource
		CommentRepository comments;
		
		@GetMapping ("/tag/{id}")
		public String singleTag(@PathVariable Long id, Model model) {
			model.addAttribute("categories", categories.findAll());
			model.addAttribute("tag", tags.findById(id).get());
			return "tag";
		}
	}

