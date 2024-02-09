package com.github.ryanribeiro.entidade;

import java.util.List;

public class Pessoa {
    private String nome;
    private String cpf;
    private List<Telefone> telefones;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Nome: ").append(this.getNome()).append("\n")
                .append("CPF: ").append(this.getCpf()).append("\n")
                .append("Telefones: ").append(this.getTelefones()).append("\n")
                .toString();
    }
}
