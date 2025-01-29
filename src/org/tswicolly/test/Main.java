package org.tswicolly.test;

import org.tswicolly.jogo.interfaceJogo.InterfaceStatus;
import org.tswicolly.jogo.padroesprojeto.singleton.Personagem;

public class Main {
    public static void main(String[] args) {
        // Obtém a instância do personagem
        Personagem personagem = Personagem.getInstancia();

        // Cria a interface de status
        InterfaceStatus interfaceStatus = new InterfaceStatus(personagem);

        // Exibe o status inicial
        interfaceStatus.exibirStatus();

        // Modifica alguns atributos
        personagem.setVida(80);
        personagem.setMana(30);
        personagem.setXp(100);
    }
}