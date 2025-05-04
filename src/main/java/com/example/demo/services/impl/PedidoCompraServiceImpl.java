package com.example.demo.services.impl;

import com.example.demo.models.PedidoCompra;
import com.example.demo.repositories.PedidoCompraRepository;
import com.example.demo.services.PedidoCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoCompraServiceImpl implements PedidoCompraService {

    @Autowired
    private PedidoCompraRepository pedidoCompraRepository;

    @Override
    public List<PedidoCompra> listar() {
        return pedidoCompraRepository.findAll();
    }

    @Override
    public PedidoCompra guardar(PedidoCompra pedidoCompra) {
        return pedidoCompraRepository.save(pedidoCompra);
    }

    @Override
    public PedidoCompra obtenerPorId(Long id) {
        return pedidoCompraRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        pedidoCompraRepository.deleteById(id);
    }
}
