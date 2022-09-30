package com.mycompany.arquiteturadesoftware.ado1.Questao_03;

public class Bubble implements Ordenar {

    @Override
    public void ordenarLista(int[] listaOrdenada) {
        int temp;
        for (int j = 0; j < listaOrdenada.length - 1; j++) {
            for (int i = 0; i < listaOrdenada.length - 1 - j; i++) {
                if (listaOrdenada[i] > listaOrdenada[i + 1]) {
                    temp = listaOrdenada[i];
                    listaOrdenada[i] = listaOrdenada[i + 1];
                    listaOrdenada[i + 1] = temp;
                }
            }
        }
    }
}
