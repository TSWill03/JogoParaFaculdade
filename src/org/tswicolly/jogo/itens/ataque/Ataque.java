package org.tswicolly.jogo.itens.ataque;

import org.tswicolly.jogo.itens.Item;

public interface Ataque extends Item {
    /**
     * 1 para fisico
     * 2 para magico
     */
    int getTipoAtaque();
    int getDurabilidade();
    int getVelocidadeAtaque();
}
