package com.springlearning.spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springlearning.spring.models.Carro;
import com.springlearning.spring.models.Empleado;
import com.springlearning.spring.models.DTO.DTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


// import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class programRestController {

    @GetMapping("/info")
    public Map<String, Object> info() {
        Map<String, Object> data = new HashMap<>();

        Empleado empleado = new Empleado("Jeremy", "Salas", "Estudiante", "Costa Rica", 20, 20206060, 1, "Castaño");

        data.put("empleado", empleado);
        return data;
    }

    @GetMapping("/dto")
    public DTO transferDto() {
        DTO dto = new DTO("U1", "Jeremy");
        return dto;
    }


    @PostMapping("/carro")
    public Map<String, Object> createCarro(@RequestBody Carro carro) {
        
        Map<String, Object> data = new HashMap<>();


        String antiguo = carro.getColor();
        String nuevo = "azul";

        carro.setColor(nuevo);

        data.put("antiguo", antiguo);
        data.put("nuevo", nuevo);
        data.put("carro", carro);

        return data;
    }
    
    
}