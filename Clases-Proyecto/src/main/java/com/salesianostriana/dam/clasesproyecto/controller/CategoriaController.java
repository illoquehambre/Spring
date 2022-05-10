package com.salesianostriana.dam.clasesproyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CategoriaController {
	
	@GetMapping("/listado")
	public String listado() {
		return "Carta2";
	}

}
