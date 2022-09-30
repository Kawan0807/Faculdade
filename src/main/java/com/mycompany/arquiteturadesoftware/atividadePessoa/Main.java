/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arquiteturadesoftware.atividadePessoa;

/**
 *
 * @author kawan.mfernandes
 */
public class Main {
    public static void main(String[] args) {
        
       PessoaJuridica pj = new PessoaJuridica( 1220222200l, "Kawan");
        System.out.println(pj);
        
       PessoaFisica pf =  new PessoaFisica( 39283398858l, "Felipe");
        System.out.println(pf);
       
        Funcionario f = new Funcionario( 4, 809808099l, "Ricardo");
        System.out.println(f);
    }
    
}
