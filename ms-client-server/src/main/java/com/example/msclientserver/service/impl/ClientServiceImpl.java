package com.example.msclientserver.service.impl;

import com.example.msclientserver.entity.Client;
import com.example.msclientserver.repository.ClientRepository;
import com.example.msclientserver.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Override
    public List<Client> list() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getById(Integer Id) {
        return clientRepository.findById(Id);
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client update(Integer Id, Client client) {
        client.setId(Id);
        return clientRepository.save(client);
    }

    @Override
    public void delete(Integer Id) {
        clientRepository.deleteById(Id);
    }
}
