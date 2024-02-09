package com.github.ryanribeiro.negocio.impl;

import com.github.ryanribeiro.entidade.Pessoa;
import com.github.ryanribeiro.entidade.Telefone;
import com.github.ryanribeiro.negocio.CadastroPessoa;

import java.util.ArrayList;

public class CadastroPessoaImpl implements CadastroPessoa {

    @Override
    public Pessoa cadastrar(Pessoa pessoa) throws Exception {

        if(pessoa == null) {
            throw new Exception("A pessoa está nula");
        }

        if(pessoa.getCpf() == null || pessoa.getCpf().isEmpty()){
            throw new Exception("O cpf não está preenchido");
        }

        if(pessoa.getNome() == null || pessoa.getNome().isEmpty()){
            throw new Exception("O nome não está preenchido");
        }

        Pessoa p = new Pessoa();
        p.setCpf(pessoa.getCpf());
        p.setNome(pessoa.getNome());


        if(pessoa.getTelefones() != null) {
            CadastroTelefoneImpl telefoneImpl = new CadastroTelefoneImpl();
            p.setTelefones(new ArrayList<>());
            for(Telefone telefone : pessoa.getTelefones()){
                telefone.setCpfPessoa(pessoa.getCpf());
                p.getTelefones().add(telefoneImpl.cadastrar(telefone));

            }
        }
        return p;
    }
}
