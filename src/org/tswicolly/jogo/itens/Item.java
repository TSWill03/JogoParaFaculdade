package org.tswicolly.jogo.itens;

public class Item {
    private String nome;
    private String descricao;
    private String efeito;

    public Item(String nome, String descricao, String efeito) {
        this.nome = nome;
        this.descricao = descricao;
        this.efeito = efeito;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEfeito() {
        return efeito;
    }

    @Override
    public String toString() {
        return nome; // Usado para exibir o nome do item em listas
    }
}
