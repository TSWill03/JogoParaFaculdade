package org.tswicolly.jogo.jogo;

import org.tswicolly.jogo.padroesprojeto.state.EstadoJogo;

public class Jogo {
    private EstadoJogo estadoAtual;

    public void setEstado(EstadoJogo estado) {
        this.estadoAtual = estado;
    }

    public void executar() {
        estadoAtual.executar();
    }
}
