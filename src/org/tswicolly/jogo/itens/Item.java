package org.tswicolly.jogo.itens;

import com.google.gson.annotations.Expose;


import java.io.Serializable;

public class Item implements Serializable {
    @Expose private String nome;
    @Expose private ItemType tipo;
    @Expose private SubType subtipo;
    @Expose private String descricao;
    @Expose private Raridade raridade;
    @Expose private String atributos;
    @Expose private String caminhoIcone;

    // Construtor e getters/setters
    public Item(String nome, ItemType tipo, SubType subtipo, String descricao,
                Raridade raridade, String atributos, String caminhoIcone) {
        this.nome = nome;
        this.tipo = tipo;
        this.subtipo = subtipo;
        this.descricao = descricao;
        this.raridade = raridade;
        this.atributos = atributos;
        this.caminhoIcone = caminhoIcone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ItemType getTipo() {
        return tipo;
    }

    public void setTipo(ItemType tipo) {
        this.tipo = tipo;
    }

    public SubType getSubtipo() {
        return subtipo;
    }

    public void setSubtipo(SubType subtipo) {
        this.subtipo = subtipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Raridade getRaridade() {
        return raridade;
    }

    public void setRaridade(Raridade raridade) {
        this.raridade = raridade;
    }

    public String getAtributos() {
        return atributos;
    }

    public void setAtributos(String atributos) {
        this.atributos = atributos;
    }

    public String getCaminhoIcone() {
        return caminhoIcone;
    }

    public void setCaminhoIcone(String caminhoIcone) {
        this.caminhoIcone = caminhoIcone;
    }
}