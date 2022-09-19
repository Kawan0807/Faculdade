package com.mycompany.arquiteturadesoftware.ADO1.Questao_01;

public class UsaSingleton {

    public static void main(String[] args) {

        Singleton criar = Singleton.getInstanciando("Kawan Melo Fernandes", "Análise e desenvolvimento de sistemas",  " 4° Semestre", 22);
        System.out.println(criar);

        System.out.println(Singleton.getInstanciando("Nova instancia", "Nova instancia",  "Nova instancia", 0));
        Singleton.getInstanciando("", "","", 2 );

    }

}
