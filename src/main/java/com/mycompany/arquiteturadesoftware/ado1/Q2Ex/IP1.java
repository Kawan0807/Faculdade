package com.mycompany.arquiteturadesoftware.ado1.Q2Ex;

import com.mycompany.arquiteturadesoftware.ado1.Questao_02.Calculadora;
import com.mycompany.arquiteturadesoftware.ado1.Questao_02.Dados;

public class IP1 implements Strategy {

    @Override
    public double calcular(Orcamento2 orcamento2) {
        return orcamento2.calcularTotal() * 0.10;
    }
}
