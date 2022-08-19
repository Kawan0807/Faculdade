package com.mycompany.arquiteturadesoftware.ExSingleton;

public class UsaSingleton {
    public static void main(String[] args) {

        Singleton sin = Singleton.getInstance();
        System.out.println(sin);
        Singleton sin2 = Singleton.getInstance();
        System.out.println(sin2);

    }
}
