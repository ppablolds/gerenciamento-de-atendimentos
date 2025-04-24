package repository;

import model.Atendimento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AtendimentoRepository {
    private final List<Atendimento> atendimentos = new ArrayList<>();

    public void salvar(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public List<Atendimento> listarTodos() {
        return new ArrayList<>(atendimentos);
    }

    public Optional<Atendimento> buscarPorId(int id) {
        return atendimentos.stream()
                .filter(a -> a.getId() == id)
                .findFirst();
    }

    public List<Atendimento> buscarPorNomeCliente(String nome) {
        return atendimentos.stream()
                .filter(a -> a.getNomeCliente().equalsIgnoreCase(nome))
                .collect(Collectors.toList());
    }

    public List<Atendimento> buscarPorStatus(String status) {
        return atendimentos.stream()
                .filter(a -> a.getStatus().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }

    public boolean remover(int id) {
        return atendimentos.removeIf(a -> a.getId() == id);
    }

    public boolean atualizar(Atendimento atualizado) {
        Optional<Atendimento> existente = buscarPorId(atualizado.getId());
        if (existente.isPresent()) {
            Atendimento a = existente.get();
            a.setNomeCliente(atualizado.getNomeCliente());
            a.setTipoAtendimento(atualizado.getTipoAtendimento());
            a.setDescricao(atualizado.getDescricao());
            a.setStatus(atualizado.getStatus());
            return true;
        }
        return false;
    }
}
