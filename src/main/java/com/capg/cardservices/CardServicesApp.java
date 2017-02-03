package com.capg.cardservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sujillel
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class CardServicesApp {

    public static void main(String[] args) {
        SpringApplication.run(CardServicesApp.class, args);
    }
}

