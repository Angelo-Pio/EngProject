package com.eng.Backery.Bread;

import com.eng.Backery.Cooking.CookingBread;

public class ToastBread extends Bread implements CookingBread{

    public ToastBread(String date, Flour flour) {
        super(date, flour);
    }

    @Override
    public void handle() {
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToastBread bread = (ToastBread) o;
        return this.getDate().equals(bread.getDate()) && getFlour() == bread.getFlour();
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Type: " + this.getClass().toString();
    }
    
	@Override
	public void wellCooked() {
		// TODO Auto-generated method stub
		System.out.println("You ordered a well cooked Toast Bread" );
	}

	@Override
	public void burned() {
		// TODO Auto-generated method stub
		System.out.println("You ordered a burned Toast Bread" );
		
	}
}
