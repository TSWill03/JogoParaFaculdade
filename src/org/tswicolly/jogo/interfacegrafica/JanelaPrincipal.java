package org.tswicolly.jogo.interfacegrafica;

import org.tswicolly.jogo.interfacegrafica.paineis.JanelaInventario;
import org.tswicolly.jogo.interfacegrafica.paineis.PainelStatus;
import org.tswicolly.jogo.padroesprojeto.singleton.Personagem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        // Botão para abrir o inventário
        JButton btnAbrirInventario = new JButton("Abrir Inventário");
        btnAbrirInventario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new JanelaInventario().setVisible(true); // Abre a janela do inventário
            }
        });
        add(btnAbrirInventario, BorderLayout.SOUTH);

        // Exibe a janela
        setVisible(true);
    }

}
