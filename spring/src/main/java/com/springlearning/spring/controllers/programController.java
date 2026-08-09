package com.springlearning.spring.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
    

    @ModelAttribute("Empleados")
    public List<Empleado> empleados(){
        return Arrays.asList(
            new Empleado("Jeremy", "Salas", "Estudiante", "Costa Rica", 20, 20206060, 1, null),
            new Empleado("María", "González", "Ingeniera de Software", "México", 28, 98765432, 2, "Castaño"),
            new Empleado("Carlos", "Pérez", "Analista de Datos", "Colombia", 32, 87654321, 3, "Negro"),
            new Empleado("Ana", "Rodríguez", "Diseñadora UX", "Argentina", 26, 76543210, 4, "Rubio"),
            new Empleado("Luis", "Fernández", "Gerente de Proyectos", "España", 40, 65432109, 5, "Gris"),
            new Empleado("Sofía", "Martínez", "Desarrolladora Frontend", "Chile", 24, 54321098, 6, "Pelirrojo")
        );
    }
}
