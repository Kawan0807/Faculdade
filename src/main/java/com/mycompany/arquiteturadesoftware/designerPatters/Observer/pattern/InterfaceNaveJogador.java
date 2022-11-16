package com.mycompany.arquiteturadesoftware.designerPatters.Observer.pattern;

/*
 Subject - objeto observável
*/
public interface InterfaceNaveJogador {
    public void adicionarObservador(InterfaceNaveInimiga navi);
    public void adicionarAcoes(Acoes acao);
    public void notificar();
}
