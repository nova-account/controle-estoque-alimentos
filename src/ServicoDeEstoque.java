import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServicoDeEstoque {

    private final List<Produto> produtos = new ArrayList<>();
    private final List<Funcionario> funcionarios = new ArrayList<>();
    private final List<Fornecedor> fornecedores = new ArrayList<>();
    private final List<Movimentacao> movimentacoes = new ArrayList<>();
    private int proximoIdMovimentacao = 1;

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
        System.out.println("Produto '" + produto.getNome() + "' adicionado ao catálogo.");
    }

    public void listarProdutos() {
        System.out.println("\n--- Lista de Produtos em Estoque ---");
        for (Produto p : produtos) {
            System.out.println("ID: " + p.getId() + " | Nome: " + p.getNome() + " | Volume: " + p.getVolumeProduto() + p.getUnidadeMedida() + " | Qtd Disponível: " + p.getQuantidadeDisponivel());
        }
        System.out.println("------------------------------------");
    }

    public void listarProdutosProximosDaValidade(int dias) {
        LocalDate dataLimite = LocalDate.now().plusDays(dias);
        System.out.println("\nAlerta: Produtos Próximos da Validade (Vencimento em até " + dias + " dias)");
        boolean encontrouProduto = false;

        for (Produto p : produtos) {
            if (!p.getDataValidade().isAfter(dataLimite)) {
                System.out.println("ID: " + p.getId() + " | Nome: " + p.getNome() + " | Validade: " + p.getDataValidade());
                encontrouProduto = true;
            }
        }

        if (!encontrouProduto) {
            System.out.println("Nenhum produto encontrado com vencimento no período especificado.");
        }
        System.out.println("------------------------------------");
    }
