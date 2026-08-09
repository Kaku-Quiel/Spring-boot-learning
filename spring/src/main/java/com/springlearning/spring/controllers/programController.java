package com.springlearning.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springlearning.spring.models.Empleado;
import com.springlearning.spring.models.DTO.DTO;

// import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class programController {

    @GetMapping("/info")
    public String info(Model vista) {
        Empleado empleado = new Empleado("Jeremy", "Salas", "Estudiante", "Costa Rica", 20, 20206060, 1, null);
        // Todos los atributos del empleado
        vista.addAttribute("empleado", empleado);
        return "info";
    }

    @GetMapping("/dto")
    public String transferDto(Model vista) {
        DTO dto = new DTO("U2", "Elias");
        vista.addAttribute("dto", dto);

        return "dto";
    }
    
}
