package com.springlearning.spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/variable")
public class PathVariableController {
    @Value("${config.name}") //Extrae el valor (variable de entorno) de application.properties 
    private String name;

    @Value("${config.code}")
    private int code;
    
    @Value("${config.message}")
    private String message;

    @Value("${config.values}")
    private String[] values;

    @GetMapping("/info")
    public Map<String, Object> info(){
        Map<String, Object> datas = new HashMap<>();
        datas.put("name", name);
        datas.put("code", code);
        datas.put("message", message);

        return datas;
    }
}
