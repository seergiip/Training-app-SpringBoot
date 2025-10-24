package com.rgbconsulting.training_app_vSergi;

import com.rgbconsulting.training_app_vSergi.boundary.rest.RestClientRepository;
import com.rgbconsulting.training_app_vSergi.data.model.Client;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.rgbconsulting.training_app_vSergi.data.repository.ClientCrudRepository;


@SpringBootApplication
public class TrainingAppVSergiApplication {

    //private static final Logger log = LoggerFactory.getLogger(TrainingAppVSergiApplication.class);
    
    
    public static void main(String[] args) {
        SpringApplication.run(TrainingAppVSergiApplication.class, args);
    }
    
    /*
    BEAN FOR TESTING
    */
    
    /*@Bean
    public CommandLineRunner demo(ClientJTARepository repository) {
        return (args) -> {
            // save a few customers
            repository.save(new Client("Bauer", 5411531, "bauer@gmail.com", "Carrer Bauer"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            repository.findAll().forEach(customer -> {
                log.info(customer.toString());
            });
            log.info("");

            // fetch an individual customer by ID
            Client customer = repository.findById(212);
            log.info("Customer found with findById(212):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");
        };
    }*/

}
