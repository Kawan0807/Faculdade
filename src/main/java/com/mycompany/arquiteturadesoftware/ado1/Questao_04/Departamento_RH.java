package com.mycompany.arquiteturadesoftware.ado1.Questao_04;

public class Departamento_RH implements Componente {

    private int quantidadeFuncionarios;
    private double custoDepartamento;

    public Departamento_RH(int quantidadeFuncionarios, double custoDepartamento) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.custoDepartamento = custoDepartamento;
    }

    public Departamento_RH() {
    }

    @Override
    public double getCustos() {
        return custoDepartamento;
    }

    @Override
    public int quantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    @Override
    public String toString() {
        return "Departamento_TI{" +
                "quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", custoDepartamento=" + custoDepartamento +
                '}';
    }
}
