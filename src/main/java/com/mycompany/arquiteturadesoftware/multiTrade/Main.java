package com.mycompany.arquiteturadesoftware.multiTrade;

public class Main extends Thread{

    public static void main(String[] args) {
        Impar t1 = new Impar();
        Par t2 = new Par();

        t1.start();
        t2.start();
    }

}
