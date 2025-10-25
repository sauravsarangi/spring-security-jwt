package com.saurav.jwtspringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

	@GetMapping("hello")
	public String greet() {
		return "Hello Saurav ";
	}
	
	@GetMapping("about")
	public String about(HttpServletRequest request) {
		return "Saurav about info:: "+request.getSession().getId();
	}
}
