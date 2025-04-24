package model;

import java.time.LocalDateTime;

public class Atendimento {
    private static int contadorId = 1;

    private int id;
    private String nomeCliente;
    private String tipoAtendimento;
    private LocalDateTime dataHora;
    private String descricao;
    private String status;

    public Atendimento(String nomeCliente, String tipoAtendimento, String descricao) {
        this.id = contadorId++;
        this.nomeCliente = nomeCliente;
        this.tipoAtendimento = tipoAtendimento;
        this.dataHora = LocalDateTime.now();
        this.descricao = descricao;
        this.status = "Aberto";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Atendimento: " +
                "id=" + id +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", tipoAtendimento='" + tipoAtendimento + '\'' +
                ", dataHora=" + dataHora +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                '.';
    }
}
