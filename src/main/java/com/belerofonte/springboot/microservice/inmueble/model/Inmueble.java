package com.belerofonte.springboot.microservice.inmueble.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "inmueble")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inmueble {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 150, nullable = false)
    private String nombre;

    @Column(name = "direccion", length = 500, nullable = false)
    private String direccion;


    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "foto", length = 1200)
    private String picture;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;

}