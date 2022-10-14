package com.informatorio.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/")
@RestController		//con @Controller se debe devolver una html... @RestController permite devolver cadenas como en este ejemplo

public class ControladorUsuario{
	
	@GetMapping("/")
	public String Inicio() {
		return "Hola clase";
	}
	
	@PostMapping("/")
	public String Inicio2() {
		return "Hola clase por post";
	}
	
	@GetMapping("/inicio3")
	public String Inicio3() {
		return "Inicio 3";
	}
	
	@GetMapping("/inicio4")
	public String Inicio4() {
		return "iniciotemplate.html";
	}
	
	@DeleteMapping("/")
	public String Borrar() {
		return "se borró";
	} 
	
	@PutMapping("/")
	public String Actualizar() {
		return "se actualiza alguna información";
	}
	
}
