package com.premit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping(path = "/ecommerce")
	public String loadWelcomePage() {
		return "Welcome";
	}
}
