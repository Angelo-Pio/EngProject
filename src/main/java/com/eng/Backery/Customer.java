package com.eng.Backery;

import com.eng.Backery.Bread.Bread;
import com.eng.Backery.Bread.BreadNotFoundException;

public class Customer	 {
    private String name;
    private String surname;
    private Bread preference;
    private Bakery backery;

    public Customer(String name, String surname, Bread preference, Bakery backery) {
        this.name = name;
        this.surname = surname;
        this.preference = preference;
        this.backery = backery;
    }

    /**
     * Buy usual bread
     */
    public void buy(){
        try {
            backery.sell(preference);
        } catch (BreadNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * Buy a specific type of bread
     * @param bread
     */
    public void buy(Bread bread){
        try {
            backery.sell(bread);
        }catch (BreadNotFoundException b){
            b.printStackTrace();
        }

    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Bread getPreference() {
        return preference;
    }

    public Bakery getBackery() {
        return backery;
    }
}
