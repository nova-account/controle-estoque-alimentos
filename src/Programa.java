import java.io.PrintStream;
import java.time.LocalDate;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        Funcionario gerente = new Funcionario(1, "Carlos Souza", "Gerente", "carlos", "123");
        Funcionario estoquista = new Funcionario(2, "Ana Pereira", "Estoquista", "ana", "456");
        Fornecedor forn1 = new Fornecedor(101, "Distribuidora Alimentos S.A.", "12.345.678/0001-99", "(81)99876-5432", "contato@distribuidora.com");
        Produto arroz = new Produto(101, "Arroz Carioca", "Grãos", 1, "kg", 50, LocalDate.of(2026, 12, 31), 20, 100, forn1);
        Produto leite = new Produto(102, "Leite Integral", "Laticínios", 1, "l", 30, LocalDate.of(2025, 10, 20), 15, 80, forn1);
        Produto sabonete = new Produto(103, "Sabonete", "Higiene", 90, "g", 100, LocalDate.of(2027, 8, 15), 30, 200, forn1);
        ServicoDeEstoque servico = new ServicoDeEstoque();
        System.out.println(servico.adicionarProduto(arroz));
        System.out.println(servico.adicionarProduto(leite));
        System.out.println(servico.adicionarProduto(sabonete));
        System.out.println("\n>>> Iniciando movimentações...\n");
        String resultadoEntrada = servico.registrarEntrada(102, 55, gerente);
        System.out.println(resultadoEntrada);
        String resultadoSaida1 = servico.registrarSaida(101, 35, estoquista);
        System.out.println(resultadoSaida1);
        String resultadoSaida2 = servico.registrarSaida(101, 20, estoquista);
        System.out.println(resultadoSaida2);
        System.out.println("\n>>> Movimentações finalizadas.\n");
        exibirStatusCompleto(servico.getProdutos());
        List<Produto> produtosParaComprar = servico.listarProdutosComEstoqueBaixo();
        System.out.println("--- RELATÓRIO DE REPOSIÇÃO ---");
        if (produtosParaComprar.isEmpty()) {
            System.out.println("Nenhum produto com estoque baixo no momento.");
        } else {
            for(Produto p : produtosParaComprar) {
                PrintStream var10000 = System.out;
                String var10001 = p.getNome();
                var10000.println("-> Comprar mais: " + var10001 + " (Apenas " + p.getQuantidadeDisponivel() + " unidades restantes)");
            }
        }

        System.out.println("----------------------------------\n");
        List<Produto> produtosProximosValidade = servico.listarProdutosProximosDaValidade(400);
        System.out.println("--- RELATÓRIO DE VALIDADE (Próximos 400 dias) ---");
        if (produtosProximosValidade.isEmpty()) {
            System.out.println("Nenhum produto está próximo da data de validade.");
        } else {
            for(Produto p : produtosProximosValidade) {
                PrintStream var17 = System.out;
                String var18 = p.getNome();
                var17.println("-> ATENÇÃO: " + var18 + " vence em " + String.valueOf(p.getDataValidade()));
            }
        }

        System.out.println("--------------------------------------------------");
    }

    public static void exibirStatusCompleto(List<Produto> produtos) {
        System.out.println("--- STATUS ATUAL DETALHADO DO ESTOQUE ---");
        System.out.printf("%-5s | %-15s | %-12s | %-5s | %-12s%n", "ID", "Produto", "Categoria", "Qtd", "Validade");
        System.out.println("---------------------------------------------------------");

        for(Produto p : produtos) {
            System.out.printf("%-5d | %-15s | %-12s | %-5d | %-12s%n", p.getId(), p.getNome(), p.getCategoria(), p.getQuantidadeDisponivel(), p.getDataValidade());
        }

        System.out.println("---------------------------------------------------------\n");
    }
}
