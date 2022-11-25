package com.eng.Universita;

import com.eng.Universita.Studente.StudenteIscritto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.boot.context.properties.bind.PropertySourcesPlaceholdersResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = {"com.eng.Universita.*"})
@PropertySource(value = "classpath:/com/eng/Universita/uni.properties")
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
