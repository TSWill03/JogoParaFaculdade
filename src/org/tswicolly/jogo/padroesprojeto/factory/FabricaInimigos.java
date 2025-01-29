package org.tswicolly.jogo.padroesprojeto.factory;

import org.tswicolly.jogo.inimigos.Goblin;

public class FabricaInimigos {
    public static Inimigo criarInimigo(String tipo) {
        if (tipo.equals("Goblin")) {
            return (Inimigo) new Goblin();
        }
        // Adicionar outros tipos de inimigos
        return null;
    }
}
