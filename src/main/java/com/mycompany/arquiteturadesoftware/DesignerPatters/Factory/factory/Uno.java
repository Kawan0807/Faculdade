package com.mycompany.arquiteturadesoftware.DesignerPatters.Factory.factory;

public class Uno implements Carro{
    private String modelo;
    private double preco;

    public Uno(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public Uno() {
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
