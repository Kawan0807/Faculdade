package com.mycompany.arquiteturadesoftware.P1.ex02;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> lista = new ArrayList<>();
    private String nome;

    public Composite() {
    }

    public Composite(String nome) {
        this.nome = nome;
    }

    public void adicionar(Component c) {
        this.lista.add(c);
    }

    public void remover(Component c) {
        this.lista.remove(c);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (Component v : lista) {
            total += v.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Composite{" + "lista=" + lista + ", nome=" + nome + '}';
    }
}

