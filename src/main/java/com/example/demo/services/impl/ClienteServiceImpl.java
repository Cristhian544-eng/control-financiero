package com.example.demo.services.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Cliente;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.services.ClienteService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getAllClientes() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> getClienteById(Long id) {
        return this.clienteRepository.findById(id);
    }

    @Override
    public void saveCliente(Cliente cliente) {
        if (Objects.nonNull(cliente)) {
            this.clienteRepository.save(cliente);
        }
    }

    @Override
    public void deleteCliente(Long id) {
        if (Objects.nonNull(id)) {
            this.clienteRepository.findById(id)
                .ifPresent(cliente -> this.clienteRepository.delete(cliente));
        }
    }
}
