package org.tswicolly.jogo.padroesprojeto.singleton;

import org.tswicolly.jogo.itens.Item;
import org.tswicolly.jogo.padroesprojeto.observer.Observador;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private static Personagem instancia;
    private String nome;
    private String classe;
    private int vida;
    private int mana;
    private int xp;
    private int nivel;
    private List<Observador> observadores = new ArrayList<>();

    private Personagem() {
        // Valores iniciais do personagem
        this.nome = "Heroi viajante";
        this.classe = "Guerreiro";
        this.vida = 100;
        this.mana = 50;
        this.xp = 0;
        this.nivel = 1;
    }

    public static Personagem getInstancia() {
        if (instancia == null) {
            instancia = new Personagem();
        }
        return instancia;
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar();
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        notificarObservadores();
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
        notificarObservadores();
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
        notificarObservadores();
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
        notificarObservadores();
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
        notificarObservadores();
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
        notificarObservadores();
    }
    private Item armaEquipada;
    private Item armaduraEquipada;
    private List<Item> itensAtivos = new ArrayList<>();

//    public void equiparArma(Espada arma) {
//        if(this.armaEquipada != null) {
//            desequiparArma();
//        }
//        this.armaEquipada = arma;
//        System.out.println("Arma equipada: " + arma.getNome());
//    }

    public void desequiparArma() {
        if(this.armaEquipada != null) {
            System.out.println("Arma desequipada: " + this.armaEquipada.getNome());
            this.armaEquipada = null;
        }
    }
}