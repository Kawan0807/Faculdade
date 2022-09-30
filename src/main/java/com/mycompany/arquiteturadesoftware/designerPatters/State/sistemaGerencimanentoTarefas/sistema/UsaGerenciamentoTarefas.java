package com.mycompany.arquiteturadesoftware.designerPatters.State.sistemaGerencimanentoTarefas.sistema;


import com.mycompany.arquiteturadesoftware.designerPatters.State.sistemaGerencimanentoTarefas.patternState.Context;

/**
 *
 * @author kawan.mfernandes
 */
public class UsaGerenciamentoTarefas {
    public static void main(String[] args) {
        Context tarefa = new Context();
            System.out.println(tarefa.getEstado());
        tarefa.requisitarAtrasada();
        tarefa.requisitarAtrasada();
        System.out.println();
        tarefa.requisitarConcluida();
        tarefa.requisitarConcluida();
        System.out.println();
        tarefa.requisitarPendente();
        tarefa.requisitarPendente();
    }
}
