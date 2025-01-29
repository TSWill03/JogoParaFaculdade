package org.tswicolly.jogo.itens.defesa.escudos;

import org.tswicolly.jogo.itens.Item;
import org.tswicolly.jogo.itens.Raridade;
import org.tswicolly.jogo.padroesprojeto.singleton.Personagem;

public class Escudo implements Item {
    @Override
    public String getNome() {
        return "Escudo de Iniciante";
    }

    @Override
    public String getTipo() {
        return "Equipamento (Escudo)";
    }

    @Override
    public String getDescricao() {
        return "Um escudo simples feito de madeira reforçada com um aro metálico. Leve e fácil de manusear, é ideal para guerreiros em treinamento. Apesar de não ser muito resistente contra ataques poderosos, oferece uma defesa básica eficiente.";
    }

    @Override
    public String getAtributos() {
        return "Defesa: +10 de resistência física\n" +
                "Durabilidade: 120\n" +
                "Peso: 2.0 kg";
    }

    @Override
    public Raridade getRaridade() {
        return Raridade.COMUM;
    }

    @Override
    public String getPreco() {
        return "12 moedas de ouro";
    }

    @Override
    public String getCaminhoIcone() {
        return "/icones/itens/defesa/fisico/escudos/escudoIniciante/escudoiniciante.png";
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