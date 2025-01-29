package org.tswicolly.jogo.itens.diversos.chaves;

import org.tswicolly.jogo.itens.Item;

public class ChaveAntiga implements Item {
    private String nome;
    private String descricao;
    private String efeito;

    public ChaveAntiga() {
        this.nome = "Chave Antiga";
        this.descricao = "Uma chave misteriosa.";
        this.efeito = "Abre portas trancadas.";
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return null;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getAtributos() {
        return null;
    }

    @Override
    public String getRaridade() {
        return "common";
    }

    @Override
    public String getPreco() {
        return null;
    }
    @Override
    public String toString() {
        return getNome();
    }
}
