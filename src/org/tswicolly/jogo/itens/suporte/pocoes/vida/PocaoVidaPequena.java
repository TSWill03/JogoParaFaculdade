package org.tswicolly.jogo.itens.suporte.pocoes.vida;

import org.tswicolly.jogo.itens.Item;

public class PocaoVidaPequena implements Item {
    private String nome;
    private String descricao;
    private String efeito;
    private int valor;

    public PocaoVidaPequena() {
        this.nome = "Poção de Vida Pequena";
        this.descricao = "Uma pequena poção de cura contendo um líquido vermelho brilhante. Sua fórmula é feita a partir de ervas medicinais raras e essência de vitalidade condensada. Recupera 25 pontos de vida";
        this.efeito = "Cura";
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
