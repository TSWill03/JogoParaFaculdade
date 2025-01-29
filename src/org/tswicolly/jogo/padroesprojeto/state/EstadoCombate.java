package org.tswicolly.jogo.padroesprojeto.state;

public class EstadoCombate implements EstadoJogo {
    @Override
    public void executar() {
        System.out.println("Em combate! Cuidado com os inimigos.");
    }
}
