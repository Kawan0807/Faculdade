package com.mycompany.arquiteturadesoftware.ado1.Q2Ex;

import com.mycompany.arquiteturadesoftware.ado1.Questao_02.Orcamento;

import java.util.ArrayList;
import java.util.List;

public class Context {
    public static void main(String[] args) {
        Orcamento2 orcamento = new Orcamento2();

        List<Produto> lista = new ArrayList<>();
        lista.add(new Produto(2, "X"));
        lista.add(new Produto(5, "Y"));
        lista.add(new Produto(3, "Z"));

        orcamento.setLista(lista);
        System.out.println("Total: " + orcamento.calcularTotal());
        double  valorTotal = orcamento.calcularTotal();
        double valorImposto = Impostos.values()[2].instance().calcular(orcamento);
        System.out.println("Valor imposto: " + valorImposto);
        System.out.println("Orçamento: " + (valorImposto+ valorTotal));
    }
}
