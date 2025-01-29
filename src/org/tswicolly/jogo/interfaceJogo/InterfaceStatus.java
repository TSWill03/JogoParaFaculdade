package org.tswicolly.jogo.interfaceJogo;
import org.tswicolly.jogo.padroesprojeto.observer.Observador;
import org.tswicolly.jogo.padroesprojeto.singleton.Personagem;

public class InterfaceStatus implements Observador {
    private Personagem personagem;

    public InterfaceStatus(Personagem personagem) {
        this.personagem = personagem;
        this.personagem.adicionarObservador(this); // Registra a interface como observadora
    }

    @Override
    public void atualizar() {
        exibirStatus();
    }

    public void exibirStatus() {
        System.out.println("===== Status do Personagem =====");
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Classe: " + personagem.getClasse());
        System.out.println("Vida: " + personagem.getVida());
        System.out.println("Mana: " + personagem.getMana());
        System.out.println("XP: " + personagem.getXp());
        System.out.println("Nível: " + personagem.getNivel());
        System.out.println("================================");
    }
}