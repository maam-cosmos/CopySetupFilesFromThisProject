package com.copysetupfiles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	/*@RequestMapping(value="/")
	public String returnIndexPage (){
		return "index";
	}*/
	
	@GetMapping("/")
    public String greetingForm(Model model) {
        model.addAttribute("checkboxvalues", new CheckBoxValues());
        return "index";
    }

    @PostMapping("/")
    public String greetingSubmit(@ModelAttribute CheckBoxValues checkboxvalues) {
        return "index";
    }

}
