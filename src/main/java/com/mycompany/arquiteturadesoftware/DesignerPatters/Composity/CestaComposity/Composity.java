package com.mycompany.arquiteturadesoftware.DesignerPatters.Composity.CestaComposity;

import java.util.ArrayList;
import java.util.List;

public class Composity implements Componente {
    private List<Componente> lista = new ArrayList<>();
    private String nome;

    public Composity() {
    }

    public Composity(String nome) {
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
