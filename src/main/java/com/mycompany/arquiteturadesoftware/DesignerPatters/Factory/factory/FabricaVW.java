package com.mycompany.arquiteturadesoftware.DesignerPatters.Factory.factory;

//Concrete Creator
public class FabricaVW implements Creator{

    @Override
    public Carro factoryMethod(ListaCarros tipoCarro) {
        Carro carro = null;
        if (tipoCarro.equals(ListaCarros.FOX)) {
            carro = new Fox("fox 1.6 ", 125000);
        } else if (tipoCarro.equals(ListaCarros.JETTA)) {
            carro = new Jetta("TSI", 23000);
        }
        else if(tipoCarro.equals(ListaCarros.GOL)){
            carro = new Gol("XPTO",12);
        }

        return carro;
    }
}
