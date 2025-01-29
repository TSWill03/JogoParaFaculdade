package org.tswicolly.jogo.interfacegrafica.paineis;
import org.tswicolly.jogo.padroesprojeto.observer.Observador;
import org.tswicolly.jogo.padroesprojeto.singleton.Personagem;

import javax.swing.*;
import java.awt.*;

public class PainelStatus extends JPanel implements Observador {
    private JLabel lblNome;
    private JLabel lblClasse;
    private JLabel lblVida;
    private JLabel lblMana;
    private JLabel lblXp;
    private JLabel lblNivel;

    private Personagem personagem;

    public PainelStatus(Personagem personagem) {
        // Configura o layout do painel
        setLayout(new GridLayout(6, 2)); // 6 linhas, 2 colunas

        String nomePersonagem = personagem.getNome();

        // Inicializa os labels
        lblNome = new JLabel("Nome: " + nomePersonagem);
        lblClasse = new JLabel("Classe: Guerreiro");
        lblVida = new JLabel("Vida: 100");
        lblMana = new JLabel("Mana: 50");
        lblXp = new JLabel("XP: 0");
        lblNivel = new JLabel("Nível: 1");

        // Adiciona os labels ao painel
        add(lblNome);
        add(lblClasse);
        add(lblVida);
        add(lblMana);
        add(lblXp);
        add(lblNivel);

        // Estilização opcional
        setBorder(BorderFactory.createTitledBorder("Status do Personagem"));

        this.personagem = personagem;
        this.personagem.adicionarObservador((Observador) this); // Registra o painel como observador
        atualizarStatus(personagem.getNome(), personagem.getClasse(), personagem.getVida(), personagem.getMana(), personagem.getXp(), personagem.getNivel());
    }

    @Override
    public void atualizar() {
        atualizarStatus(personagem.getNome(), personagem.getClasse(), personagem.getVida(), personagem.getMana(), personagem.getXp(), personagem.getNivel());
    }

    // Método para atualizar os valores exibidos
    public void atualizarStatus(String nome, String classe, int vida, int mana, int xp, int nivel) {
        lblNome.setText("Nome: " + nome);
        lblClasse.setText("Classe: " + classe);
        lblVida.setText("Vida: " + vida);
        lblMana.setText("Mana: " + mana);
        lblXp.setText("XP: " + xp);
        lblNivel.setText("Nível: " + nivel);
    }

}
