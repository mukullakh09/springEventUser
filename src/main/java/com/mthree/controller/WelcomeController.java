package com.mthree.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Events !!!";
	}
}
