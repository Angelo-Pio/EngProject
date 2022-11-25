package com.eng.Backery;

import com.eng.Backery.Bread.Bread;
import com.eng.Backery.Bread.BreadNotFoundException;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.*;

/**
 * Bakery class, represents a bakery that sells <class> Bread </class>
 * once bread is sold its information is displayed.
 * selling bread is implemented through <pattern> State Pattern</pattern>
 *s
 * @see Bread
 */
public class Bakery {
    
    private String name;
    private String address;
//  TODO add a Person who is the owner of the bakery

    private List<Bread> avaiableBread = new ArrayList<>();

    public Bakery() {
    }

    //    DI
    public Bakery(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //    this logic should go into a separate service class, but I yet don't know how to
//    set it up correctly, using DI

    public boolean addBread(Bread bread){
        return avaiableBread.add(bread);
    }

    public void printAvaiableBread(){

        StringBuilder seq = new StringBuilder("Types of Brea Avaiable to customers: ");

        for(Bread b : avaiableBread){
            seq.append(b.getClass().toString());
            seq.append("\n");
        }

        System.out.println(seq.toString());

    }

    public void sell(Bread bread) throws BreadNotFoundException {

        if(avaiableBread.contains(bread)){
            bread.handle();
        }else {
            throw new BreadNotFoundException(bread.getClass().toString() +
                                            " not avaiable in" + " " +
                                            this.name +
                                            " backery");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bakery backery = (Bakery) o;
        return Objects.equals(name, backery.name) && Objects.equals(address, backery.address) && Objects.equals(avaiableBread, backery.avaiableBread);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, avaiableBread);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
