package com.rgbconsulting.training_app_vSergi.boundary.controller;

import com.rgbconsulting.training_app_vSergi.boundary.rest.RestClientRepository;
import com.rgbconsulting.training_app_vSergi.data.model.Client;
import java.util.List;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author sergi
 */

@RestController
public class RestClientRepositoryController {

    private final RestClientRepository myService;

    public RestClientRepositoryController(RestClientRepository myService) {
        this.myService = myService;
    }

    @GetMapping("/training-app-springboot/api/jta/client")
    public List<Client> getAllClients() {
        return myService.getAllClients();
    }
    
    @PostMapping("/training-app-springboot/api/jta/client")
    public void insertClient(@RequestBody Client client) {
        client.setId(null);
        this.myService.insertClient(client);
    }
    
    @PutMapping("/training-app-springboot/api/jta/client")
    public void updateClient(@RequestBody Client client) {
        this.myService.updateClient(client);
    }
    
    @DeleteMapping("/training-app-springboot/api/jta/client/id/{id}")
    public void deleteClientByid(@PathVariable long id) {
        this.myService.deleteClientByid(id);
    }   
}