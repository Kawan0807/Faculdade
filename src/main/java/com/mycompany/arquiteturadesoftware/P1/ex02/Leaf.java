package com.mycompany.arquiteturadesoftware.P1.ex02;

public class Leaf implements Component {
    private double preco;
    private String nome;

    public Leaf() {
    }

    public Leaf(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return "Preço: " + preco + "\nNome: " + nome;
    }
}
