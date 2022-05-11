package com.salesianostriana.dam.clasesproyecto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.clasesproyecto.model.Categoria;
import com.salesianostriana.dam.clasesproyecto.servicios.CategoriaServicio;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class CategoriaController {

	private final CategoriaServicio categoriaServicio;

	@GetMapping({ "/", "/listadoCategoria" })
	public String listado(Model model, @RequestParam("q") Optional<String> optional) {

		List<Categoria> categorias = new ArrayList<Categoria>();
		if(optional.isEmpty()) {
			for (Categoria cat : categoriaServicio.findAll()) {
				
				categorias.add(cat);
			}

			model.addAttribute("categorias", categorias);
		}
		

		return "Carta2";
	}
}
