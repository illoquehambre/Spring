package com.salesianostriana.dam.clasesproyecto.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Categoria {
	
	private List <Producto> lista;
	private String nombre;
	@Id
	@GeneratedValue
	private long id;
	
}
