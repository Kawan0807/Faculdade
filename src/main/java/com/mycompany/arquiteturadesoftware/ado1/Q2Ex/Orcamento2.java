package com.mycompany.arquiteturadesoftware.ado1.Q2Ex;

import java.util.LinkedList;
import java.util.List;

public class Orcamento2 {
    private List<Produto> lista=new LinkedList<>();

    public List<Produto> getLista() {
        return lista;
    }

    public void setLista(List<Produto> lista) {
        this.lista = lista;
    }

    public double calcularTotal(){
        double total =0;
        for(Produto p:lista){
            total+=p.getPreco();
        }
        return total;
    }
}
