package com.mycompany.arquiteturadesoftware.designerPatters.Factory.factory;

public class Argo implements Carro{

    private String modelo;
    private double preco;

    public Argo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public Argo() {
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
