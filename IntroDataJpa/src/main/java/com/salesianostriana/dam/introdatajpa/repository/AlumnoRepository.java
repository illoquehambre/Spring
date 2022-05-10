package com.salesianostriana.dam.introdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.introdatajpa.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{//Se importa la interfaz JpaRepository y se indica el objeto al que hacer referencia esta interfaz junto con el tipo de valor del id(long)

	
}
