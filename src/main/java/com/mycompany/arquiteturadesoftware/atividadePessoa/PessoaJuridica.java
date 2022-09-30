/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arquiteturadesoftware.atividadePessoa;

/**
 *
 * @author kawan.mfernandes
 */
public class PessoaJuridica extends Pessoa{
    private Long cnpj;

    public PessoaJuridica(Long cnpj, String nome) {
        super(nome);
        this.cnpj = cnpj;
    }

  
    public PessoaJuridica() {
    }


    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{ " + " nome = " + super.getNome() + " cnpj = " + cnpj + '}';
    }
    
    
}
