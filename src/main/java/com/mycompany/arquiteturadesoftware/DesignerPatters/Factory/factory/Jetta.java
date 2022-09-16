package com.mycompany.arquiteturadesoftware.DesignerPatters.Factory.factory;

//Concrete Product
public class Jetta implements Carro {
    private String modelo;
    private double preco;

    public Jetta() {
    }

    public Jetta(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
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
