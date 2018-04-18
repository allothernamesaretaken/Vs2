package de.hska.lkit.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

	@RequestMapping(value = "/greeting")
	public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
		model.addAttribute("greeting", greeting != null ? greeting : new Greeting());
		return greeting.isBootstrap() ? "greeting-bs" : "greeting";
	}
	@RequestMapping(value = "/register")
	public String registerSubmit(@ModelAttribute Register register, Model model) {
		return "register";
	}

	@RequestMapping(value = "/login")
	public String loginSubmit(@ModelAttribute Register register, Model model) {
		return "login";
	}

	@RequestMapping(value = "/timeline")
	public String timelineSubmit(@ModelAttribute Register register, Model model) {
		return "timeline";
	}
	@RequestMapping(value = "/user")
	public String userSubmit(@ModelAttribute Register register, Model model) {
		return "user";
	}

	@RequestMapping(value = "/newEntry")
	public String newEntrySubmit(@ModelAttribute Register register, Model model) {
		return "newEntry";
	}

	@RequestMapping(value = "/users")
	public String usersSubmit(@ModelAttribute Register register, Model model) {
		return "users";
	}


}

