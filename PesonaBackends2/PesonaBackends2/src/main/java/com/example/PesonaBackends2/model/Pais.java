package com.example.PesonaBackends2.model;

import jakarta.persistence.*;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.PesonaBackends2.rest"})
@Entity
@Table(name = "pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;


    public Pais(String nombre) {
        super();
        this.nombre = nombre;
    }
    public Pais() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
