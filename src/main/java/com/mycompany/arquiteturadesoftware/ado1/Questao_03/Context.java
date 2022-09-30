package com.mycompany.arquiteturadesoftware.ado1.Questao_03;

public class Context {

    private Ordenar ordenar;

    public void executarOrdenacao(int[] listaOrdenada) {
        this.ordenar.ordenarLista(listaOrdenada);
    }

    public void setOrdenar(Ordenar ordenacao) {
        this.ordenar = ordenacao;
    }
}
