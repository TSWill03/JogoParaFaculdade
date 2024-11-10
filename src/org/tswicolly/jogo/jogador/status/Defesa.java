package org.tswicolly.jogo.jogador.status;

import org.tswicolly.jogo.jogador.atributos.Constituicao;
import org.tswicolly.jogo.jogador.atributos.Destreza;
import org.tswicolly.jogo.jogador.atributos.Agilidade;
import org.tswicolly.jogo.jogador.atributos.Esquiva;


public class Defesa {

    private double agilidade = new Agilidade().getAgilidade();
    private double destreza = new Destreza().getDestreza();
    private double esquiva = new Esquiva().getEsquiva();
    private double constituicao = new Constituicao().getConstituicao();
    private double defesa;

    public Defesa() {
        this.defesa = (agilidade + destreza + esquiva + constituicao) / 4;;
    }

    public double getDefesa() {
        return this.defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }


}
