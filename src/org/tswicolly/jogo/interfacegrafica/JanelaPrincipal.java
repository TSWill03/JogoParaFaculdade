package org.tswicolly.jogo.interfacegrafica;

import org.tswicolly.jogo.interfacegrafica.paineis.JanelaCriarItem;
import org.tswicolly.jogo.interfacegrafica.paineis.JanelaInventario;
import org.tswicolly.jogo.interfacegrafica.paineis.PainelStatus;
import org.tswicolly.jogo.itens.GerenciadorItens;
import org.tswicolly.jogo.itens.Item;
import org.tswicolly.jogo.padroesprojeto.singleton.Inventario;
import org.tswicolly.jogo.padroesprojeto.singleton.Personagem;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class JanelaPrincipal extends JFrame {
    private JButton btnAbrirInventario;
    private JButton btnNovoItem;
    private JButton btnCarregarItens;

    public JanelaPrincipal() {
        // Configurações da janela
        setTitle("Jogo de Aventura");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Obtém a instância do personagem
        Personagem personagem = Personagem.getInstancia();

        // Cria o painel de status
        PainelStatus painelStatus = new PainelStatus(personagem);
        add(painelStatus, BorderLayout.NORTH);

        // Criação dos botões
        btnAbrirInventario = new JButton("Abrir Inventário");
        btnNovoItem = new JButton("Criar Novo Item");
        btnCarregarItens = new JButton("Carregar Itens");

        // Configuração do painel de botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.add(btnAbrirInventario);
        painelBotoes.add(btnNovoItem);
        painelBotoes.add(btnCarregarItens);

        // Ação para abrir inventário
        btnAbrirInventario.addActionListener(e -> new JanelaInventario().setVisible(true));

        // Ação para criar novo item
        btnNovoItem.addActionListener(e -> new JanelaCriarItem(this).setVisible(true));

        // Ação para carregar itens
        btnCarregarItens.addActionListener(e -> carregarItensCustomizados());

        // Adiciona componentes à janela
        add(painelBotoes, BorderLayout.SOUTH);
        setVisible(true);
    }

    private void carregarItensCustomizados() {
        List<Item> itens = GerenciadorItens.carregarItens();
        Inventario inventario = Inventario.getInstancia();
        itens.forEach(inventario::adicionarItem);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JanelaPrincipal());
    }
}