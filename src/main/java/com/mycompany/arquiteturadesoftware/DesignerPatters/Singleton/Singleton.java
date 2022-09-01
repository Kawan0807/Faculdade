package com.mycompany.arquiteturadesoftware.DesignerPatters.Singleton;

public class Singleton {
    //MultiTrade
    //singleton
    private static Singleton singleton = new Singleton();

    private Singleton() { }

    public  static Singleton getInstance(){
             return singleton;
    }

    /*Lazy Singleton
    private static Singleton singleton;

    private Singleton() { }

    public  static Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }

    @Override
    public String toString() {
        return "Singleton{}";
    }*/
}
