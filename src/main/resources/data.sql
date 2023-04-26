INSERT INTO CLIENTE (nome, saldo) VALUES 
('João', 1000),
('Maria', 2000),
('José', 3000);

insert into produto (nome, valor) values 
('Caneta Azul', 3.0),
('Caderno', 12.0),
('Borracha', 1.0),
('Caneta Preta', 3.0),
('Lapis', 2.0);

insert into venda (data_venda, cliente_id) values
(now(), '1'),
(now(), '2'),
(now(), '3');

insert into item_venda (preco_unitario, quantidade, id_produto, venda_id) values
(3.0, 1, 1, 1),
(12.0, 2, 2, 1),
(12.0, 3, 2, 2),
(1.0, 4, 3, 2),
(1.0, 5, 3, 3);

insert into carrinho (cliente_id) values
(1),
(2),
(3);

insert into item_carrinho (quantidade, carrinho_id, produto_id) values
(1, 1, 1),
(2, 1, 2),
(3, 2, 3),
(5, 2, 4),
(4, 3, 2);