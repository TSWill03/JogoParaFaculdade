package org.tswicolly.jogo.interfacegrafica.paineis;

import javax.swing.*;
import java.awt.*;

public class JanelaCriarItem extends JDialog {
    private JTextField txtNome = new JTextField(20);
    private JComboBox<String> cmbTipo = new JComboBox<>(new String[]{"Arma", "Armadura", "Consumível"});
    private JTextArea txtDescricao = new JTextArea(5, 20);
    private JButton btnSalvar = new JButton("Salvar Item");

    public JanelaCriarItem(Frame owner) {
        super(owner, "Criar Novo Item", true);

        setLayout(new BorderLayout());
        JPanel formPanel = new JPanel(new GridLayout(0, 2));

        formPanel.add(new JLabel("Nome:"));
        formPanel.add(txtNome);

        formPanel.add(new JLabel("Tipo:"));
        formPanel.add(cmbTipo);

        formPanel.add(new JLabel("Descrição:"));
        formPanel.add(new JScrollPane(txtDescricao));

        btnSalvar.addActionListener(e -> salvarItem());

        add(formPanel, BorderLayout.CENTER);
        add(btnSalvar, BorderLayout.SOUTH);
        pack();
    }

    private void salvarItem() {
        // Aqui você implementaria a lógica para salvar em arquivo
        // Exemplo usando JSON:
        /*
        ItemNovo item = new ItemNovo(
            txtNome.getText(),
            (String) cmbTipo.getSelectedItem(),
            txtDescricao.getText()
        );

        GerenciadorItens.salvarItem(item);
        */

        JOptionPane.showMessageDialog(this, "Item salvo com sucesso!");
        dispose();
    }
}
