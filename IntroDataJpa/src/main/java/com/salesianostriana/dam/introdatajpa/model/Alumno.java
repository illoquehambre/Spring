package com.salesianostriana.dam.introdatajpa.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;



public class Alumno {
	
	@Id @GeneratedValue
	private long id;
	private String nombre;
	private String apellidos;
	
}
