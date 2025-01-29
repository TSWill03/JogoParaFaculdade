package org.tswicolly.jogo.padroesprojeto.strategy;

public class AtaqueFisico implements EstrategiaAtaque {
    @Override
    public void atacar() {
        System.out.println("Ataque físico com espada!");
    }
}
