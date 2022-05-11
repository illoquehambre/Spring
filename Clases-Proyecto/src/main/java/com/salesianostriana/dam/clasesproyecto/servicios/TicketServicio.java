package com.salesianostriana.dam.clasesproyecto.servicios;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.clasesproyecto.model.Ticket;
import com.salesianostriana.dam.clasesproyecto.repositories.TicketRepository;
import com.salesianostriana.dam.clasesproyecto.servicios.base.ServicioBaseImpl;

@Service
public class TicketServicio extends ServicioBaseImpl<Ticket, Long, TicketRepository>{

}
