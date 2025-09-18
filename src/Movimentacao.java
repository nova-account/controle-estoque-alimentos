import java.time.LocalDateTime;

public class Movimentacao {
    private Produto produto;
    private Funcionario funcionario;
    private TipoMovimentacao tipo;
    private int quantidade;
    private LocalDateTime dataHora;

    public Movimentacao(Produto produto, Funcionario funcionario, TipoMovimentacao tipo, int quantidade) {
        this.produto = produto;
        this.funcionario = funcionario;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.dataHora = LocalDateTime.now(); // Registra a data e hora exatas da movimentação
    }

    // Getters
    public Produto getProduto() { return produto; }
    public Funcionario getFuncionario() { return funcionario; }
    public TipoMovimentacao getTipo() { return tipo; }
    public int getQuantidade() { return quantidade; }
    public LocalDateTime getDataHora() { return dataHora; }
}
