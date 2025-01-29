package org.tswicolly.jogo.interfacegrafica.paineis;

import org.tswicolly.jogo.itens.Item;
import org.tswicolly.jogo.padroesprojeto.singleton.Inventario;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class JanelaInventario extends JFrame {
    private JList<Item> listaItens;
    private JTextArea txtDetalhesItem;

    public JanelaInventario() {
        // Configurações da janela
        setTitle("Inventário");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas esta janela
        setLocationRelativeTo(null);

        // Obtém a instância do inventário
        Inventario inventario = Inventario.getInstancia();

        // Cria a lista de itens
        listaItens = new JList<>(new DefaultListModel<>());
        atualizarListaItens(inventario.getItens());

        // Adiciona um listener para exibir detalhes do item selecionado
        listaItens.addListSelectionListener(e -> {
            Item itemSelecionado = listaItens.getSelectedValue();
            if (itemSelecionado != null) {
                exibirDetalhesItem(itemSelecionado);
            }
        });

        // Cria a área de detalhes do item
        txtDetalhesItem = new JTextArea();
        txtDetalhesItem.setEditable(false);
        txtDetalhesItem.setLineWrap(true);
        txtDetalhesItem.setWrapStyleWord(true);

        // Layout da janela
        JPanel painelPrincipal = new JPanel(new BorderLayout());
        painelPrincipal.add(new JScrollPane(listaItens), BorderLayout.WEST);
        painelPrincipal.add(new JScrollPane(txtDetalhesItem), BorderLayout.CENTER);

        add(painelPrincipal);
    }

    // Atualiza a lista de itens exibida
    public void atualizarListaItens(List<Item> itens) {
        DefaultListModel<Item> modelo = (DefaultListModel<Item>) listaItens.getModel();
        modelo.clear();
        for (Item item : itens) {
            modelo.addElement(item);
        }
    }

    // Exibe os detalhes do item selecionado
    public void exibirDetalhesItem(Item item) {
        txtDetalhesItem.setText(
                "Nome: " + item.getNome() + "\n" +
                        "Descrição: " + item.getDescricao() + "\n" +
                        "Efeito: " + item.getEfeito()
        );
    }
}
