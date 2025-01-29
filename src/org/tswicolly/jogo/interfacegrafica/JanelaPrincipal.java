package org.tswicolly.jogo.interfacegrafica;

import org.tswicolly.jogo.interfacegrafica.paineis.PainelStatus;
import org.tswicolly.jogo.padroesprojeto.singleton.Personagem;

import javax.swing.*;
import java.awt.*;

public class JanelaPrincipal extends JFrame {
    public JanelaPrincipal() {
        // Configurações da janela
        setTitle("Jogo de Aventura");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Obtém a instância do personagem
        Personagem personagem = Personagem.getInstancia();

        // Cria o painel de status e adiciona à janela
        PainelStatus painelStatus = new PainelStatus(personagem);
        add(painelStatus, BorderLayout.NORTH);

        // Botão para simular uma mudança nos atributos
        JButton btnAtualizar = new JButton("Atualizar Atributos");
        btnAtualizar.addActionListener(e -> {
            personagem.setVida(personagem.getVida() - 10);
            personagem.setXp(personagem.getXp() + 50);
        });
        add(btnAtualizar, BorderLayout.SOUTH);

        // Exibe a janela
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JanelaPrincipal());
    }
}
