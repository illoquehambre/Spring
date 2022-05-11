package com.salesianostriana.dam.clasesproyecto.servicios;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.clasesproyecto.model.Producto;
import com.salesianostriana.dam.clasesproyecto.repositories.ProductoRepository;
import com.salesianostriana.dam.clasesproyecto.servicios.base.ServicioBaseImpl;

@Service
public class ProductoServicio extends ServicioBaseImpl<Producto, Long, ProductoRepository>{

}
