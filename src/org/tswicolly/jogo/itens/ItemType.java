package org.tswicolly.jogo.itens;

public enum ItemType {
    ATAQUE("Ataque"),
    DEFESA("Defesa"),
    SUPORTE("Suporte"),
    DIVERSOS("Diversos");

    private final String nome;

    ItemType(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
