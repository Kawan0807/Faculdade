package com.mycompany.arquiteturadesoftware.DesignerPatters.Factory.factory;

public class FabricaFiat implements Creator{
    @Override
    public Carro factoryMethod(ListaCarros tipoCarro) {
        Carro carro = null;
        switch (tipoCarro){
            case ARGO -> carro = new Argo("Argo x ", 5000);
            case UNO -> carro = new Uno("UnoXyz", 23000);
        }
        return carro;
    }
}
