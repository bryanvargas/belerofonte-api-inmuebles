package com.belerofonte.springboot.microservice.inmueble.repository;

import com.belerofonte.springboot.microservice.inmueble.model.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InmuebleRepository extends JpaRepository<Inmueble, Long > {
}
