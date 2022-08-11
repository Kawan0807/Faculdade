/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arquiteturadesoftware.Atividade_Pessoa;

/**
 *
 * @author kawan.mfernandes
 */
public class Funcionario extends PessoaFisica{
    private int Matricula;

    public Funcionario(int Matricula, Long cpf, String nome) {
        super(cpf, nome);
        this.Matricula = Matricula;
    }
    
    public Funcionario() {
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    @Override
    public String toString() {
        return "Funcionario{"  + " nome = " + super.getNome()  + "  CPF = " + super.getCpf() + " Matricula = " + Matricula + '}';
    }

    
    
    
    
    
}
