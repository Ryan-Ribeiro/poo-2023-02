package com.github.ryanribeiro.entidade;

public class Telefone {
    private String ddd;
    private String telefone;
    private String cpfPessoa;

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(getDdd() + getTelefone())
                .toString();
    }
}
