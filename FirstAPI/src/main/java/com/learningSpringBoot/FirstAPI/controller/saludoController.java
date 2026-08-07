package com.learningSpringBoot.FirstAPI.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/learning")
public class saludoController {


    // GET al /learning/saludo
    @GetMapping("/saludo")
    public String saludo() {
        return "Hola Mundo!";
    }

    @GetMapping("/saludo/{nombre}/{edad}")
    public String getMethodName(@PathVariable String nombre, @PathVariable int edad ) {
        return "Hola " + nombre + ", Tienes " + edad + " años";
    }
}
