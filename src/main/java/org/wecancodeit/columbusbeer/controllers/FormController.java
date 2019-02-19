package org.wecancodeit.columbusbeer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.columbusbeer.Form;

@Controller
public class FormController {

	 	@GetMapping("/form")
	    public String greetingForm(Model model) {
	        model.addAttribute("form", new Form(null, null));
	        return "form";
	    }

	    @PostMapping("/form")
	    public String greetingSubmit(@ModelAttribute Form form) {
	        return "formresult";
	    }

}
