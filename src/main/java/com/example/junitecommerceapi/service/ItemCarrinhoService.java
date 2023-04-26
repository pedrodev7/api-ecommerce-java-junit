package com.example.junitecommerceapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.junitecommerceapi.model.Carrinho;
import com.example.junitecommerceapi.model.Cliente;
import com.example.junitecommerceapi.model.ItemCarrinho;
import com.example.junitecommerceapi.model.Produto;
import com.example.junitecommerceapi.repository.CarrinhoRepository;
import com.example.junitecommerceapi.repository.ClienteRepository;
import com.example.junitecommerceapi.repository.ItemCarrinhoRepository;
import com.example.junitecommerceapi.repository.ProdutoRepository;

@Service
public class ItemCarrinhoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @Autowired
    private ItemCarrinhoRepository itemCarrinhoRepository;

    public void adicionarProdutoNoCarrinho(Long idCliente, Long idProduto, ItemCarrinho itemCarrinho) {
        Optional<Produto> produto = produtoRepository.findById(idProduto);
        Optional<Cliente> cliente = clienteRepository.findById(idCliente);
        Optional<Carrinho> carrinho = carrinhoRepository.findById(cliente.get().getId());

        itemCarrinho.setCarrinho(carrinho.get());
        itemCarrinho.setProduto(produto.get());

        itemCarrinhoRepository.save(itemCarrinho);
    }

}
