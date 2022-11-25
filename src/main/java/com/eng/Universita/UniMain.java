package com.eng.Universita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eng.Universita.Studente.StudenteIscritto;

@SpringBootApplication
public class UniMain {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(UniversitaConfiguration.class);
		
		System.out.println(app.getBean(StudenteIscritto.class).toString());
		
	}

}
