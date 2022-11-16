package com.mycompany.arquiteturadesoftware.designerPatters.Observer.pattern;

import java.util.ArrayList;
import java.util.List;

/*
     ConcreteSubject - Objeto observével
*/

public class NaveJogador implements InterfaceNaveJogador {
    private String nome;
    private List<InterfaceNaveInimiga> listaNavaInimiga;
    private List<Acoes> listaAcoes;
    private static int indice=-1;

    public NaveJogador(String nome) {
        this.nome = nome;
        listaNavaInimiga = new ArrayList<>();
        listaAcoes = new ArrayList<>();
    }

    @Override
    public void adicionarObservador(InterfaceNaveInimiga navi) {
        listaNavaInimiga.add(navi);
    }

    @Override
    public void adicionarAcoes(Acoes acao) {
        listaAcoes.add(acao);
        indice++;
        notificar();
    }

    @Override
    public void notificar() {
       for(InterfaceNaveInimiga navi:listaNavaInimiga){
           navi.update(listaAcoes.get(indice));
       }
    }
}
