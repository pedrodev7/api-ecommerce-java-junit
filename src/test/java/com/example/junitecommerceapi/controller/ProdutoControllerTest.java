package com.example.junitecommerceapi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.Optional;

import com.example.junitecommerceapi.model.Produto;
import com.example.junitecommerceapi.repository.ProdutoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class ProdutoControllerTest {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void criarProduto() throws Exception {
        Produto produto = new Produto();
        produto.setNome("Caneta Amarela");
        produto.setValor(1.0d);

        String path = "/produto/add";

        mockMvc.perform(MockMvcRequestBuilders.post(path)
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(produto))
            ).andDo(print()).
            andExpect(status().isCreated());
        
        Optional<Produto> produOptional = produtoRepository.findById(3l);

        assertNotNull(produOptional);
        assertEquals("Caneta Amarela", produOptional.get().getNome());

    }

    @Test
    public void obterProduto() throws Exception {
        String id = "1";
        String path = "/produto/" + id + "/get";

        Optional<Produto> produtoSalvo = produtoRepository.findById(1l);

        mockMvc.perform(MockMvcRequestBuilders.get(path)
                .contentType(MediaType.APPLICATION_JSON)
                .param("id", id))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome").value(produtoSalvo.get().getNome()))
                .andExpect(jsonPath("$.valor").value(produtoSalvo.get().getValor()));
        

        assertNotNull(produtoSalvo);
        assertEquals("Caneta Azul", produtoSalvo.get().getNome());
        assertEquals(3.0d, produtoSalvo.get().getValor());
    }
}
