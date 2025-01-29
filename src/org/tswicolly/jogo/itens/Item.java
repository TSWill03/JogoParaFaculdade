package org.tswicolly.jogo.itens;

public interface Item {
    String getNome();
    String getDescricao();
    String getEfeito();
    String getRaridade();
    int getValor();

    int valor = 0;
    /**
     * 1. igual a cobre
     * 2. igual a prata 100 cobres
     * 3. igual a ouro  100 pratas
     * 4. igual a platina 100 ouros
     */
    int multiplicadorValor = 1;
}