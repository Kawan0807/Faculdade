package com.mycompany.arquiteturadesoftware.DesignerPatters.Strategy;

public enum ListaEmpresas implements Empresa{
    ABC{
        @Override
        public double operacao(Distancia distancia) {
            return distancia.getValor() * 0.1;
        }
    },
    CBA{
        @Override
        public double operacao(Distancia distancia) {
            return distancia.getValor() * 0.2;
        }
    },
    XPTO{
        @Override
        public double operacao(Distancia distancia) {
            return distancia.getValor() * 0.3;
        }
    };

}
