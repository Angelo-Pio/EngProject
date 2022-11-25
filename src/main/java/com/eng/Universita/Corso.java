package com.eng.Universita;

public class Corso {

    private String nome;

    @Override
    public String toString() {
        return "Corso{" +
                "nome='" + nome + '\'' ;
    }

    public Corso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}
