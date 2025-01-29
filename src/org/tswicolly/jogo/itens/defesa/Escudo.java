package org.tswicolly.jogo.itens.defesa;

import org.tswicolly.jogo.itens.Item;

public class Escudo implements Item {
    private String nome;
    private String descricao;
    private String efeito;

    public Escudo() {
        this.nome = "Escudo de Madeira";
        this.descricao = "Protege contra ataques.";
        this.efeito = "Defesa +5";
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getEfeito() {
        return efeito;
    }

    @Override
    public String getRaridade() {
        return null;
    }

    @Override
    public int getValor() {
        return 0;
    }
}
