package com.mycompany.arquiteturadesoftware.P1.ex03;

public class BancoZ implements Strategy{
    @Override
    public double calcula(Valor valor) {
            return valor.calcularTotal() + 2.5;
    }
}
