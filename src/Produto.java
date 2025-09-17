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

    // --- Getters e Setters ---
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public String getUnidadeMedida() { return unidadeMedida; }
    public void setUnidadeMedida(String unidadeMedida) { this.unidadeMedida = unidadeMedida; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public LocalDate getDataValidade() { return dataValidade; }
    public void setDataValidade(LocalDate dataValidade) { this.dataValidade = dataValidade; }
    public int getEstoqueMinimo() { return estoqueMinimo; }
    public void setEstoqueMinimo(int estoqueMinimo) { this.estoqueMinimo = estoqueMinimo; }
}
