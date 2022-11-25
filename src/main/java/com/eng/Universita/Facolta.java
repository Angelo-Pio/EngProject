package com.eng.Universita;

public class Facolta {
    private String nome;

    public Facolta(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Facolta:" +
                "nome='" + nome + '\'';
    }
}
