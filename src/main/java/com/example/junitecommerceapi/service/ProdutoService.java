package com.example.junitecommerceapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.junitecommerceapi.model.Produto;
import com.example.junitecommerceapi.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;


    public Produto criarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public Optional<Produto> obterProdutoById(Long id){
        return produtoRepository.findById(id);
    }

    public void deletarProdutoById(Long id){
        produtoRepository.deleteById(id);
    }

    public void editarProduto(Produto produto){
        produtoRepository.save(produto);
    }
}
