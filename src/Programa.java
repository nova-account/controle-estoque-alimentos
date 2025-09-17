import java.time.LocalDate;

public class Programa {

    public static void main(String[] args) {
        // 1. Iniciar o serviço de estoque
        EstoqueService servico = new EstoqueService();

        // 2. Criar alguns produtos para teste
        Produto arroz = new Produto(1, "Arroz Parboilizado", "Grãos", "kg", 50, LocalDate.of(2026, 9, 17), 10);
        Produto feijao = new Produto(2, "Feijão Carioca", "Grãos", "kg", 40, LocalDate.of(2026, 10, 5), 10);
        Produto oleo = new Produto(3, "Óleo de Soja", "Óleos", "un", 100, LocalDate.of(2025, 12, 20), 20);

        // 3. Adicionar os produtos ao estoque usando o serviço
        servico.adicionarProduto(arroz);
        servico.adicionarProduto(feijao);
        servico.adicionarProduto(oleo);

        // 4. Listar os produtos que estão no estoque
        servico.listarProdutos();
    }
}
