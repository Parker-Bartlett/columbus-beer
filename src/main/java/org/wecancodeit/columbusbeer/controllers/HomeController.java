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
	public String home() {
		return "home";
	}

	@GetMapping("/form")
	public String greetingForm(Model model) {
		model.addAttribute("forms", forms.getForms());
		return "form";
	}

	@GetMapping("/formresult")
	public String formResult() {
		return "formresult";
	}
	@PostMapping("/form")
	public String greetingSubmit(String name, String review) {
		forms.addForm(new Form(name, review));
		return "redirect:/formresult";
	}
	
}
