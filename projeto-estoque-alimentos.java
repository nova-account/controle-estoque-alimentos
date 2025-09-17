import java.time.LocalDate;

public class Produto {
    private int id;
    private String nome;
    private String categoria;
    private String unidadeMedida;
    private int quantidade;
    private LocalDate dataValidade;
    private int estoqueMinimo;

    public Produto(int id, String nome, String categoria, String unidadeMedida, 
                   int quantidade, LocalDate dataValidade, int estoqueMinimo) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.unidadeMedida = unidadeMedida;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
        this.estoqueMinimo = estoqueMinimo;
    }

    public void atualizarQuantidade(int valor) {
        this.quantidade += valor;
    }

    public boolean isEstoqueBaixo() {
        return this.quantidade <= this.estoqueMinimo;
    }
//precisa getters e setters

public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private String login;
    private String senha;

    public Funcionario(int id, String nome, String cargo, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
    }

    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }
//precisa getters e setters

public class Fornecedor {
    private int id;
    private String nome;
    private String cnpj;
    private String telefone;
    private String email;

    public Fornecedor(int id, String nome, String cnpj, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
    }

//precisa getters e setters

public class Movimentacao {
    private int id;
    private Produto produto;
    private int quantidade;
    private String tipo; // "entrada" ou "saida"
    private Funcionario funcionario;
    private LocalDate data;

    public Movimentacao(int id, Produto produto, int quantidade, String tipo, 
                        Funcionario funcionario, LocalDate data) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.funcionario = funcionario;
        this.data = data;
    }

    public void aplicar() {
        if (tipo.equalsIgnoreCase("entrada")) {
            produto.atualizarQuantidade(quantidade);
        } else if (tipo.equalsIgnoreCase("saida")) {
            produto.atualizarQuantidade(-quantidade);
        }
    }