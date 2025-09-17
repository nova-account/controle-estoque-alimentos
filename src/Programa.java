import java.time.LocalDate;

public class Programa {

    public static void main(String[] args) {
        // 1. Iniciar o serviço de estoque
        ServicoDeEstoque servico = new ServicoDeEstoque();

        // 2. Criar alguns produtos para teste com o construtor atualizado
        Produto arroz = new Produto(1, "Arroz Parboilizado", "Grãos", 1, "kg", 50, LocalDate.of(2026, 9, 17), 10);
        Produto feijao = new Produto(2, "Feijão Carioca", "Grãos", 1, "kg", 40, LocalDate.of(2026, 10, 5), 10);
        Produto oleo = new Produto(3, "Óleo de Soja 900ml", "Óleos", 900, "ml", 100, LocalDate.of(2025, 12, 20), 20);

        // 3. Adicionar os produtos ao estoque usando o serviço
        servico.adicionarProduto(arroz);
        servico.adicionarProduto(feijao);
        servico.adicionarProduto(oleo);

        // 4. Listar os produtos que estão no estoque
        servico.listarProdutos();

        // 5. Verificar produtos perto do vencimento
        servico.listarProdutosProximosDaValidade(100);
    }
}
