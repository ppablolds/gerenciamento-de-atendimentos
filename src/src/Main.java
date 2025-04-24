import model.Atendimento;
import repository.AtendimentoRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AtendimentoRepository repositorio = new AtendimentoRepository();

        Atendimento a1 = new Atendimento("João Silva", "Suporte", "Erro ao acessar o sistema");
        Atendimento a2 = new Atendimento("Maria Oliveira", "Consulta", "Dúvidas sobre a conta");

        repositorio.salvar(a1);
        repositorio.salvar(a2);

        List<Atendimento> atendimentos = repositorio.listarTodos();
        System.out.println("Lista de atendimentos cadastrados:");
        atendimentos.forEach(System.out::println);
    }
}
