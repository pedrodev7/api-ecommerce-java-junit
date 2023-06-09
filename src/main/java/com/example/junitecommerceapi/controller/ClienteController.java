package com.example.junitecommerceapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.junitecommerceapi.model.Cliente;
import com.example.junitecommerceapi.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/add")
    public ResponseEntity<?> criarCliente(@RequestBody Cliente cliente){
        try {
            clienteService.criarCliente(cliente);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    
}
