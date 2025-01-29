package org.tswicolly.jogo.itens;

public enum SubType {
    // Para ataque
    FISICO("Físico"),
    MAGICO("Mágico"),

    // Para defesa
    ARMADURA("Armadura"),
    ESCUDO("Escudo"),

    // Genéricos
    POCAO("Poção"),
    ARMADILHA("Armadilha"),
    CHAVE("Chave"),
    OUTROS("Outros");

    private final String nome;

    SubType(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}