package com.example.junitecommerceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.junitecommerceapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
