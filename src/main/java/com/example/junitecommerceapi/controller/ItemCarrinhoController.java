package com.example.junitecommerceapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.junitecommerceapi.model.ItemCarrinho;
import com.example.junitecommerceapi.service.ItemCarrinhoService;

@RestController
@RequestMapping("/itemCarrinho")
public class ItemCarrinhoController {

    @Autowired
    private ItemCarrinhoService itemCarrinhoService;

    @PostMapping("/{idCliente}/{idProduto}")
    public ResponseEntity<?> adicionarProdutoNoCarrinho(@PathVariable Long idCliente, @PathVariable Long idProduto,
            @RequestBody ItemCarrinho itemCarrinho) {
        try {
            itemCarrinhoService.adicionarProdutoNoCarrinho(idCliente, idProduto, itemCarrinho);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
