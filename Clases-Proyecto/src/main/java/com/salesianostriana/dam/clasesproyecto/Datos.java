package com.salesianostriana.dam.clasesproyecto;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.salesianostriana.dam.clasesproyecto.model.Categoria;
import com.salesianostriana.dam.clasesproyecto.model.Producto;

public class Datos {
	
	@PostConstruct
	public void run() {
		List <Producto> pr = new ArrayList<Producto>();
		Categoria cat = new Categoria(1L, "ensaladas", pr);
	}
	
}
