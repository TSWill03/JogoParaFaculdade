package org.tswicolly.jogo.itens.ataque;

import org.tswicolly.jogo.itens.Item;

public interface Ataque extends Item {
    int getDurabilidade();
    int getVelocidadeAtaque();
}
