package com.nicolas.projeto;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Aula1 {
    @GetMapping("/hello")
    public String helloString() {
        return "estou progamado nicolas";
    }
    
    
}
