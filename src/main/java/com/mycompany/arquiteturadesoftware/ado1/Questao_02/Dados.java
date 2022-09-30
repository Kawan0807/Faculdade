package com.mycompany.arquiteturadesoftware.ado1.Questao_02;

public class Dados {
    private double valorOrcamento;
    private String produto;

    public Dados() {
    }

    public Dados(double valorOrcamento, String produto) {
        this.valorOrcamento = valorOrcamento;
        this.produto = produto;
    }

    public double getValorOrcamento() {
        return valorOrcamento;
    }

    public String getProduto() {
        return produto;
    }
}
