package com.eng.Backery.Bread;


import java.util.Objects;

/**
 * Bread class, represents bread
 */
public abstract class Bread {

    private final String date;
    private final Flour flour;

    public Bread(String date, Flour flour) {
        this.date = date;
        this.flour = flour;
    }

    public String getDate() {
        return date;
    }

    public Flour getFlour() {
        return flour;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "date='" + date + '\'' +
                ", flour=" + flour +
                '}';
    }

    public abstract void handle();



    @Override
    public int hashCode() {
        return Objects.hash(date, flour);
    }
}

