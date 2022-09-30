/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arquiteturadesoftware.atividadePessoa;

/**
 *
 * @author kawan.mfernandes
 */
public class PessoaFisica extends Pessoa {
    private Long cpf;

    public PessoaFisica(Long cpf, String nome) {
       // super(nome);
        this.cpf = cpf;
    }

     public PessoaFisica() {
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{"  + " nome = " + getNome() + " cpf = " + cpf + '}';
    }
    
    
    
}
