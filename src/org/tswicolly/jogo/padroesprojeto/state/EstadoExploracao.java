package org.tswicolly.jogo.padroesprojeto.state;

public class EstadoExploracao implements EstadoJogo {
    @Override
    public void executar() {
        System.out.println("Explorando o mundo...");
    }
}
