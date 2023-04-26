package com.example.junitecommerceapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.junitecommerceapi.model.Carrinho;
import com.example.junitecommerceapi.model.Cliente;
import com.example.junitecommerceapi.repository.CarrinhoRepository;
import com.example.junitecommerceapi.repository.ClienteRepository;

import jakarta.transaction.Transactional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @Transactional
    public void criarCliente(Cliente cliente){
        clienteRepository.save(cliente);

        Carrinho carrinho = new Carrinho();
        carrinho.setCliente(cliente);
        carrinhoRepository.save(carrinho);
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    public void removerClientePorId(Long id) {
        clienteRepository.deleteById(id);
    }

}
