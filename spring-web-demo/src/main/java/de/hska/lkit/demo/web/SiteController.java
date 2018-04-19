package de.hska.lkit.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

	@RequestMapping(value = "/")
	public String index(@ModelAttribute Post post, Model model) {
		model.addAttribute("greeting", post != null ? post : new Post());




		return "index";
	}

	@RequestMapping(value = "/greeting")
	public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
		model.addAttribute("greeting", greeting != null ? greeting : new Greeting());
		return greeting.isBootstrap() ? "greeting-bs" : "greeting";
	}
	@RequestMapping(value = "/register")
	public String registerSubmit(@ModelAttribute Register register, Model model) {
		model.addAttribute("register", register != null ? register : new Register());
		return "register";
	}

	@RequestMapping(value = "/login")
	public String loginSubmit(@ModelAttribute Login login, Model model) {
		model.addAttribute("login", login != null ? login : new Login());
		return "login";
	}

	@RequestMapping(value = "/timeline")
	public String timelineSubmit(@ModelAttribute TimeLine timeline, Model model) {
		model.addAttribute("Timeline", timeline != null ? timeline : new TimeLine());
		return "timeline";
	}
	@RequestMapping(value = "/user")
	public String userSubmit(@ModelAttribute UserModel user, Model model) {
		model.addAttribute("user", user != null ? user : new UserModel());
		return "user";
	}

	@RequestMapping(value = "/newEntry")
	public String newEntrySubmit(@ModelAttribute Post entry, Model model) {
		model.addAttribute("Post", entry != null ? entry : new Post());
		return "newEntry";
	}

	@RequestMapping(value = "/users") // eine liste braucht möglicherweiße keine eingaben
	public String usersSubmit(@ModelAttribute Users users, Model model) {
		model.addAttribute("users", users != null ? users : new Users());
		return "users";
	}


}

