import java.time.LocalDate;

public class Produto {
    private int id;
    private String nome;
    private String categoria;
    private int volumeProduto;
    private String unidadeMedida;
    private int quantidadeDisponivel;
    private LocalDate dataValidade;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private Fornecedor fornecedor;

    public Produto(int id, String nome, String categoria, int volumeProduto, String unidadeMedida,
                   int quantidadeDisponivel, LocalDate dataValidade, int estoqueMinimo, int estoqueMaximo, Fornecedor fornecedor) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.volumeProduto = volumeProduto;
        this.unidadeMedida = unidadeMedida;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.dataValidade = dataValidade;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.fornecedor = fornecedor;
    }

    public void atualizarQuantidadeDisponivel(int valor) {
        this.quantidadeDisponivel += valor;
    }

    public boolean isEstoqueBaixo() {
        return this.quantidadeDisponivel <= this.estoqueMinimo;
    }

    public boolean isEstoqueAlto() {
        return this.quantidadeDisponivel >= this.estoqueMaximo;
    }

    // --- Getters e Setters ---
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public int getVolumeProduto() { return volumeProduto; }
    public void setVolumeProduto(int volumeProduto) { this.volumeProduto = volumeProduto; }
    public String getUnidadeMedida() { return unidadeMedida; }
    public void setUnidadeMedida(String unidadeMedida) { this.unidadeMedida = unidadeMedida; }
    public int getQuantidadeDisponivel() { return quantidadeDisponivel; }
    public void setQuantidadeDisponivel(int quantidadeDisponivel) { this.quantidadeDisponivel = quantidadeDisponivel; }
    public LocalDate getDataValidade() { return dataValidade; }
    public void setDataValidade(LocalDate dataValidade) { this.dataValidade = dataValidade; }
    public int getEstoqueMinimo() { return estoqueMinimo; }
    public void setEstoqueMinimo(int estoqueMinimo) { this.estoqueMinimo = estoqueMinimo; }
    public int getEstoqueMaximo() { return estoqueMaximo; }
    public void setEstoqueMaximo(int estoqueMaximo) { this.estoqueMaximo = estoqueMaximo; }
    public Fornecedor getFornecedor() { return fornecedor; }
    public void setFornecedor(Fornecedor fornecedor) { this.fornecedor = fornecedor; }
}