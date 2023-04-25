package com.example.junitecommerceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.junitecommerceapi.model.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long>{
    
}
