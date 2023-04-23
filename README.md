# Desafio de Projeto - Testes & JUnit com e-commerce <img align="center" height="30" width="40" src="https://ada-site-frontend.s3.sa-east-1.amazonaws.com/home/header-logo.svg" />

### 💠 Principais Informações

A ideia deste projeto tem como proposta desenvolver uma API de e-commerce e realizar testes automatizados através da técnica de desenvolvimento Test Driven Development (TDD).

> _Este é um desafio de projeto desenvolvido durante o Curso da **ADA** no programa Polo Tech | Back-End durante a trilha Testes Automatizados._

### 💠 Entendendo o Desafio

Uma aplicação de e-commerce utiliza as classes ***Venda, ItemVenda, Produto, Carrinho e Cliente***. Para garantir o bom funcionamento da aplicação, você foi designado para criar testes de integração para as classes mencionadas.

A partir dessa informação, crie cenários de teste de integração para os seguintes casos:

🌀 Adicionar um produto ao carrinho de compras
• O cliente adiciona um produto ao carrinho de compras
• O sistema atualiza o valor total do carrinho de compras

🌀 Finalizar uma venda
• O cliente finaliza a compra
• O sistema verifica se o carrinho de compras está vazio
• O sistema verifica se o cliente tem saldo suficiente para efetuar a compra
• O sistema atualiza o estoque dos produtos comprados
• O sistema registra a venda no histórico do cliente
• O sistema atualiza o saldo do cliente

🌀 Testar a busca de vendas por cliente:
• Verificar se é possível buscar as vendas de um determinado cliente
• Validar se as informações das vendas retornadas estão corretas, como a data e o valor total
• Verificar se todas as vendas do cliente são retornadas

🌀 Testar a busca de itens de venda por produto:
• Verificar se é possível buscar os itens de venda de um determinado produto
• Validar se as informações dos itens de venda retornados estão corretas, como a quantidade e o preço unitário
• Verificar se todos os itens de venda do produto são retornados

Para cada cenário, crie casos de teste que cubram todos os casos possíveis. Verifique se as classes estão funcionando corretamente e se os resultados obtidos estão de acordo com o esperado. Crie as classes services, repositories e controllers necessárias para a aplicação. Utilize JUnit e Spring Test para realizar os testes.

### 💠 Linguagens e Ferramentas Utilizadas
<div style="display: inline_block"><br>
  <img align="center" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/vscode/vscode-original.svg" />
  <img align="center" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-original.svg" />
  <img align="center" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" />
  <img align="center" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" />
</div>