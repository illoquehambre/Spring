package com.salesianostriana.dam.clasesproyecto.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mesa {
	
	
	@Id
	@GeneratedValue
	private long id;
	private boolean ocupacion;
	
}
