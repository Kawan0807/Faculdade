package com.mycompany.arquiteturadesoftware.batalhaTanques.Atividade.Tanque;

import com.mycompany.arquiteturadesoftware.batalhaTanques.Atividade.Factory.*;


public class ComecarBatalharTanques {
    public static void main(String[] args) {
        try {
            System.out.println(" << Batalha de Tanque >>>");
            for (int i = 0; i<3; i++){

                PrototipoTanque tanque = new FabricaTanques().factoryMethod(ListaTanques.values()[i]);


                if(tanque.getCorTanque() == CoresTanques.YELLO && tanque.getcorCanhao() == CoresTanques.BLUE ){
                    System.out.println("");
                    System.out.println(" <<<<< Brasil >>>>>");
                    System.out.println("Cor do tanque:" + tanque.getCorTanque());
                    System.out.println("Cor do canhão:" + tanque.getcorCanhao());
                    System.out.println("X: " + tanque.getX());
                    System.out.println("Y: " + tanque.getX());

                    System.out.println("");
                    System.out.println("");
                }

                if(tanque.getCorTanque() == CoresTanques.BLUE && tanque.getcorCanhao() == CoresTanques.WHITE ){
                    System.out.println("");
                    System.out.println(" <<<<< FRANÇA >>>>>");
                    System.out.println("Cor do tanque:" + tanque.getCorTanque());
                    System.out.println("Cor do canhão:" + tanque.getcorCanhao());
                    System.out.println("X: " + tanque.getX());
                    System.out.println("Y: " + tanque.getX());

                    System.out.println("");
                    System.out.println("");
                }

                if(tanque.getCorTanque() == CoresTanques.RED && tanque.getcorCanhao() == CoresTanques.WHITE ){
                    System.out.println("");
                    System.out.println(" <<<<< Espanha >>>>>");
                    System.out.println("Cor do tanque:" + tanque.getCorTanque());
                    System.out.println("Cor do canhão:" + tanque.getcorCanhao());
                    System.out.println("X: " + tanque.getX());
                    System.out.println("Y: " + tanque.getX());

                    System.out.println("");
                    System.out.println("");
                }

            }


        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Tanque inválido!");
            System.out.println(e);
        }
    }

}
