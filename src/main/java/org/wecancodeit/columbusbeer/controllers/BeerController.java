package org.wecancodeit.columbusbeer.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.columbusbeer.repositories.BeersRepository;
import org.wecancodeit.columbusbeer.repositories.ReviewsRepository;

@Controller
@RequestMapping ("/beer")
public class BeerController {
		
	@Resource
	BeersRepository beer;
	@Resource
	ReviewsRepository review;	
}
