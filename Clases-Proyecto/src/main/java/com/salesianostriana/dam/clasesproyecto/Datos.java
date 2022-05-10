package com.salesianostriana.dam.clasesproyecto;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.salesianostriana.dam.clasesproyecto.model.Categoria;
import com.salesianostriana.dam.clasesproyecto.model.Producto;
import com.salesianostriana.dam.clasesproyecto.servicios.CategoriaServicio;
import com.salesianostriana.dam.clasesproyecto.servicios.ProductoServicio;

public class Datos {
	
	@Autowired
	private CategoriaServicio categoriaServicio;
	
	@Autowired
	private ProductoServicio productoServicio;
	
	
	
	
	@PostConstruct
	public void run() {
		List <Producto> pr = new ArrayList<Producto>();
		Categoria cat = new Categoria(1L, "ensaladas", pr);
		
		pr.add(new Producto(1L, "nuovbu32b", 4654.45, 123, "https://www.google.com/imgres?imgurl=https%3A%2F%2Fm.media-amazon.com%2Fimages%2FM%2FMV5BNWI0ZWQxMjItMDJiMy00MDY5LWFlZTAtOGU5NDJkNzUxYjNmXkEyXkFqcGdeQXVyODMyNTM0MjM%40._V1_.jpg&imgrefurl=https%3A%2F%2Fm.imdb.com%2Ftitle%2Ftt7965802%2Fmediaviewer%2Frm4059167489&tbnid=lfKi7_7XS1SDnM&vet=12ahUKEwjHtoL6z9X3AhUV_xoKHX41BcwQMygCegUIARDcAQ..i&docid=VjheadCdAbLYfM&w=1271&h=711&q=megalo%20box&client=opera-gx&ved=2ahUKEwjHtoL6z9X3AhUV_xoKHX41BcwQMygCegUIARDcAQ", cat));
		
		categoriaServicio.save(cat);
	}
	
}
