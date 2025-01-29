package org.tswicolly.test;

import org.tswicolly.jogo.interfacegrafica.JanelaPrincipal;
import org.tswicolly.jogo.itens.Item;
import org.tswicolly.jogo.itens.ataque.fisico.Espada;
import org.tswicolly.jogo.itens.defesa.escudos.Escudo;
import org.tswicolly.jogo.itens.diversos.chaves.ChaveAntiga;
import org.tswicolly.jogo.itens.suporte.pocoes.vida.PocaoVida;
import org.tswicolly.jogo.padroesprojeto.singleton.Inventario;


import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Obtém a instância do inventário
        Inventario inventario = Inventario.getInstancia();

        // Adiciona itens ao inventário
        inventario.adicionarItem(new Espada());
        inventario.adicionarItem(new Escudo());
        inventario.adicionarItem(new PocaoVida());
        inventario.adicionarItem(new ChaveAntiga());

        // Inicia a interface gráfica no EDT (Event Dispatch Thread)
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

                // Configurações globais de UI
                UIManager.put("ScrollBar.width", 12);
                UIManager.put("ScrollBar.thumbArc", 999);
                UIManager.put("ScrollBar.thumbInsets", new Insets(2, 2, 2, 2));
                UIManager.put("ScrollBar.track", new Color(240, 240, 240));
                UIManager.put("ScrollBar.thumb", new Color(200, 200, 200));

                new JanelaPrincipal();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
