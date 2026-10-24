package com.example.geracao_testes_ia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping()
    public String getUsers() {
        return "lista de usuarios";
    }
    
}
