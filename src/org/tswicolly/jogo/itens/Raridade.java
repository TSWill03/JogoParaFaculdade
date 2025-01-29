package org.tswicolly.jogo.itens;

public enum Raridade {
    COMUM("#95a5a6"),
    INCOMUM("#3498db"),
    RARO("#e67e22"),
    EPICO("#9b59b6"),
    LENDARIO("#f1c40f"),
    PERFEITO("#2ecc71"),
    DIVINO("#ff69b4"),
    TRANSCENDENTAL("#ffffff");

    private final String corHex;

    Raridade(String corHex) {
        this.corHex = corHex;
    }

    public String getCorHex() {
        return corHex;
    }
}
