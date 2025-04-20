package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.Cliente;

public interface ClienteService {

    List<Cliente> getAllClientes();

    Optional<Cliente> getClienteById(Long id);

    void saveCliente(Cliente cliente);

    void deleteCliente(Long id);
}
