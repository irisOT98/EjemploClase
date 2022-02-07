package com.example.ClaseSpring.EjemploClase.Controlador;

import java.util.ArrayList;

import com.example.ClaseSpring.EjemploClase.Dominio.Persona;
import com.example.ClaseSpring.EjemploClase.Service.PersonaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

    @Autowired
    private PersonaServiceImpl personaService;

    // http://localhost:8080
    @GetMapping("/")
    public String holamundo(Model model) {
        ArrayList<Persona> personas = (ArrayList<Persona>) personaService.listarPersonas();
        /* Persona persona = new Persona();
        persona.setName("Iris");
        persona.setLastname("Olvera");
        persona.setTel("58963214"); */
        model.addAttribute("personas", personas);
        return "Holamundo";
    }
    // persona.getName();
}
