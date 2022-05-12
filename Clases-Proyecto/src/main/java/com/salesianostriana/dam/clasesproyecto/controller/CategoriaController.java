package com.salesianostriana.dam.clasesproyecto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.clasesproyecto.model.Categoria;
import com.salesianostriana.dam.clasesproyecto.servicios.CategoriaServicio;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class CategoriaController {

	private final CategoriaServicio categoriaServicio;
	
	@GetMapping({ "/", "/carta" })
	public String carta(Model model,  Optional<String> optional) {

		List<Categoria> categorias = new ArrayList<Categoria>();
		
			for (Categoria cat : categoriaServicio.findAll()) {
				
				categorias.add(cat);
			}

			model.addAttribute("categorias", categorias);
		
		

		return "Carta2";
	}
	
	
	@GetMapping( "/categorias")
	public String listado(Model model,  Optional<String> optional) {

		List<Categoria> categorias = new ArrayList<Categoria>();
		
			for (Categoria cat : categoriaServicio.findAll()) {
				
				categorias.add(cat);
			}

			model.addAttribute("categorias", categorias);
		
		

		return "Categorias";
	}
	
	@GetMapping( "/categoriasAdmin")
	public String gestionCategorias(Model model,  Optional<String> optional) {

		List<Categoria> categorias = new ArrayList<Categoria>();
		
			for (Categoria cat : categoriaServicio.findAll()) {
				
				categorias.add(cat);
			}

			model.addAttribute("categorias", categorias);
		
		

		return "CategoriasAdmin";
	}
	
	
	@GetMapping("/categoriasAdmin/nuevo")
	public String mostrarFormulario(Model model) {
		model.addAttribute("categoria", new Categoria());
		return "AgregarCategoria";
	}
	

	@PostMapping("/categoriasAdmin/nuevo/submit")
	public String procesarFormulario(@ModelAttribute("categoria") Categoria cat) {
		categoriaServicio.add(cat);
		return "redirect:/categoriasAdmin";
	}
	
	@GetMapping("/categoriasAdmin/borrar/{id}")
	public String borrar(@PathVariable("id") long id) {
		categoriaServicio.deleteById(id);
		return "redirect:/categoriasAdmin";
	}
}
