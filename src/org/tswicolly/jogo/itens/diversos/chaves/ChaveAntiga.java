package org.tswicolly.jogo.itens.diversos.chaves;

import org.tswicolly.jogo.itens.Item;
import org.tswicolly.jogo.itens.Raridade;
import org.tswicolly.jogo.padroesprojeto.singleton.Personagem;

public class ChaveAntiga implements Item {
    private String nome;
    private String descricao;
    private String efeito;

    public ChaveAntiga() {
        this.nome = "Chave Antiga";
        this.descricao = "Uma chave enferrujada e ornamentada, forjada há séculos. Seu design detalhado sugere que pertence a uma fechadura complexa e misteriosa. Pode abrir uma porta selada por magia antiga ou um baú esquecido pelo tempo.";
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
        return "Abre portas Antigas";
    }

    @Override
    public Raridade getRaridade() {
        return Raridade.COMUM;
    }

    @Override
    public String getPreco() {
        return "1";
    }

    @Override
    public String getCaminhoIcone() {
        return "/icones/itens/diversos/chaves/chaveantiga/icone_chaveAntiga.png";
    }

    @Override
    public void usar(Personagem personagem) {

    }

    @Override
    public void desequipar(Personagem personagem) {

    }

    @Override
    public String toString() {
        return getNome();
    }
}
