package com.mycompany.arquiteturadesoftware.designerPatters.State.sistemaGerencimanentoTarefas.patternState;

public interface State {

    public void atrasada();
    public void concluida();
    public void pendente();
}
