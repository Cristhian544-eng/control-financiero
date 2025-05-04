package com.example.demo.services.impl;

import com.example.demo.models.CondicionPago;
import com.example.demo.repositories.CondicionPagoRepository;
import com.example.demo.services.CondicionPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CondicionPagoServiceImpl implements CondicionPagoService {

    @Autowired
    private CondicionPagoRepository condicionPagoRepository;

    @Override
    public List<CondicionPago> listar() {
        return condicionPagoRepository.findAll();
    }

    @Override
    public CondicionPago guardar(CondicionPago condicionPago) {
        return condicionPagoRepository.save(condicionPago);
    }

    @Override
    public CondicionPago obtenerPorId(Long id) {
        return condicionPagoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        condicionPagoRepository.deleteById(id);
    }
}
