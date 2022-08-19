package com.mycompany.arquiteturadesoftware.multiTrade;

public class Impar extends Thread{
    @Override
    public void run() {

        for(int i = 0; i<=100; i+=2){
            System.out.println(i + " é impar!");
        }
        System.out.println("fim dos impares!");
    }
}
