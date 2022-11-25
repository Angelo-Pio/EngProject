package com.eng.Universita.Studente;

public abstract class Studente{

    private String ID;
    private String cognome;

    public Studente() {

    }
    
    public Studente(String ID, String cognome) {
        this.ID = ID;
        this.cognome = cognome;
    }
    

    public String getID() {
        return ID;
    }

    public String getCognome() {
        return cognome;
    }

    @Override
    public String toString() {
        return "Studente: " +
                "ID='" + ID + '\'' +
                ", cognome='" + cognome + '\'' ;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
