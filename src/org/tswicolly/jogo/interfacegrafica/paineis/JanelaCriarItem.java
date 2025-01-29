package org.tswicolly.jogo.interfacegrafica.paineis;

import org.tswicolly.jogo.itens.*;

import javax.swing.*;
import java.awt.*;

public class JanelaCriarItem extends JDialog {
    private JTextField txtNome = new JTextField(20);
    private JComboBox<ItemType> cmbTipo = new JComboBox<>(ItemType.values());
    private JComboBox<SubType> cmbSubTipo = new JComboBox<>();
    private JTextArea txtDescricao = new JTextArea(5, 20);
    private JTextField txtAtributos = new JTextField(20);
    private JComboBox<Raridade> cmbRaridade = new JComboBox<>(Raridade.values());
    private JButton btnSalvar = new JButton("Salvar Item");

    public JanelaCriarItem(Frame owner) {
        super(owner, "Criar Novo Item", true);
        configurarUI();
        configurarEventos();
    }

    private void configurarUI() {
        setLayout(new BorderLayout());
        JPanel formPanel = new JPanel(new GridLayout(0, 2, 10, 5));

        // Componentes
        formPanel.add(new JLabel("Nome:"));
        formPanel.add(txtNome);

        formPanel.add(new JLabel("Tipo:"));
        formPanel.add(cmbTipo);

        formPanel.add(new JLabel("Subtipo:"));
        formPanel.add(cmbSubTipo);

        formPanel.add(new JLabel("Raridade:"));
        formPanel.add(cmbRaridade);

        formPanel.add(new JLabel("Atributos (separados por ;):"));
        formPanel.add(txtAtributos);

        formPanel.add(new JLabel("Descrição:"));
        formPanel.add(new JScrollPane(txtDescricao));

        add(formPanel, BorderLayout.CENTER);
        add(btnSalvar, BorderLayout.SOUTH);
        atualizarSubtipos();
        pack();
    }

    private void configurarEventos() {
        cmbTipo.addActionListener(e -> atualizarSubtipos());
        btnSalvar.addActionListener(e -> salvarItem());
    }

    private void atualizarSubtipos() {
        ItemType tipoSelecionado = (ItemType) cmbTipo.getSelectedItem();
        cmbSubTipo.removeAllItems();

        switch (tipoSelecionado) {
            case ATAQUE:
                cmbSubTipo.addItem(SubType.FISICO);
                cmbSubTipo.addItem(SubType.MAGICO);
                break;
            case DEFESA:
                cmbSubTipo.addItem(SubType.ARMADURA);
                cmbSubTipo.addItem(SubType.ESCUDO);
                break;
            case SUPORTE:
            case DIVERSOS:
                for (SubType st : SubType.values()) {
                    if (st != SubType.FISICO && st != SubType.MAGICO &&
                            st != SubType.ARMADURA && st != SubType.ESCUDO) {
                        cmbSubTipo.addItem(st);
                    }
                }
                break;
        }
    }

    private void salvarItem() {
        try {
            Item novoItem = new Item(
                    txtNome.getText(),
                    (ItemType) cmbTipo.getSelectedItem(),
                    (SubType) cmbSubTipo.getSelectedItem(),
                    txtDescricao.getText(),
                    (Raridade) cmbRaridade.getSelectedItem(),
                    txtAtributos.getText(),
                    "/icones/" + txtNome.getText().toLowerCase().replace(" ", "_") + ".png"
            );

            GerenciadorItens.salvarItem(novoItem);
            JOptionPane.showMessageDialog(this, "Item salvo com sucesso!");
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}