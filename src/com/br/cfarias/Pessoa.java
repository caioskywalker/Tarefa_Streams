package com.br.cfarias;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    String nome;
    String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Pessoa(){

    }
    public Pessoa(String nome, String genero){
        this.genero = genero;
        this.nome = nome;

    }

    public List<Pessoa> pessoas(){
        return List.of();

    }

}
