package org.tswicolly.jogo.padroesprojeto.observer;

public class InterfaceStatus implements Observador {
    @Override
    public void atualizar(int vida, int mana, int xp) {
        System.out.println("Status atualizado - Vida: " + vida + ", Mana: " + mana + ", XP: " + xp);
    }
}
