package com.example.msclientservice.service.impl;


import com.example.msclientservice.entity.Client;
import com.example.msclientservice.repository.ClientRepository;
import com.example.msclientservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository ClientRepository;
    @Override
    public List<Client> list() {
        return ClientRepository.findAll();
    }

    @Override
    public Optional<Client> getById(Integer Id) {
        return ClientRepository.findById(Id);
    }

    @Override
    public Client save(Client Client) {
        return ClientRepository.save(Client);
    }

    @Override
    public Client update(Integer Id, Client Client) {
        Client.setId(Id);
        return ClientRepository.save(Client);
    }

    @Override
    public void delete(Integer Id) {
        ClientRepository.deleteById(Id);
    }
}
