package com.example.ClaseSpring.EjemploClase.Service;

import java.util.List;

import com.example.ClaseSpring.EjemploClase.Dominio.Persona;

public interface PersonaService {

    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);
}
