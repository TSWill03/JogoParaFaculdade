package org.tswicolly.jogo.itens;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorItens {
    private static final String ARQUIVO_ITENS = "itens.json";
    private static final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .excludeFieldsWithoutExposeAnnotation()
            .create();

    public static void salvarItem(Item novoItem) {
        List<Item> itens = carregarItens();
        itens.add(novoItem);

        try (Writer writer = new FileWriter(ARQUIVO_ITENS)) {
            gson.toJson(itens, writer);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar item: " + e.getMessage());
        }
    }

    public static List<Item> carregarItens() {
        File file = new File(ARQUIVO_ITENS);
        if (!file.exists()) return new ArrayList<>();

        try (Reader reader = new FileReader(file)) {
            return gson.fromJson(reader, new TypeToken<List<Item>>(){}.getType());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar itens: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}