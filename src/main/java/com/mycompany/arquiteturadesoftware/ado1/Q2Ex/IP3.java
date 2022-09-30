package com.mycompany.arquiteturadesoftware.ado1.Q2Ex;

import com.mycompany.arquiteturadesoftware.ado1.Questao_02.Calculadora;
import com.mycompany.arquiteturadesoftware.ado1.Questao_02.Dados;

public class IP3 implements Strategy {

    @Override
    public double calcular(Orcamento2 orcamento2) {
        return orcamento2.calcularTotal() * 0.25;
    }
}
