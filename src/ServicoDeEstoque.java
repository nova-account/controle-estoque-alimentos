import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServicoDeEstoque {
    private List<Produto> produtos = new ArrayList<>();
    private List<Movimentacao> historicoMovimentacoes = new ArrayList<>();

    public String adicionarProduto(Produto produto) {
        this.produtos.add(produto);
        return "INFO: Produto '" + produto.getNome() + "' adicionado ao estoque.";
    }

    public String registrarEntrada(int produtoId, int quantidade, Funcionario funcionario) {
        Produto produto = encontrarProdutoPorId(produtoId);
        if (produto != null) {
            produto.atualizarQuantidadeDisponivel(quantidade);
            historicoMovimentacoes.add(new Movimentacao(produto, funcionario, TipoMovimentacao.ENTRADA, quantidade));

            String logMessage = "ENTRADA: " + quantidade + " unidades de '" + produto.getNome() + "' registradas por " + funcionario.getNome() + ".";
            if (produto.isEstoqueAlto()) {
                logMessage += "\nALERTA: Estoque de '" + produto.getNome() + "' está alto!";
            }
            return logMessage;
        }
        return "ERRO: Produto com ID " + produtoId + " não encontrado.";
    }

    public String registrarSaida(int produtoId, int quantidade, Funcionario funcionario) {
        Produto produto = encontrarProdutoPorId(produtoId);
        if (produto != null) {
            if (produto.getQuantidadeDisponivel() >= quantidade) {
                produto.atualizarQuantidadeDisponivel(-quantidade);
                historicoMovimentacoes.add(new Movimentacao(produto, funcionario, TipoMovimentacao.SAIDA, quantidade));

                String logMessage = "SAÍDA: " + quantidade + " unidades de '" + produto.getNome() + "' registradas por " + funcionario.getNome() + ".";
                if (produto.isEstoqueBaixo()) {
                    logMessage += "\nALERTA: Estoque de '" + produto.getNome() + "' está baixo! Considere fazer um novo pedido.";
                }
                return logMessage;
            } else {
                return "ERRO: Quantidade insuficiente em estoque para '" + produto.getNome() + "'.";
            }
        }
        return "ERRO: Produto com ID " + produtoId + " não encontrado.";
    }

    public List<Produto> getProdutos() {
        return new ArrayList<>(produtos); // Retorna uma cópia para proteger a lista original
    }

    public List<Produto> listarProdutosComEstoqueBaixo() {
        return produtos.stream()
                .filter(Produto::isEstoqueBaixo)
                .collect(Collectors.toList());
    }

    public List<Produto> listarProdutosProximosDaValidade(int dias) {
        LocalDate dataLimite = LocalDate.now().plusDays(dias);
        return produtos.stream()
                .filter(p -> p.getDataValidade().isBefore(dataLimite))
                .collect(Collectors.toList());
    }

    private Produto encontrarProdutoPorId(int id) {
        return produtos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
