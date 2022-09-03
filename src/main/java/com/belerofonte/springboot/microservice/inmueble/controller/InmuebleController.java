package com.belerofonte.springboot.microservice.inmueble.controller;

import com.belerofonte.springboot.microservice.inmueble.model.Inmueble;
import com.belerofonte.springboot.microservice.inmueble.service.InmuebleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/inmueble")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class InmuebleController {
    private final InmuebleService inmuebleService;

    @PostMapping
    public ResponseEntity<?> saveInmueble(@RequestBody Inmueble inmueble) {
        return new ResponseEntity<>(inmuebleService.saveInmueble(inmueble), HttpStatus.CREATED);
    }

    @DeleteMapping("{inmuebleId}")
    public ResponseEntity<?> deleteInmueble(@PathVariable Long inmuebleId) {
        inmuebleService.deleteInmueble(inmuebleId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllInmuebles() {
        return ResponseEntity.ok(inmuebleService.findAllInmuebles());
    }
}
