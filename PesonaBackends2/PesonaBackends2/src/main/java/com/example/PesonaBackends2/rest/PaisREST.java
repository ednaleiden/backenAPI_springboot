package com.example.PesonaBackends2.rest;

import com.example.PesonaBackends2.model.Pais;
import com.example.PesonaBackends2.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pais/")
public class PaisREST {

    @Autowired
    private PaisService paisService;
    @GetMapping
    private ResponseEntity<List<Pais>> getAllPaises (){
        return ResponseEntity.ok(paisService.findAll());
    }
}
