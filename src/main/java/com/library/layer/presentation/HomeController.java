package com.library.layer.presentation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping(method = RequestMethod.GET,path = "/")
	public String homePage() {
		return "Welcome in library !";
	}
}
