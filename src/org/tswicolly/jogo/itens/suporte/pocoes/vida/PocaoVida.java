package org.tswicolly.jogo.itens.suporte.pocoes.vida;

import org.tswicolly.jogo.itens.Item;
import org.tswicolly.jogo.itens.Raridade;
import org.tswicolly.jogo.padroesprojeto.singleton.Personagem;

public class PocaoVida implements Item {
    @Override
    public String getNome() {
        return "Poção de Vida Grande";
    }

    @Override
    public String getTipo() {
        return "Consumível";
    }

    @Override
    public String getDescricao() {
        return "Uma poderosa poção de cura contendo um líquido vermelho intenso, irradiando energia vital. Criada a partir da fusão de essências curativas raras e néctar de flores místicas.";
    }

    @Override
    public String getAtributos() {
        return "Efeito: Restaura 100 pontos de vida ao ser consumida.\n" +
                "Duração: Instantâneo\n" +
                "Tempo de Recarga: 30 segundos\n" +
                "Peso: 0.5 kg";
    }

    @Override
    public Raridade getRaridade() {
        return Raridade.RARO;
    }

    @Override
    public String getPreco() {
        return "25 moedas de ouro";
    }

    @Override
    public String getCaminhoIcone() {
        return "/icones/itens/suporte/poçãoVidaPequena/pocaoVidaPequena.png";
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
