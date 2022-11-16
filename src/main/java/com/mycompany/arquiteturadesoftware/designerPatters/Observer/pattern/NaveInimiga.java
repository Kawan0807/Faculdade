package com.mycompany.arquiteturadesoftware.designerPatters.Observer.pattern;

public class NaveInimiga implements InterfaceNaveInimiga {
    private String nome;

    public NaveInimiga(String nome, InterfaceNaveJogador navj) {
        this.nome = nome;
        navj.adicionarObservador(this);
    }

    @Override
    public void update(Acoes acao) {
        System.out.println(nome + " - Acão: " + acao);
    }
}
