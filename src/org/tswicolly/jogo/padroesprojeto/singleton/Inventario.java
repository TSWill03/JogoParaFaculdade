package org.tswicolly.jogo.padroesprojeto.singleton;

import org.tswicolly.jogo.itens.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private static Inventario instancia;
    private List<Item> itens;

    private Inventario() {
        itens = new ArrayList<>();
    }

    public static Inventario getInstancia() {
        if (instancia == null) {
            instancia = new Inventario();
        }
        return instancia;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }
}
