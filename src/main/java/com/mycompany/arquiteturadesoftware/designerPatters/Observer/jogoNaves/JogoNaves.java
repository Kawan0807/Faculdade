package com.mycompany.arquiteturadesoftware.designerPatters.Observer.jogoNaves;

import com.mycompany.arquiteturadesoftware.designerPatters.Observer.pattern.*;

public class JogoNaves {
    public static void main(String[] args) {
        InterfaceNaveJogador naveJogador = new NaveJogador("Jogador");
        InterfaceNaveInimiga naveInimiga = new NaveInimiga("Inimigo 1", naveJogador);
        naveJogador.adicionarAcoes(Acoes.RECUAR);
        naveJogador.adicionarAcoes(Acoes.AVANCAR);
        InterfaceNaveInimiga naveInimiga2 = new NaveInimiga("Inimigo 2", naveJogador);
        naveJogador.adicionarAcoes(Acoes.VIRAR_DIREITA);
        naveJogador.adicionarAcoes(Acoes.VIRAR_ESQUERDA);
    }
}
