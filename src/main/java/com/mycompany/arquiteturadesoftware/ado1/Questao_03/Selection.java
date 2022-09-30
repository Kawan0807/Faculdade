package com.mycompany.arquiteturadesoftware.ado1.Questao_03;

public class Selection implements Ordenar {

    @Override
    public void ordenarLista(int[] listaOrdenada) {
        int i, j, min, aux;
        for (i = 0; i < listaOrdenada.length - 1; i++) {
            min = i;
            for (j = i + 1; j < listaOrdenada.length; j++)
                if (listaOrdenada[j] < listaOrdenada[min])
                    min = j;
            aux = listaOrdenada[i];
            listaOrdenada[i] = listaOrdenada[min];
            listaOrdenada[min] = aux;
        }
    }
}
