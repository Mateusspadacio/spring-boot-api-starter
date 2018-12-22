package com.br.project.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
public class Foo {

	@GetMapping
	public String hello() {
		return "hello";
	}
	
	@PostMapping
	public String posted() {
		return "oh yeah";
	}
}
