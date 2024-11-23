package com.perth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class perthController {
	@GetMapping("/fast bowling")
	public String fastbowling() {
		return "150 kmph";
	}

}
