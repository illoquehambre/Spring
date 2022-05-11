package com.salesianostriana.dam.clasesproyecto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.clasesproyecto.model.Producto;
import com.salesianostriana.dam.clasesproyecto.servicios.ProductoServicio;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Controller
public class ProductoController {
	
	private final ProductoServicio productoServicio;
	@GetMapping({"/listadoProducto"})
	public String listado(Model model, @RequestParam("q")
	Optional <String> optional) {
		
		List <Producto> productos =new ArrayList<Producto>();
		if(optional.isEmpty()) {
			for (Producto pr : productoServicio.findAll()) {
				productos.add(pr);
			}
			
			model.addAttribute("productos",productos);
		}
		
		
		return "Carta2";
	}
}
