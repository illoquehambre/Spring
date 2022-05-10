package com.salesianostriana.dam.introdatajpa.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//Sirve para meter los métodos getter, setter, toString, hashcode...
@Entity//Sirve para hacer conexion con la base de datos
@AllArgsConstructor//Constructor full de argumentos
@NoArgsConstructor//Constructor SIN argumentos
@Builder//No entiendo muy bien lo que es

public class Alumno {
	
	@Id @GeneratedValue
	private long id;
	private String nombre;
	private String apellidos;
	private LocalDate fechaGraduacion;
	
}
