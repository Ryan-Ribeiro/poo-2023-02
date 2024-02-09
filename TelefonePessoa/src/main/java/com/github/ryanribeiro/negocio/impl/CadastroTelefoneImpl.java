package com.github.ryanribeiro.negocio.impl;

import com.github.ryanribeiro.entidade.Telefone;
import com.github.ryanribeiro.negocio.CadastroTelefone;

public class CadastroTelefoneImpl implements CadastroTelefone {

    @Override
    public Telefone cadastrar(Telefone telefone) throws Exception {

        if(telefone == null) {
            throw new Exception("O telefone está nulo");
        }

        if(telefone.getDdd() == null || telefone.getDdd().isEmpty()){
            throw new Exception("O DDD não está preenchido");
        }

        if(telefone.getTelefone() == null || telefone.getTelefone().isEmpty()){
            throw new Exception("O telefone não está preenchido");
        }

        if (telefone.getCpfPessoa() == null || telefone.getTelefone().isEmpty()) {
            throw new Exception("Preencha um cpf válido");
        }

        Telefone t = new Telefone();
        t.setDdd(telefone.getDdd());
        t.setTelefone(telefone.getTelefone());
        return t;
    }
}
