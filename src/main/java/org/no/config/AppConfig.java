package org.no.config;

import org.no.beans.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.no.beans")
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Bean
    public Person person(@Value("${firstName}") String firstName, @Value("${lastName}") String lastName) {
        return new Person(firstName, lastName);
    }
}
