package com.eng;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.eng.Universita.UniversitaConfiguration;
import com.eng.Universita.Studente.StudenteIscritto;

@SpringBootApplication
@ComponentScan("com.eng")
@EntityScan(basePackages = { "com.eng" })
@EnableJpaRepositories(basePackages = { "com.eng" })
@Configuration
@EnableAspectJAutoProxy
@PropertySource("classpath:application.properties")
@EnableScheduling


public class UniMain {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(UniversitaConfiguration.class);
		
		System.out.println(app.getBean(StudenteIscritto.class).toString());
		
	}

}
