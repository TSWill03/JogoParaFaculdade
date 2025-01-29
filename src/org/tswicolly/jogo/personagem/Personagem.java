package org.tswicolly.jogo.personagem;

import org.tswicolly.jogo.padroesprojeto.observer.Observador;
import org.tswicolly.jogo.padroesprojeto.strategy.EstrategiaAtaque;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

    private static Personagem instancia;
    private String nome;
    private int vida;
    private int mana;
    private int xp;

    private EstrategiaAtaque estrategiaAtaque;

    private List<Observador> observadores = new ArrayList<>();

    private Personagem() {}

    public static Personagem getInstancia() {
        if (instancia == null) {
            instancia = new Personagem();
        }
        return instancia;
    }

    public void setEstrategiaAtaque(EstrategiaAtaque estrategiaAtaque) {
        this.estrategiaAtaque = estrategiaAtaque;
    }

    public void atacar() {
        estrategiaAtaque.atacar();
    }


    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(this.vida, this.mana, this.xp);
        }
    }

    public void ganharXP(int quantidade) {
        this.xp += quantidade;
        notificarObservadores();
    }
}