package com.mycompany.arquiteturadesoftware.designerPatters.Composity.CestaComposity;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Componente {
    private List<Componente> lista = new ArrayList<>();
    private String nome;

    public Composite() {
    }

    public Composite(String nome) {
        this.nome = nome;
    }

    public void adicionar(Componente comp){
        lista.add(comp);
    }

    public void remover(Componente comp){
        lista.remove(comp);
    }

    @Override
    public double getPreco() {
        double total=0;
        for (Componente c:lista){
            total+=c.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Composity{" + "lista=" + lista + ", nome='" + nome + '\'' + '}';
    }
}
