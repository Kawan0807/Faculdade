package com.mycompany.arquiteturadesoftware.P1.ex02;

public class Main {
    public static void main(String[] args) {

        Composite caixa = new Composite("Caixa de perifericos");
        Leaf periferico1 = new Leaf(130, "Mouse Redragon");
        Leaf periferico2 = new Leaf(359, "Teclado Gamer 100% Redragon");
        Leaf periferico3 = new Leaf(320, "Headset Gamer Redragon");

        caixa.adicionar(periferico1);
        caixa.adicionar(periferico2);
        caixa.adicionar(periferico3);

        Composite caixa2 = new Composite("Caixa de perifericos");
        Leaf produto1 = new Leaf(10, "Mouse Redragon");
        Leaf produto2 = new Leaf(20, "Teclado Gamer 100% Redragon");
        Leaf produto3 = new Leaf(30, "Headset Gamer Redragon");

        caixa2.adicionar(produto1);
        caixa2.adicionar(produto2);
        caixa2.adicionar(produto3);

        System.out.println("<<<<< Lista de Produtos >>>>>");
        System.out.println(periferico1.toString());
        System.out.println(periferico2.toString());
        System.out.println(periferico3.toString());
        System.out.println();
        System.out.println("Valor total da caixa de perifericos: " + caixa.getPreco());
        System.out.println();
        System.out.println(produto1.toString());
        System.out.println(produto2.toString());
        System.out.println(produto3.toString());
        System.out.println();
        System.out.println("Valor total da caixa de perifericos: " + caixa2.getPreco());

        Composite fardo = new Composite("Fardo");
        fardo.adicionar(caixa);
        fardo.adicionar(caixa2);
        System.out.println("Valor total do fardo: " + fardo.getPreco());
    }
}
