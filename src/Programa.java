import java.time.LocalDate;
import java.util.List;

public class Programa {

    public static void main(String[] args) {
        // 1. Criar Funcionários e Fornecedor
        Funcionario gerente = new Funcionario(1, "Carlos Souza", "Gerente", "carlos", "123");
        Funcionario estoquista = new Funcionario(2, "Ana Pereira", "Estoquista", "ana", "456");
        Fornecedor forn1 = new Fornecedor(101, "Distribuidora Alimentos S.A.", "12.345.678/0001-99", "(81)99876-5432", "contato@distribuidora.com");

        // 2. Criar Produtos
        Produto arroz = new Produto(101, "Arroz Carioca", "Grãos", 1, "kg", 50,
                LocalDate.of(2026, 12, 31), 20, 100, forn1);
        Produto leite = new Produto(102, "Leite Integral", "Laticínios", 1, "l", 30,
                LocalDate.of(2025, 10, 20), 15, 80, forn1);
        Produto sabonete = new Produto(103, "Sabonete", "Higiene", 90, "g", 100,
                LocalDate.of(2027, 8, 15), 30, 200, forn1);

        // 3. Criar o Serviço de Estoque e adicionar os produtos
        ServicoDeEstoque servico = new ServicoDeEstoque();
        System.out.println(servico.adicionarProduto(arroz));
        System.out.println(servico.adicionarProduto(leite));
        System.out.println(servico.adicionarProduto(sabonete));

        // 4. Simular Movimentações
        System.out.println("\n>>> Iniciando movimentações...\n");

        // Gerente registra a entrada de mais leite
        String resultadoEntrada = servico.registrarEntrada(102, 55, gerente);
        System.out.println(resultadoEntrada); // Vai disparar o alerta de estoque alto

        // Estoquista registra a saída de arroz
        String resultadoSaida1 = servico.registrarSaida(101, 35, estoquista);
        System.out.println(resultadoSaida1); // Vai disparar o alerta de estoque baixo

        // Tentativa de saída de mais arroz do que o disponível
        String resultadoSaida2 = servico.registrarSaida(101, 20, estoquista);
        System.out.println(resultadoSaida2); // Vai dar erro de quantidade

        System.out.println("\n>>> Movimentações finalizadas.\n");

        // 5. Exibir status final completo
        exibirStatusCompleto(servico.getProdutos());

        // 6. Listar produtos que precisam ser comprados
        List<Produto> produtosParaComprar = servico.listarProdutosComEstoqueBaixo();
        System.out.println("--- RELATÓRIO DE REPOSIÇÃO ---");
        if (produtosParaComprar.isEmpty()) {
            System.out.println("Nenhum produto com estoque baixo no momento.");
        } else {
            for (Produto p : produtosParaComprar) {
                System.out.println("-> Comprar mais: " + p.getNome() + " (Apenas " + p.getQuantidadeDisponivel() + " unidades restantes)");
            }
        }
        System.out.println("----------------------------------\n");

        // 7. Listar produtos próximos da validade (ex: nos próximos 400 dias)
        List<Produto> produtosProximosValidade = servico.listarProdutosProximosDaValidade(400);
        System.out.println("--- RELATÓRIO DE VALIDADE (Próximos 400 dias) ---");
        if (produtosProximosValidade.isEmpty()) {
            System.out.println("Nenhum produto está próximo da data de validade.");
        } else {
            for (Produto p : produtosProximosValidade) {
                System.out.println("-> ATENÇÃO: " + p.getNome() + " vence em " + p.getDataValidade());
            }
        }
        System.out.println("--------------------------------------------------");
    }

    public static void exibirStatusCompleto(List<Produto> produtos) {
        System.out.println("--- STATUS ATUAL DETALHADO DO ESTOQUE ---");
        System.out.printf("%-5s | %-15s | %-12s | %-5s | %-12s%n", "ID", "Produto", "Categoria", "Qtd", "Validade");
        System.out.println("---------------------------------------------------------");
        for (Produto p : produtos) {
            System.out.printf("%-5d | %-15s | %-12s | %-5d | %-12s%n",
                    p.getId(),
                    p.getNome(),
                    p.getCategoria(),
                    p.getQuantidadeDisponivel(),
                    p.getDataValidade());
        }
        System.out.println("---------------------------------------------------------\n");
    }
}