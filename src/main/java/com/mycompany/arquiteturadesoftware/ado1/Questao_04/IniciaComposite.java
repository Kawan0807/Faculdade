package com.mycompany.arquiteturadesoftware.ado1.Questao_04;

public class IniciaComposite {
    public static void main(String[] args) {

        Diretoria diretoriaPais = new Diretoria("França");
        Diretoria diretoriaLille = new Diretoria("Lille");
        Diretoria diretoriaLyon = new Diretoria("Lyon");
        Diretoria diretoriaParis = new Diretoria("Pariz");

        Departamento_TI departamento1 = new Departamento_TI(10, 20.000);
        Departamento_RH departamento2 = new Departamento_RH(26, 60.000);
        Departamento_Marketing departamento3 = new Departamento_Marketing(10, 140.000);

        Departamento_TI departamento4 = new Departamento_TI(22, 30.000);
        Departamento_RH departamento5 = new Departamento_RH(45, 200.000);
        Departamento_Marketing departamento6 = new Departamento_Marketing(90, 100.000);


        Departamento_TI departamento7 = new Departamento_TI(13, 20.000);
        Departamento_RH departamento8 = new Departamento_RH(26, 60.000);
        Departamento_Marketing departamento9 = new Departamento_Marketing(40, 140.800);


        diretoriaParis.adicionar(departamento1);
        diretoriaParis.adicionar(departamento2);
        diretoriaParis.adicionar(departamento3);

        diretoriaLyon.adicionar(departamento4);
        diretoriaLyon.adicionar(departamento5);
        diretoriaLyon.adicionar(departamento6);

        diretoriaLille.adicionar(departamento7);
        diretoriaLille.adicionar(departamento8);
        diretoriaLille.adicionar(departamento9);

        diretoriaPais.adicionar(diretoriaParis);
        diretoriaPais.adicionar(diretoriaLyon);
        diretoriaPais.adicionar(diretoriaLille);

        System.out.println(" <<< " + diretoriaPais.getNome() + " >>>");
        System.out.println("Custos da Diretoria Matriz: " + diretoriaPais.getCustos());
        System.out.println("Total de Funcionários: " + diretoriaPais.quantidadeFuncionarios());
        System.out.println("");
        System.out.println("Custos Diretoria de Paris: " + diretoriaParis.getCustos());
        System.out.println("Quantidade de funcionários Paris: " + diretoriaParis.quantidadeFuncionarios());
        System.out.println("");
        System.out.println("Custos Diretoria de Lille: " + diretoriaLille.getCustos());
        System.out.println("Quantidade de funcionários Lille: " + diretoriaLille.quantidadeFuncionarios());
        System.out.println("");
        System.out.println("Custos Diretoria Lyon: " + diretoriaLyon.getCustos());
        System.out.println("Quantidade de funcionários Lyon: " + diretoriaLyon.quantidadeFuncionarios());

    }
}
