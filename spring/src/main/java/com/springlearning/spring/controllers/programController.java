package com.springlearning.spring.controllers;

// import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;


@Controller
// @RequestMapping("/learning")
public class programController {

    @GetMapping("/info")
    public String info(Model vista) {
        vista.addAttribute("titulo", "first web"); // Forma de mandar datos al MODEL
        vista.addAttribute("ip", "124.43.56.1");
        vista.addAttribute("nombre", "Jeremy");
        return "info";
    }
}
