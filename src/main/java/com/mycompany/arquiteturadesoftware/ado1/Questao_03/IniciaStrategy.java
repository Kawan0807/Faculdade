package com.mycompany.arquiteturadesoftware.ado1.Questao_03;

public class IniciaStrategy {
    public static void main(String[] args) {

        Context obj = new Context();
        int[] lista1 = {15, 30, 3, 9, 23, 18, 22, 7, 9, 10, 1};
        int[] lista2 = {35, 50, 7, 8, 253, 168, 62, 76, 59, 2, 1};
        int[] lista3 = {95, 380, 93, 89, 83, 88, 42, 17, 29, 16, 1};

        System.out.println("Método de ordenação Bubble");
        obj.setOrdenar(new Bubble());
        obj.executarOrdenacao(lista1);

        for (int n : lista1) {
            System.out.print("[ " + n + " ] ");
        }


        System.out.println("");
        System.out.println("");
        System.out.println("Método de ordenação Selection");
        obj.setOrdenar(new Selection());
        obj.executarOrdenacao(lista2);

        for (int n : lista2) {
            System.out.print("[ " + n + " ] ");
        }


        System.out.println("");
        System.out.println("");
        System.out.println("Método de ordenação Insertion");
        obj.setOrdenar(new Insertion());
        obj.executarOrdenacao(lista3);

        for (int n : lista3) {
            System.out.print("[ " + n + " ] ");
        }
    }
}
