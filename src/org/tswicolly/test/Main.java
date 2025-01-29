package org.tswicolly.test;

import org.tswicolly.jogo.interfacegrafica.JanelaPrincipal;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JanelaPrincipal());
    }
}