# Sistema de Controle de Estoque de Alimentos

Este projeto é um sistema de software desenvolvido em Java para gerenciar o estoque de produtos alimentícios. O foco principal é o controle de itens, movimentações de entrada e saída, e o rastreamento de informações essenciais como fornecedores e datas de validade, sendo ideal para serviços de alimentação.

---
## Funcionalidades

* **Cadastro de Produtos:** Permite registrar novos itens no estoque com informações como categoria, unidade de medida e estoque mínimo.
* **Gestão de Fornecedores e Funcionários:** Armazena dados de contato e informações relevantes sobre quem fornece os produtos e quem opera o sistema.
* **Registro de Movimentações:** Garante o rastreamento completo de cada evento de **entrada** ou **saída** de produtos, associando a movimentação a um funcionário e a uma data.
* **Consulta de Estoque:** Oferece uma visão clara da quantidade atual de cada produto.

---
## Estrutura do Projeto

O sistema é organizado em torno das seguintes classes principais:

* **`Produto`**: Representa um item do catálogo com suas especificações (nome, categoria, validade, etc.).
* **`Fornecedor`**: Armazena as informações de contato das empresas ou pessoas que fornecem os produtos.
* **`Funcionario`**: Representa um usuário do sistema, responsável por registrar as movimentações.
* **`Movimentacao`**: Registra cada evento de entrada ou saída no estoque, garantindo um histórico completo para auditorias.
* **`ServicoDeEstoque`**: Contém a lógica de negócio do sistema. É a classe responsável por orquestrar as operações de cadastro e controle.
* **`Programa`**: Classe principal (`main`) utilizada para executar e testar as funcionalidades do sistema.

---
## Como Executar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/nova-account/controle-estoque-alimentos.git](https://github.com/nova-account/controle-estoque-alimentos.git)
    ```
2.  **Abra no IntelliJ IDEA:** Abra o IntelliJ, selecione "Open" e aponte para a pasta do projeto que foi clonada.
3.  **Execute:** Encontre o arquivo `Programa.java`, clique com o botão direito e selecione "Run 'Programa.main()'".

---
## Tecnologias Utilizadas

* **Linguagem:** Java
* **IDE:** IntelliJ IDEA
* **Controle de Versão:** Git & GitHub

---
## Equipe

* Ana
* Luiz
* Edilson
