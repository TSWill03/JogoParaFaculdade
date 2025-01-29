package org.tswicolly.jogo.itens;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorItens {
    private static final String ARQUIVO_ITENS = "itens.json";

    public static void salvarItem(Item item) {
        List<Item> itens = carregarItens();
        itens.add(item);

        try (Writer writer = new FileWriter(ARQUIVO_ITENS)) {
            new Gson().toJson(itens, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Item> carregarItens() {
        File file = new File(ARQUIVO_ITENS);
        if(!file.exists()) return new ArrayList<>();

        try (Reader reader = new FileReader(file)) {
            return new Gson().fromJson(reader, new TypeToken<List<Item>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}