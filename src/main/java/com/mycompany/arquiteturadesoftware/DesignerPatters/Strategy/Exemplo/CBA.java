package com.mycompany.arquiteturadesoftware.DesignerPatters.Strategy.Exemplo;

import com.mycompany.arquiteturadesoftware.DesignerPatters.Strategy.Distancia;
import com.mycompany.arquiteturadesoftware.DesignerPatters.Strategy.Empresa;

public class CBA implements Empresa {
    @Override
    public double operacao(Distancia distancia) {
        return distancia.getValor() * 0.2;
    }
}
