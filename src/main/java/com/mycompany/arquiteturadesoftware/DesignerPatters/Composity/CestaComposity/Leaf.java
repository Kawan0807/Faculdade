package com.mycompany.arquiteturadesoftware.DesignerPatters.Composity.CestaComposity;

public class Leaf implements Componente{
    private  String nome;
    private double preco;

    public Leaf() {
    }

    public Leaf(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
      return preco;
    }

    @Override
    public String toString() {
        return "Leaf{" + "nome='" + nome + '\'' + ", preco=" + preco +'}';
    }
}
