package org.wecancodeit.columbusbeer.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.columbusbeer.Form;
import org.wecancodeit.columbusbeer.repositories.FormsRepository;

@Controller
public class HomeController {

	private FormsRepository forms = new FormsRepository(new ArrayList<Form>());

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("forms", forms.getForms());
		return "home";
	}

	@GetMapping("/form")
	public String greetingForm(Model model) {
		model.addAttribute("forms", forms.getForms());
		return "form";
	}

	@PostMapping("/form")
	public String greetingSubmit(String beer, String review, String title, String date, int rating) {
		forms.addForm(new Form(beer, review, title, date, rating));
		return "redirect:/";
	}	

}
