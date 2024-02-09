package com.github.ryanribeiro.negocio;

import com.github.ryanribeiro.entidade.Pessoa;

public interface CadastroPessoa {
    public Pessoa cadastrar(Pessoa pessoa) throws Exception;
}
