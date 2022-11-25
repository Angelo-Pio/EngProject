package com.eng.Backery;

import com.eng.Backery.Bread.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BackeryMain extends SpringBootServletInitializer {
    public static void main(String[] args) {

        SpringApplication.run(BackeryMain.class,args);


        Bakery backery = new Bakery("Biscottificio Innocenti","Via della Luce 21");

        ToastBread b1 = new ToastBread("Today", Flour.WHITE);
        ClassicBread b2 = new ClassicBread("Yesterday",Flour.WHOLEWHEAT);
        BaguetteBread b3 = new BaguetteBread("This Morning",Flour.WHOLEWHEAT);

        backery.addBread(b1);
        backery.addBread(b2);
        backery.addBread(b3);

        Customer customer = new Customer("Angelo","Pompeo",b1,backery);

        customer.buy();
        customer.buy(b2);
        customer.buy(b3);

    }
}
