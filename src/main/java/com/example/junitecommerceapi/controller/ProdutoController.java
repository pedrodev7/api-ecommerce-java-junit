package com.example.junitecommerceapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.junitecommerceapi.model.Produto;
import com.example.junitecommerceapi.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    
    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/add")
    public ResponseEntity<?> criarProduto(@RequestBody Produto produto){
        try {
            produtoService.criarProduto(produto);
            return ResponseEntity.status(HttpStatus.CREATED).body(produto);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/{id}/get")
    public ResponseEntity<?> obterProdutoById(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(produtoService.obterProdutoById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    public ResponseEntity<?> deletarProdutoById(@PathVariable Long id){
        try {
            produtoService.deletarProdutoById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    public ResponseEntity<?> editarProduto(@RequestBody Produto produto){
        try {
            produtoService.editarProduto(produto);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
