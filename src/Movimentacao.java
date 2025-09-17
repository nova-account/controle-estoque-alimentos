import java.time.LocalDate;

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

    // --- Getters e Setters ---
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public Funcionario getFuncionario() { return funcionario; }
    public void setFuncionario(Funcionario funcionario) { this.funcionario = funcionario; }
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
}
