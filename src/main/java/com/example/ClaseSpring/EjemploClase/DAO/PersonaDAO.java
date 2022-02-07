package com.example.ClaseSpring.EjemploClase.DAO;

import com.example.ClaseSpring.EjemploClase.Dominio.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository<Persona,Long> {
    
}
