import java.time.LocalDateTime;

public class Produto {
    // Atributos
    private String ID;
    private String nome;
    private String unidadeMedida;
    private int pesoGramas;
    private int quantidadeEstoque;
    private String categoria;
    private String lote;
    private String fornecedor;
    private LocalDateTime vencimento;
    private double preco;

    // Construtor padrão
    public Produto() {
    }

    // Construtor completo
    public Produto(String ID, String nome, String unidadeMedida, int pesoGramas, int quantidadeEstoque,
                   String categoria, String lote, String fornecedor, LocalDateTime vencimento, double preco) {
        this.ID = ID;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.pesoGramas = pesoGramas;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
        this.lote = lote;
        this.fornecedor = fornecedor;
        this.vencimento = vencimento;
        this.preco = preco;
    }

    // Getters e Setters
    public String getID() { return ID; }
    public void setID(String ID) { this.ID = ID; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getUnidadeMedida() { return unidadeMedida; }
    public void setUnidadeMedida(String unidadeMedida) { this.unidadeMedida = unidadeMedida; }

    public int getPesoGramas() { return pesoGramas; }
    public void setPesoGramas(int pesoGramas) { this.pesoGramas = pesoGramas; }

    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(int quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getLote() { return lote; }
    public void setLote(String lote) { this.lote = lote; }

    public String getFornecedor() { return fornecedor; }
    public void setFornecedor(String fornecedor) { this.fornecedor = fornecedor; }

    public LocalDateTime getVencimento() { return vencimento; }
    public void setVencimento(LocalDateTime vencimento) { this.vencimento = vencimento; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    // toString formatado em várias linhas
    @Override
    public String toString() {
        return "\n=== Produto ===" +
               "\nID: " + ID +
               "\nNome: " + nome +
               "\nUnidade de Medida: " + unidadeMedida +
               "\nPeso (g): " + pesoGramas +
               "\nQuantidade em Estoque: " + quantidadeEstoque +
               "\nCategoria: " + categoria +
               "\nLote: " + lote +
               "\nFornecedor: " + fornecedor +
               "\nVencimento: " + vencimento +
               "\nPreço: R$ " + preco +
               "\n================\n";
    }
}