package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping(value = "/")
	public String greeting() {
		return "Welcome to Spring boot with Azure";
	}
}
