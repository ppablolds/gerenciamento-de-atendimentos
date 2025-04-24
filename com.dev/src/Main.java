import cli.AtendimentoCLI;
import repository.AtendimentoRepository;
import service.AtendimentoService;

public class Main {
    public static void main(String[] args) {
        AtendimentoRepository repo = new AtendimentoRepository();
        AtendimentoService service = new AtendimentoService(repo);
        AtendimentoCLI cli = new AtendimentoCLI(service);

        cli.iniciar();
    }
}
