package com.mycompany.arquiteturadesoftware.designerPatters.Factory.factory;

//Concrete Product
public class Gol implements Carro{

    private String modelo;
    private double preco;

    public Gol(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public Gol() {
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
