package com.example.junitecommerceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.junitecommerceapi.model.Carrinho;

public interface CarrinhoRepository extends JpaRepository <Carrinho, Long>{
    
}
