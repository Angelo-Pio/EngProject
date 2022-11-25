package com.eng.Universita.Studente;

import com.eng.Universita.Corso;
import com.eng.Universita.Facolta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component
public class StudenteIscritto extends Studente{

    private String passwordInfostud;

    @Autowired
    private Facolta facolta;

    @Autowired
    private Corso corso;
    
    @Autowired(required = true)
    public StudenteIscritto(Facolta facolta , Corso corso) {
    	this.corso = corso ; this.facolta = facolta;
    }
    
    public StudenteIscritto() {
    	super();
    }
       
    public void setPasswordInfostud(String passwordInfostud) {
        this.passwordInfostud = passwordInfostud;
    }

    public String getPasswordInfostud() {
        return passwordInfostud;
    }

    public Facolta getFacolta() {
        return facolta;
    }

    public Corso getCorso() {
        return corso;
    }

    @Override
    public String toString() {

        return super.toString() +
                "facolta=" + facolta +
                ", corso=" + corso ;
    }

}
