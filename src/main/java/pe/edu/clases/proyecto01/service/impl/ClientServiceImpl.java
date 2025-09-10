package pe.edu.clases.proyecto01.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.clases.proyecto01.model.Client;
import pe.edu.clases.proyecto01.repository.ClientRepository;
import pe.edu.clases.proyecto01.service.ClientService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado con id: " + id));
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client update(Long id, Client client) {
        Client existing = findById(id);
        existing.setName(client.getName());
        existing.setEmail(client.getEmail());
        existing.setGender(client.getGender());
        existing.setStatus(client.getStatus());
        return clientRepository.save(existing);
    }

    @Override
    public void deactivate(Long id) {
        Client client = findById(id);
        client.setStatus("I");
        clientRepository.save(client);
    }

    @Override
    public void activate(Long id) {
        Client client = findById(id);
        client.setStatus("A");
        clientRepository.save(client);
    }
}
