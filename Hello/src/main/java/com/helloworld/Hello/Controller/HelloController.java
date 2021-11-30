package com.helloworld.Hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // informa que se trata de um Controller
@RequestMapping("/Hello") // informa o caminho que vai precisar acessar no Postman

public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello, Generation!";
	}
	
	@GetMapping("/HabMent")
	public String habMent() {
		return "Atenção aos detalhes e persistência";
	}
	
	@GetMapping("/Objetivos")
	public String objetivos() {
		return "Nesta semana quero compreender os conceitos de API REST para conseguir avançar em meus estudos de programação!";
	}
	
	

}


