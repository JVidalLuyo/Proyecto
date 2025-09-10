package pe.edu.clases.proyecto01.service;

import pe.edu.clases.proyecto01.model.Client;
import java.util.List;

public interface ClientService {
    List<Client> findAll();
    Client findById(Long id);
    Client save(Client client);
    Client update(Long id, Client client);
    void deactivate(Long id); 
    void activate(Long id);    
}
