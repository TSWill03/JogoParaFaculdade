package org.tswicolly.jogo.itens.defesa.escudos;

import org.tswicolly.jogo.itens.defesa.Defesa;

public class Escudo implements Defesa {
    private String nome;
    private String descricao;
    private String efeito;

    public Escudo() {
        this.nome = "Escudo de Madeira";
        this.descricao = "Um escudo simples feito de madeira reforçada com um aro metálico. Leve e fácil de manusear, é ideal para guerreiros em treinamento. Apesar de não ser muito resistente contra ataques poderosos, oferece uma defesa básica eficiente.";
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
        return "commom";
    }

    @Override
    public int getValor() {
        return 12;
    }

    @Override
    public int getMultiplicadorValor() {
        return 3;
    }
}
