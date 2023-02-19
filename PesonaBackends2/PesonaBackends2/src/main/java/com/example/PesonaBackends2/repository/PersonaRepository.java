package com.example.PesonaBackends2.repository;

import com.example.PesonaBackends2.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
