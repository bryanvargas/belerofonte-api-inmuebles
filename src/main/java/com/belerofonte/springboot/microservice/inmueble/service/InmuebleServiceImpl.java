package com.belerofonte.springboot.microservice.inmueble.service;

import com.belerofonte.springboot.microservice.inmueble.model.Inmueble;
import com.belerofonte.springboot.microservice.inmueble.repository.InmuebleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class InmuebleServiceImpl implements InmuebleService{
    private final InmuebleRepository inmuebleRepository;
    @Override
    public Inmueble saveInmueble(Inmueble inmueble) {
        inmueble.setFechaCreacion(LocalDateTime.now());
        return inmuebleRepository.save(inmueble);
    }
    @Override
    public void deleteInmueble(Long inmuebleId) {
        inmuebleRepository.deleteById(inmuebleId);
    }

    @Override
    public List<Inmueble> findAllInmuebles() {
        return inmuebleRepository.findAll();
    }
}

