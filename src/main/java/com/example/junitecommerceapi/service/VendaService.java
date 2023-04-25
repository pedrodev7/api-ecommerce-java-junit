package com.example.junitecommerceapi.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.junitecommerceapi.model.Cliente;
import com.example.junitecommerceapi.model.ItemVenda;
import com.example.junitecommerceapi.model.Produto;
import com.example.junitecommerceapi.model.Venda;
import com.example.junitecommerceapi.repository.ClienteRepository;
import com.example.junitecommerceapi.repository.ItemVendaRepository;
import com.example.junitecommerceapi.repository.ProdutoRepository;
import com.example.junitecommerceapi.repository.VendaRepository;

@Service
public class VendaService {
    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ItemVendaRepository itemVendaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    public void criarVenda(Long idCliente, Venda venda){
        Optional<Cliente> cliente = clienteRepository.findById(idCliente);
        venda.setDataVenda(LocalDate.now());
        venda.setCliente(cliente.get());

        vendaRepository.save(venda);

    }

    public void criarItemVenda(Long idProduto, Long idVenda, ItemVenda itemVenda) {

        ItemVenda item = new ItemVenda();

        Optional<Produto> produto = produtoRepository.findById(idProduto);
        Optional<Venda> vendaOptional = vendaRepository.findById(idVenda);

        item.setProduto(produto.get());
        item.setVenda(vendaOptional.get());
        item.setQuantidade(itemVenda.getQuantidade());
        item.setPrecoUnitario(new BigDecimal(produto.get().getValor()));

        itemVendaRepository.save(item);
    }


}
