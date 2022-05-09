package com.salesianostriana.dam.clasesproyecto.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Mesa {
	
	
	@Id
	@GeneratedValue
	private long id;
	private boolean ocupacion;
	private Ticket cuenta;
}
