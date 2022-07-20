package br.dev.karyon.bagarote.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lojasfisicas")
public class LojasController {
	
	@GetMapping
	@ResponseBody
	public String teste() {
		return "testando apenas :) 😊";
	}
}
