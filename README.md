# Sistema de Controle de Estoque de Alimentos

Este projeto é um sistema de software desenvolvido em Java para gerenciar o estoque de produtos alimentícios, com foco no controle de lotes e datas de validade.

---
## Funcionalidades Principais

* **Cadastro de Produtos e Fornecedores:** Gerencia o catálogo de produtos e de onde eles vêm.
* **Controle de Lotes por Validade:** Cada entrada de um produto é tratada como um lote único, com sua própria quantidade e data de validade.
* **Rastreabilidade:** Mantém um histórico detalhado de todas as movimentações de estoque (entradas, saídas e perdas).
* **Consultas Inteligentes:** Permite a consulta de estoque disponível e a identificação de produtos próximos ao vencimento.

---
## Estrutura do Projeto

O sistema é organizado em torno das seguintes classes principais:

* **`Produto`**: Representa um item genérico do catálogo (ex: "Farinha de Trigo Tipo 1").
* **`Fornecedor`**: Armazena as informações de quem fornece os produtos.
* **`Lote`**: Controla uma remessa específica de um produto, com sua quantidade e data de validade. É a unidade fundamental do nosso estoque.
* **`Movimentacao`**: Registra cada evento de entrada, saída ou perda no estoque, garantindo um histórico completo para auditorias.
* **`ServicoDeEstoque`**: Contém a lógica de negócio do sistema. É a classe responsável por orquestrar as operações, como adicionar novos lotes e registrar movimentações.
* **`Programa`**: Classe principal (`main`) utilizada para testar as funcionalidades do sistema.

---
## Como Executar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/nova-account/controle-estoque-alimentos.git](https://github.com/nova-account/controle-estoque-alimentos.git)
    ```
2.  **Abra no IntelliJ IDEA:** Abra o IntelliJ, selecione "Open" e aponte para a pasta do projeto que foi clonada.
3.  **Execute:** Encontre o arquivo `Programa.java`, clique com o botão direito e selecione "Run".

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
