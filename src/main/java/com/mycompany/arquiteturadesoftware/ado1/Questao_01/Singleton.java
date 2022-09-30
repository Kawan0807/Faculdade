package com.mycompany.arquiteturadesoftware.ado1.Questao_01;

public class Singleton {

    private String nome;
    private String Graduacao;
    private String Semestre;
    private int idade;

    private static Singleton singleton;

    public static Singleton getInstanciando(String nome, String Graduacao, String Semestre, int idade ) {
        if (singleton == null) {
            singleton = new Singleton(nome, Graduacao, Semestre, idade);
        }
        return singleton;
    }

    private Singleton(String nome, String Graduacao, String Semestre, int idade) {
        this.nome = nome;
        this.Graduacao = Graduacao;
        this.Semestre = Semestre;
        this.idade = idade;

    }

    @Override
    public String toString() {
        return "Olá meu nome é " + nome + ", estou cursando " + Graduacao + ",  no " + Semestre + ". Eu tenho " + idade + " anos!" ;
    }
}
