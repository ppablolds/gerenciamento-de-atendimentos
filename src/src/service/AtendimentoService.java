package service;

import model.Atendimento;
import repository.AtendimentoRepository;

import java.util.List;
import java.util.Optional;

public class AtendimentoService {
    private final AtendimentoRepository repositorio;

    public AtendimentoService(AtendimentoRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void criarAtendimento(String nomeCliente, String tipoAtendimento,String descricao) {
        Atendimento atendimento = new Atendimento(nomeCliente, tipoAtendimento, descricao);
        repositorio.salvar(atendimento);
    }

    public List<Atendimento> listarAtendimentos() {
        return repositorio.listarTodos();
    }

    public Optional<Atendimento> buscarPorId(int id) {
        return repositorio.buscarPorId(id);
    }

    public List<Atendimento> buscarPorNomeCliente(String nome) {
        return repositorio.buscarPorNomeCliente(nome);
    }

    public List<Atendimento> buscarPorStatus(String status) {
        return repositorio.buscarPorStatus(status);
    }

    public boolean atualizar(int id, String nomeCliente, String tipoAtendimento,String descricao, String status) {
        if (!utils.ValidadorStatus.isValido(status)) {
            System.out.println("Status inválido!");
            return false;
        }

        Optional<Atendimento> existente = buscarPorId(id);
        if (existente.isPresent()) {
            Atendimento atendimento = existente.get();
            atendimento.setNomeCliente(nomeCliente);
            atendimento.setTipoAtendimento(tipoAtendimento);
            atendimento.setDescricao(descricao);
            atendimento.setStatus(status);
            return repositorio.atualizar(atendimento);
        }
        return false;
    }

    public boolean removerAtendimento(int id) {
        return repositorio.remover(id);
    }
}
