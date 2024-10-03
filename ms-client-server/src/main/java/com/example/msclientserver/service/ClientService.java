package com.example.msclientserver.service;


import com.example.msclientserver.entity.Client;

import java.util.List;
import java.util.Optional;


public interface ClientService {
    public List<Client> list();
    public Optional<Client> getById(Integer Id);
    public Client save(Client client);
    public Client update(Integer Id, Client client);
    public void delete(Integer Id);
}
