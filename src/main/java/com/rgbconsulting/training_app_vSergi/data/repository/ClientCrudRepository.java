package com.rgbconsulting.training_app_vSergi.data.repository;

import org.springframework.data.repository.CrudRepository;
import com.rgbconsulting.training_app_vSergi.data.model.Client;

/**
 *
 * @author sergi
 */
public interface ClientCrudRepository extends CrudRepository<Client, Long> {
    //CRUD A PARTIR DEL FRAMEWORK DE SPRING BOOT
    
    Client findById(long id);
}
