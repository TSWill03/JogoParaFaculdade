package org.tswicolly.jogo.interfacegrafica.paineis;

import org.tswicolly.jogo.itens.Item;
import org.tswicolly.jogo.itens.Raridade;
import org.tswicolly.jogo.padroesprojeto.singleton.Inventario;
import org.tswicolly.jogo.util.ImageUtils;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class JanelaInventario extends JFrame {
    private JList<Item> listaItens;
    private JScrollPane painelDetalhesScroll;

    private class ItemListRenderer extends DefaultListCellRenderer {
        private static final int ICONE_WIDTH = 64;
        private static final int ICONE_HEIGHT = 64;
        private final ImageIcon iconePadrao = ImageUtils.loadAndScaleIcon("/icones/notfound.png", ICONE_WIDTH, ICONE_HEIGHT);

        private String getCorRaridade(Raridade raridade) {
            return raridade.getCorHex();
        }

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                      boolean isSelected, boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            Item item = (Item) value;

            try {
                ImageIcon icon = ImageUtils.loadAndScaleIcon(item.getCaminhoIcone(), ICONE_WIDTH, ICONE_HEIGHT);
                label.setIcon(icon);
            } catch (NullPointerException e) {
                label.setIcon(iconePadrao);
            }

            label.setText("<html><div style='width:120px; text-align:center; padding:5px;'>" +
                    "<b style='color:#2c3e50; font-size:12px;'>" + item.getNome() + "</b><br/>" +
                    "<small style='color:" + getCorRaridade(item.getRaridade()) + ";'>" +
                    item.getRaridade().name().charAt(0) +
                    item.getRaridade().name().substring(1).toLowerCase() +
                    "</small>" +
                    "</div></html>");

            label.setBackground(isSelected ? new Color(230, 240, 255) : Color.WHITE);
            label.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

            return label;
        }
    }

    public JanelaInventario() {
        // Configurações da janela
        setTitle("Inventário");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Obtém a instância do inventário
        Inventario inventario = Inventario.getInstancia();

        // Configura a lista de itens
        listaItens = new JList<>(new DefaultListModel<>());
        listaItens.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaItens.setFixedCellHeight(60);
        listaItens.setCellRenderer(new ItemListRenderer());
        atualizarListaItens(inventario.getItens());

        // Configura o painel de detalhes
        painelDetalhesScroll = new JScrollPane();
        painelDetalhesScroll.setBorder(BorderFactory.createEmptyBorder());

        // Layout principal
        JSplitPane splitPane = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,
                new JScrollPane(listaItens),
                painelDetalhesScroll
        );
        splitPane.setDividerLocation(250);
        add(splitPane, BorderLayout.CENTER);

        // Listener de seleção
        listaItens.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                exibirDetalhesItem(listaItens.getSelectedValue());
            }
        });
    }

    private void atualizarListaItens(List<Item> itens) {
        DefaultListModel<Item> modelo = (DefaultListModel<Item>) listaItens.getModel();
        modelo.clear();
        for (Item item : itens) {
            modelo.addElement(item);
        }
    }

    private void exibirDetalhesItem(Item item) {
        if (item == null) return;

        JPanel painelDetalhes = new JPanel();
        painelDetalhes.setLayout(new BoxLayout(painelDetalhes, BoxLayout.Y_AXIS));
        painelDetalhes.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Cabeçalho
        JLabel lblTitulo = new JLabel(item.getNome());
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        painelDetalhes.add(lblTitulo);

        // Linha de tipo/raridade
        JPanel linhaTipo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        linhaTipo.add(new JLabel("Tipo: " + item.getTipo().getNome()));
        linhaTipo.add(new JLabel("Subtipo: " + item.getSubtipo().getNome()));
        linhaTipo.add(new JLabel("Raridade: "));

        JLabel lblRaridade = new JLabel(item.getRaridade().name());
        lblRaridade.setForeground(Color.decode(item.getRaridade().getCorHex()));
        linhaTipo.add(lblRaridade);

        painelDetalhes.add(linhaTipo);

        // Atributos
        JPanel painelAtributos = new JPanel(new GridLayout(0, 2, 5, 5));
        for (String atributo : item.getAtributos().split(";")) {
            painelAtributos.add(new JLabel(atributo.trim()));
        }
        painelDetalhes.add(new JScrollPane(painelAtributos));

        // Descrição
        JTextArea txtDescricao = new JTextArea(item.getDescricao());
        txtDescricao.setEditable(false);
        txtDescricao.setLineWrap(true);
        painelDetalhes.add(new JScrollPane(txtDescricao));

        // Atualização do painel
        painelDetalhesScroll.setViewportView(painelDetalhes);
        painelDetalhes.revalidate();
        painelDetalhes.repaint();
    }
    private JTextArea criarAreaTextoFormatada(String texto) {
        JTextArea area = new JTextArea(texto);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setEditable(false);
        area.setFont(new Font("Arial", Font.PLAIN, 14));
        area.setBackground(new Color(245, 245, 245));
        area.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(220, 220, 220)),
                BorderFactory.createEmptyBorder(8, 8, 8, 8)
        ));
        return area;
    }
}