package com.mycompany.arquiteturadesoftware.ado1.Questao_04;

import java.util.ArrayList;
import java.util.List;

public class Diretoria implements Componente {

    private List<Componente> lista = new ArrayList<>();
    private String nome;

    public String getNome() {
        return nome;
    }

    public Diretoria(String nome) {
        this.nome = nome;
    }

    public Diretoria() {
    }


    public void adicionar(Componente comp) {
        this.lista.add(comp);
    }

    public void remover(Componente comp) {
        this.lista.remove(comp);
    }

    @Override
    public double getCustos() {
        double total = 0;
        for (Componente d : lista) {
            total += d.getCustos();
        }
        return total;
    }

    @Override
    public int quantidadeFuncionarios() {
        int totalFuncionarios = 0;
        for (Componente d : lista) {
            totalFuncionarios += d.quantidadeFuncionarios();
        }
        return totalFuncionarios;
    }

    @Override
    public String toString() {
        return "Diretoria{" +
                "lista=" + lista +
                ", nome='" + nome + '\'' +
                '}';
    }
}
