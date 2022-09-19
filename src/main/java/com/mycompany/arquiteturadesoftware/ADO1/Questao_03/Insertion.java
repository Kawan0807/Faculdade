package com.mycompany.arquiteturadesoftware.ADO1.Questao_03;

public class Insertion implements Ordenar {

    @Override
    public void ordenarLista(int[] listaOrdenada) {
        int i, j;
        int temp;
        for (i = 1; i < listaOrdenada.length; i++) {
            temp = listaOrdenada[i];
            j = i;
            while (j > 0 && listaOrdenada[j - 1] >= temp) {
                listaOrdenada[j] = listaOrdenada[j - 1];
                j--;
            }
            listaOrdenada[j] = temp;
        }
    }
}
