package com.eng.Universita;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@ComponentScan(basePackages = {"com.eng.Universita.*"})
@PropertySource("classpath:application.properties")
public class UniversitaConfiguration {


	private @Value("${facolta}") String fac ;
	
//    @Bean
//    public StudenteIscritto studenteIscritto(){
//        StudenteIscritto s = new StudenteIscritto();
//        return s;
//    }

    @Bean
    public Facolta facolta(){
        return new Facolta(fac);
    }

    @Bean
    public Corso corso(){
        return new Corso("Ingegneria informatica");
    }
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer place(){
    	return new PropertySourcesPlaceholderConfigurer();
    }
    





}
