package com.springlearning.spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springlearning.spring.models.DTO.ParamDTO;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/param")
public class requestParamaController {

    @GetMapping("/detail")
    public ParamDTO detail(@RequestParam(required = false) String saludo, String nombre) {
        ParamDTO dto = new ParamDTO();

        dto.setInfo(saludo + " " + nombre);

        return dto;
    }
    
}
