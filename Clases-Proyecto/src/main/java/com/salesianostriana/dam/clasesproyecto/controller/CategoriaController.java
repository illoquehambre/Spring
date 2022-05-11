package com.salesianostriana.dam.clasesproyecto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.clasesproyecto.model.Categoria;
import com.salesianostriana.dam.clasesproyecto.servicios.CategoriaServicio;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class CategoriaController {

	private final CategoriaServicio categoriaServicio;

	@GetMapping({ "/", "/categorias" })
	public String listado(Model model,  Optional<String> optional) {

		List<Categoria> categorias = new ArrayList<Categoria>();
		
			for (Categoria cat : categoriaServicio.findAll()) {
				
				categorias.add(cat);
			}

			model.addAttribute("categorias", categorias);
		
		

		return "Categorias";
	}
}
