package org.tswicolly.jogo.itens;

import org.tswicolly.jogo.padroesprojeto.singleton.Personagem;

public interface Item {
    String toString();
    String getNome();
    String getTipo();
    String getDescricao();
    String getAtributos();
    Raridade getRaridade();
    String getPreco();
    String getCaminhoIcone();

    void usar(Personagem personagem);

    void desequipar(Personagem personagem);

}
