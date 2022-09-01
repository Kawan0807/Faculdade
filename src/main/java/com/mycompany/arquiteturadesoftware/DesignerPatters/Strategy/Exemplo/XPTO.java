package com.mycompany.arquiteturadesoftware.DesignerPatters.Strategy.Exemplo;

import com.mycompany.arquiteturadesoftware.DesignerPatters.Strategy.Distancia;
import com.mycompany.arquiteturadesoftware.DesignerPatters.Strategy.Empresa;

public class XPTO implements Empresa {
    @Override
    public double operacao(Distancia distancia) {
        return distancia.getValor() * 0.3;
    }
}
