package org.tswicolly.jogo.itens.ataque.fisico;

import org.tswicolly.jogo.itens.ataque.Ataque;

public class Espada implements Ataque {
    private String nome;
    private String descricao;
    private String efeito;


    public Espada() {
        this.nome = "Espada de Aço";
        this.descricao = "Uma espada simples e leve, ideal para guerreiros iniciantes. Forjada em aço comum, possui uma lâmina reta e um cabo de couro para melhor aderência. Apesar de não ser muito afiada, é confiável para combates básicos";
        this.efeito = "Ataque 8-12";
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

    @Override
    public int getDurabilidade() {
        return 0;
    }

    @Override
    public int getVelocidadeAtaque() {
        return 0;
    }
}
