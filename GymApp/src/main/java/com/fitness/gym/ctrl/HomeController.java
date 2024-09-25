package com.fitness.gym.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("message", "This is the home page of fitness application");
		return "index";
	}

	@GetMapping("/addTrainer")
	public String addTrainer(Model model) {
		return "addTrainer";
	}
	
	@GetMapping("/viewTrainers")
	public String viewTrainers(Model model) {
		return "viewTrainers";
	}
}
