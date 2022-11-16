package com.mycompany.arquiteturadesoftware.P1.ex03;

import com.mycompany.arquiteturadesoftware.P1.ex03.Taxas;
import com.mycompany.arquiteturadesoftware.P1.ex03.Valor;
import com.mycompany.arquiteturadesoftware.P1.ex03.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Contexto {
    public static void main(String[] args) {
        Valor valor = new Valor();

        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa(2, "Kawan"));
        lista.add(new Pessoa(9, "Ricardo"));

        valor.setLista(lista);
        System.out.println("Ted: " + valor.calcularTotal());

        double valorTaxa = Taxas.values()[1].instance().calcula(valor);
        System.out.println("Valor imposto: " + valorTaxa);

    }

}
