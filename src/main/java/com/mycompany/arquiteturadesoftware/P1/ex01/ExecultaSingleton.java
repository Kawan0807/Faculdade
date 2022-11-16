package com.mycompany.arquiteturadesoftware.P1.ex01;

import com.mycompany.arquiteturadesoftware.P1.ex01.Singleton;

public class ExecultaSingleton {
    public static void main(String[] args) {

        Singleton tabulareiro =  Singleton.getIntancia("Dama");
        tabulareiro.checkIntancia();

        Singleton tabulareiro2 =  Singleton.getIntancia("Dama 2");
        tabulareiro2.checkIntancia();


    }
}
