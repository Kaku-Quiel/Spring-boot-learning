package com.springlearning.spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class programRestController {

    @GetMapping("/info")
    public Map<String, Object> info() {
        Map<String, Object> data = new HashMap<>();

        data.put("titulo", "first web");
        data.put("ip", "124.43.56.1");
        data.put("nombre", "Jeremy");
        return data;
    }
}