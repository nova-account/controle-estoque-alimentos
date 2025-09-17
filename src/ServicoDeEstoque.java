import java.util.ArrayList;
import java.util.List;

public class EstoqueService {

    private List<Produto> produtos = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Fornecedor> fornecedores = new ArrayList<>();
    private List<Movimentacao> movimentacoes = new ArrayList<>();
    private int proximoIdMovimentacao = 1;

    // Método para adicionar um novo produto ao nosso "banco de dados" (a lista)
    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
        System.out.println("Produto '" + produto.getNome() + "' adicionado ao catálogo.");
    }

    // Método para listar todos os produtos cadastrados
    public void listarProdutos() {
        System.out.println("\n--- Lista de Produtos em Estoque ---");
        for (Produto p : produtos) {
            System.out.println("ID: " + p.getId() + " | Nome: " + p.getNome() + " | Qtd: " + p.getQuantidade() + " " + p.getUnidadeMedida());
        }
        System.out.println("------------------------------------");
    }
}
