package org.tswicolly.jogo.itens.ataque.fisico;

import org.tswicolly.jogo.itens.Item;

public class Espada implements Item {
    @Override
    public String getNome() {
        return "Espada de Iniciante";
    }

    @Override
    public String getTipo() {
        return "Arma (Espada de Uma Mão)";
    }

    @Override
    public String getDescricao() {
        return "Uma espada simples e leve, ideal para guerreiros iniciantes. Forjada em aço comum, possui uma lâmina reta e um cabo de couro para melhor aderência. Apesar de não ser muito afiada, é confiável para combates básicos.";
    }

    @Override
    public String getAtributos() {
        return "Dano: 8-12 de dano físico\n" +
                "Velocidade de Ataque: 1.2 ataques por segundo\n" +
                "Durabilidade: 100\n" +
                "Peso: 1.5 kg";
    }

    @Override
    public String getRaridade() {
        return "Comum";
    }

    @Override
    public String getPreco() {
        return "10 moedas de ouro";
    }
    @Override
    public String toString() {
        return getNome();
    }
}