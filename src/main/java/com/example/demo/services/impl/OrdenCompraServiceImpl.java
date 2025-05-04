package com.example.demo.services.impl;

import com.example.demo.models.OrdenCompra;
import com.example.demo.repositories.OrdenCompraRepository;
import com.example.demo.services.OrdenCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenCompraServiceImpl implements OrdenCompraService {

    @Autowired
    private OrdenCompraRepository ordenCompraRepository;

    @Override
    public List<OrdenCompra> listar() {
        return ordenCompraRepository.findAll();
    }

    @Override
    public OrdenCompra guardar(OrdenCompra ordenCompra) {
        return ordenCompraRepository.save(ordenCompra);
    }

    @Override
    public OrdenCompra obtenerPorId(Integer id) {
        return ordenCompraRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Integer id) {
        ordenCompraRepository.deleteById(id);
    }
}
