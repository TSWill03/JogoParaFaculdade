package org.tswicolly.test;

import org.tswicolly.jogo.interfacegrafica.JanelaPrincipal;
import org.tswicolly.jogo.itens.ataque.fisico.Espada;
import org.tswicolly.jogo.itens.defesa.escudos.Escudo;
import org.tswicolly.jogo.itens.diversos.chaves.ChaveAntiga;
import org.tswicolly.jogo.itens.suporte.pocoes.vida.PocaoVida;
import org.tswicolly.jogo.padroesprojeto.singleton.Inventario;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Adiciona alguns itens ao inventário
        Inventario inventario = Inventario.getInstancia();
        inventario.adicionarItem(new Espada());
        inventario.adicionarItem(new Escudo());
        inventario.adicionarItem(new PocaoVida());
        inventario.adicionarItem(new ChaveAntiga());
        // Inicia a interface gráfica
        SwingUtilities.invokeLater(() -> new JanelaPrincipal());

    }
}