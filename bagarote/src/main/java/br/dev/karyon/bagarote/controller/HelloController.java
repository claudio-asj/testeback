package br.dev.karyon.bagarote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")//a url quando o spring chama esse metodo
	@ResponseBody //n achar que é um pagina
	public String hello() {
		return "Hello World!";
	}
}
