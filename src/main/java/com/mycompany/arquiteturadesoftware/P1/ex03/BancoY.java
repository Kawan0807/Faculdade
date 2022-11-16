package com.mycompany.arquiteturadesoftware.P1.ex03;

public class BancoY implements Strategy{
    public int IdTeds;

    @Override
    public double calcula(Valor valor) {
             return valor.calcularTotal() + 5;
    }
}
