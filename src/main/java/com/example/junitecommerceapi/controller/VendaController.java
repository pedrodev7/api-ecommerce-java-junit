package com.example.junitecommerceapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.junitecommerceapi.model.ItemVenda;
import com.example.junitecommerceapi.model.Venda;
import com.example.junitecommerceapi.service.VendaService;

@RestController
@RequestMapping("/venda")
public class VendaController {
    
    @Autowired
    private VendaService vendaService;

    @PostMapping("/{idCliente}/add")
    public ResponseEntity<?> criarVenda(@PathVariable Long idCliente, @RequestBody Venda venda){
        try {
            vendaService.criarVenda(idCliente, venda);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/{idProduto}/{idVenda}/add")
    public ResponseEntity<?> criarItemVenda(@PathVariable Long idProduto, @PathVariable Long idVenda, @RequestBody ItemVenda itemVenda){
        try {
            vendaService.criarItemVenda(idProduto, idVenda, itemVenda);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
