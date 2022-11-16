package com.mycompany.arquiteturadesoftware.P1.ex03;

import com.mycompany.arquiteturadesoftware.ado1.Q2Ex.Produto;

import java.util.LinkedList;
import java.util.List;

public class Valor {


    private List<Pessoa> lista = new LinkedList<>();

    public List<Pessoa> getLista() {
        return lista;
    }

    public void setLista(List<Pessoa> lista) {
        this.lista = lista;
    }

    public double calcularTotal() {
        double total = 0;
        for (Pessoa p : lista) {
            total += p.getPreco();
        }
        return total;
    }

}
