package com.mycompany.arquiteturadesoftware.designerPatters.Strategy.Exemplo;

import com.mycompany.arquiteturadesoftware.designerPatters.Strategy.Distancia;
import com.mycompany.arquiteturadesoftware.designerPatters.Strategy.Empresa;

public class XPTO implements Empresa {
    @Override
    public double operacao(Distancia distancia) {
        return distancia.getValor() * 0.3;
    }
}
