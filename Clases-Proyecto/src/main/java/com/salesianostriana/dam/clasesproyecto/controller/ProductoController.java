package com.salesianostriana.dam.clasesproyecto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.clasesproyecto.model.Categoria;
import com.salesianostriana.dam.clasesproyecto.model.LineaDeVenta;
import com.salesianostriana.dam.clasesproyecto.model.Producto;
import com.salesianostriana.dam.clasesproyecto.servicios.CategoriaServicio;
import com.salesianostriana.dam.clasesproyecto.servicios.LineaDeVentaServicio;
import com.salesianostriana.dam.clasesproyecto.servicios.ProductoServicio;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Controller
@RequestMapping("/categorias")
public class ProductoController {

	private final CategoriaServicio categoriaServicio;
	
	private final ProductoServicio productoServicio;
	
	private final LineaDeVentaServicio lineaDeVentaServicio;
	
	@GetMapping({"/{id}/productos"})
	public String listado(Model model,  @PathVariable Long id) {
		
		List <Producto> productos =new ArrayList<Producto>();
		
			for (Producto pr : productoServicio.findByCategoria(id)) {
				productos.add(pr);
			}
			
			model.addAttribute("productos",productos);
		
		
		
		
		return "Productos";
	}
	
	/*@GetMapping("/productos/categorias/{id}")
    public String productoPorCat(Model model, @PathVariable("id") Long Id) {

        List<Producto> productos = new ArrayList<>();
        for (Producto producto : productoServicio.findByCategoria(Id)) {
            productos.add(producto);

        }
        model.addAttribute("productos", productos);

        return "Productos";
    }*/
	@GetMapping("/{id}/productos/nuevo")
	public String mostrarFormulario(Model model) {
		model.addAttribute("producto", new Producto());
		return "Productos";
	}
	
	@PostMapping("/{id}/productos/submit")
	public String procesarFormulario(@ModelAttribute("lineaDeVenta") LineaDeVenta lv) {
		lineaDeVentaServicio.add(lv);
		return "redirect:/ticket";//Podría ser también return "redirect:/list
	}
	
	 @ModelAttribute("categorias")
	 public List<Categoria> categorias(){
		 return categoriaServicio.findAll();
	 }
}
