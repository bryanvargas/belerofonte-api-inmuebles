package com.belerofonte.springboot.microservice.inmueble.service;

import com.belerofonte.springboot.microservice.inmueble.model.Inmueble;

import java.util.List;

public interface InmuebleService {
    Inmueble saveInmueble(Inmueble inmueble);
    void deleteInmueble(Long inmuebleId);
    List<Inmueble> findAllInmuebles();
}
