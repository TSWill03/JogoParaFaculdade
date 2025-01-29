package org.tswicolly.test;

import org.tswicolly.jogo.interfacegrafica.JanelaPrincipal;
import org.tswicolly.jogo.itens.Item;
import org.tswicolly.jogo.padroesprojeto.singleton.Inventario;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Adiciona alguns itens ao inventário
        Inventario inventario = Inventario.getInstancia();
        inventario.adicionarItem(new Item("Poção de Vida", "Restaura 50 de vida.", "Cura"));
        inventario.adicionarItem(new Item("Espada de Aço", "Uma espada afiada.", "Ataque +10"));
        inventario.adicionarItem(new Item("Escudo de Madeira", "Protege contra ataques.", "Defesa +5"));

        // Inicia a interface gráfica
        SwingUtilities.invokeLater(() -> new JanelaPrincipal());


        SwingUtilities.invokeLater(() -> new JanelaPrincipal());
    }
}