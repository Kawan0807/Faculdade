package com.mycompany.arquiteturadesoftware.ado1.Questao_02;

public enum Orcamento implements Calculadora {
    IP1{
        @Override
        public double operacao(Dados dados) {
            return dados.getValorOrcamento() * 0.10;
        }
    }, IP2{
        @Override
        public double operacao(Dados dados) {
            return dados.getValorOrcamento() * 0.15;
        }
    }, IP3 {
        @Override
        public double operacao(Dados dados) {
            return dados.getValorOrcamento() * 0.25;
        }
    };

}
