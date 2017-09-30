package com.jorgesaldivar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainServiceController {

	@Value("${service.instance.name}")
	private String instance;
	
	@RequestMapping("/")
	public String getBaseUrl() {
		return String.join(" ", "Hello from ", instance);
	}
	
}
