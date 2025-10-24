package com.rgbconsulting.training_app_vSergi.boundary.rest;

import com.rgbconsulting.training_app_vSergi.data.model.Client;
import java.util.List;
import org.springframework.stereotype.Service;
import com.rgbconsulting.training_app_vSergi.data.repository.ClientCrudRepository;

/**
 *
 * @author sergi
 */

@Service
public class RestClientRepository {

    private final ClientCrudRepository clientRepository;

    public RestClientRepository(ClientCrudRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClients() {
        return (List<Client>) clientRepository.findAll();
    }
}