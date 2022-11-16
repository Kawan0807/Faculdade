package com.mycompany.arquiteturadesoftware.P1.ex01;

public class Singleton {

    private String tabuleiro;

    public String getTabuleiro() {
        return tabuleiro;
    }

    private static Singleton singleton;

    public static Singleton getIntancia(String tabuleiro) {
        if (singleton == null) {
            singleton = new Singleton(tabuleiro);
        }
        return singleton;
    }
    private Singleton(String tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public String checkIntancia(){
        if(this.getTabuleiro() == ""){
            System.out.println("Não tem tabuleiro");
        }
        else{
            System.out.println("Tabuleiro " + this.tabuleiro + " pronto.");
        }
        return this.tabuleiro;
    }
}
