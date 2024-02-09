package com.github.ryanribeiro;

import com.github.ryanribeiro.entidade.Pessoa;
import com.github.ryanribeiro.entidade.Telefone;
import com.github.ryanribeiro.negocio.impl.CadastroPessoaImpl;


import java.util.ArrayList;
import java.util.List;

public class TestaPessoaTelefone {

    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();
        p1.setNome("Ryan");
        p1.setCpf("9123891");

        Telefone t1 = new Telefone();
        t1.setDdd("62");
        t1.setTelefone("96532161");

        Telefone t2 = new Telefone();
        t2.setDdd("62");
        t2.setTelefone("9243325");

        Telefone t3 = new Telefone();
        t3.setDdd("62");
        t3.setTelefone("965321123");

        Telefone t4 = new Telefone();
        t4.setDdd("62");
        t4.setTelefone("965321123342");

        Telefone t5 = new Telefone();
        t5.setDdd("62");
        t5.setTelefone("9653216453");


        List<Telefone> telefones = new ArrayList<>();
        telefones.add(t1);
        telefones.add(t2);
        telefones.add(t3);
        telefones.add(t4);
        telefones.add(t5);

        p1.setTelefones(telefones);

        CadastroPessoaImpl cadastroPessoa = new CadastroPessoaImpl();
        cadastroPessoa.cadastrar(p1);

        System.out.println(p1);

    }
}