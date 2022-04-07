package com.example.demo.CONTROLLER;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
	
	@GetMapping
	public String hola() {
		return "hola";
	}
}
