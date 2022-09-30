package com.mycompany.arquiteturadesoftware.ado1.Questao_02;

public class IniciaStrategy {
    public static void main(String[] args) {

        Dados casa = new Dados(100000, "casa");
        System.out.println("O imposto de 10% no produto do tipo " + casa.getProduto() + ", com o valor orçamentado em R$ " + casa.getValorOrcamento() + " é:");
        System.out.println("R$ " + Orcamento.values()[0].operacao(casa));

        System.out.println("");
        Dados carro = new Dados(50000, "carro");
        System.out.println("O imposto de 15% no produto do tipo " + carro.getProduto() + ", com o valor orçamentado em R$ " + carro.getValorOrcamento() + " é:");
        System.out.println("R$ " + Orcamento.values()[1].operacao(carro));

        System.out.println("");
        Dados moto = new Dados(15000, "moto");
        System.out.println("O imposto de 25% no produto do tipo " + moto.getProduto() + ", com o valor orçamentado em R$ " + moto.getValorOrcamento() + " é:");
        System.out.println("R$ " + Orcamento.values()[2].operacao(moto));
    }
}
