package com.example.demo.services;

import com.example.demo.models.Cliente;
import java.util.List;

public interface ClienteService {
    List<Cliente> listar();
    Cliente guardar(Cliente cliente);
    Cliente obtenerPorId(Long id);
    void eliminar(Long id);
}
