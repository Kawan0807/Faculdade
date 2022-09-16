package com.mycompany.arquiteturadesoftware.DesignerPatters.Factory.cliente;

import com.mycompany.arquiteturadesoftware.DesignerPatters.Factory.factory.Carro;
import com.mycompany.arquiteturadesoftware.DesignerPatters.Factory.factory.FabricaFiat;
import com.mycompany.arquiteturadesoftware.DesignerPatters.Factory.factory.FabricaVW;
import com.mycompany.arquiteturadesoftware.DesignerPatters.Factory.factory.ListaCarros;

public class UsaFactory {
    public static void main(String[] args) {
        try {
            System.out.println(" << Carros da Fabrica Fiat >>>");
            for (int i = 3; i<5; i++){
                Carro carroFiat = new FabricaFiat().factoryMethod(ListaCarros.values()[i]);
                System.out.println("Modelo:" + carroFiat.getModelo());
                System.out.println("Preço:" + carroFiat.getPreco());
                System.out.println("");
            }
            System.out.println("");
            System.out.println("");

            System.out.println(" << Carros da Fabrica VW >>>");
            for (int i = 0; i<3; i++){
                Carro carroVW = new FabricaVW().factoryMethod(ListaCarros.values()[i]);
                System.out.println("Modelo:" + carroVW.getModelo());
                System.out.println("Preço:" + carroVW.getPreco());
                System.out.println("");
            }


        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Carro inválido!");
            System.out.println(e);
        }
    }
}
