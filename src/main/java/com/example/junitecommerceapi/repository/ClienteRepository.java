package com.example.junitecommerceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.junitecommerceapi.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
