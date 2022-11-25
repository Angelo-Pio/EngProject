package com.eng.Universita.Studente;

public class StudenteFuturo extends Studente {

    private String TOLC;

    public StudenteFuturo(String ID, String cognome, String TOLC) {
        super(ID, cognome);
        this.TOLC = TOLC;
    }

    public String getTOLC() {
        return TOLC;
    }
}
