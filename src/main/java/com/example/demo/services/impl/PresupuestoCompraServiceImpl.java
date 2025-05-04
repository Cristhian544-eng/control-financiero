package com.example.demo.services.impl;

import com.example.demo.models.PresupuestoCompra;
import com.example.demo.repositories.PresupuestoCompraRepository;
import com.example.demo.services.PresupuestoCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresupuestoCompraServiceImpl implements PresupuestoCompraService {

    @Autowired
    private PresupuestoCompraRepository presupuestoCompraRepository;

    @Override
    public List<PresupuestoCompra> listar() {
        return presupuestoCompraRepository.findAll();
    }

    @Override
    public PresupuestoCompra guardar(PresupuestoCompra presupuestoCompra) {
        return presupuestoCompraRepository.save(presupuestoCompra);
    }

    @Override
    public PresupuestoCompra obtenerPorId(Integer id) {
        return presupuestoCompraRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Integer id) {
        presupuestoCompraRepository.deleteById(id);
    }
}
