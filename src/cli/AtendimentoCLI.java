package cli;

import model.Atendimento;
import service.AtendimentoService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AtendimentoCLI {
    private final AtendimentoService servico;
    private final Scanner scanner;

    public AtendimentoCLI(AtendimentoService servico) {
        this.servico = servico;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcao;

        do {
            System.out.println("\n===== MENU DE ATENDIMENTOS =====");
            System.out.println("1. Criar atendimento");
            System.out.println("2. Listar atendimentos");
            System.out.println("3. Buscar atendimento por ID");
            System.out.println("4. Buscar atendimentos por cliente");
            System.out.println("5. Atualizar atendimento");
            System.out.println("6. Remover atendimento");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> criar();
                case 2 -> listar();
                case 3 -> buscarPorId();
                case 4 -> buscarPorNome();
                case 5 -> atualizar();
                case 6 -> remover();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    private void criar() {
        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Tipo de atendimento: ");
        String tipo = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        servico.criarAtendimento(nome, tipo, descricao);
        System.out.println("Atendimento criado com sucesso!");
    }

    private void listar() {
        List<Atendimento> atendimentos = servico.listarAtendimentos();
        if (atendimentos.isEmpty()) {
            System.out.println("Nenhum atendimento encontrado.");
        } else {
            atendimentos.forEach(System.out::println);
        }
    }

    private void buscarPorId() {
        System.out.print("Digite o ID do atendimento: ");
        int id = Integer.parseInt(scanner.nextLine());
        Optional<Atendimento> atendimento = servico.buscarPorId(id);

        atendimento.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Atendimento não encontrado.")
        );
    }

    private void buscarPorNome() {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        List<Atendimento> resultados = servico.buscarPorNomeCliente(nome);

        if (resultados.isEmpty()) {
            System.out.println("Nenhum atendimento encontrado para esse cliente.");
        } else {
            resultados.forEach(System.out::println);
        }
    }

    private void atualizar() {
        System.out.print("ID do atendimento a atualizar: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Novo nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Novo tipo de atendimento: ");
        String tipo = scanner.nextLine();
        System.out.print("Nova descrição: ");
        String descricao = scanner.nextLine();
        String status;
        do {
            utils.ValidadorStatus.exibirOpcoes();
            System.out.print("Novo status: ");
            status = scanner.nextLine();
            if (!utils.ValidadorStatus.isValido(status)) {
                System.out.println("Status inválido. Tente novamente.");
            }
        } while (!utils.ValidadorStatus.isValido(status));


        boolean sucesso = servico.atualizar(id, nome, tipo, descricao, status);
        System.out.println(sucesso ? "Atendimento atualizado com sucesso!" : "Atendimento não encontrado.");
    }

    private void remover() {
        System.out.print("ID do atendimento a remover: ");
        int id = Integer.parseInt(scanner.nextLine());

        boolean sucesso = servico.removerAtendimento(id);
        System.out.println(sucesso ? "Atendimento removido com sucesso!" : "Atendimento não encontrado.");
    }
}
