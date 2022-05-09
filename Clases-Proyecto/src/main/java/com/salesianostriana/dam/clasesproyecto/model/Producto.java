package com.salesianostriana.dam.clasesproyecto.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Producto {
	
	
	@Id
	@GeneratedValue
	private long id;
	private String nombre;
	private double precio;
	private int cantidadDisponible;
}
