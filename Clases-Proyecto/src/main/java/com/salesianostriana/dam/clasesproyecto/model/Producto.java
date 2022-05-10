package com.salesianostriana.dam.clasesproyecto.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
	
	
	@Id
	@GeneratedValue
	private long id;
	private String nombre;
	private double precio;
	private int cantidadDisponible;
	private String url;
	//Especificar el tipo de conexion de BD (mnayToOne, OneToMany...)
	@ManyToOne
	private Categoria categoria;
}
