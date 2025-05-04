package com.example.demo.services.impl;

import com.example.demo.models.TipoImpuesto;
import com.example.demo.repositories.TipoImpuestoRepository;
import com.example.demo.services.TipoImpuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoImpuestoServiceImpl implements TipoImpuestoService {

    @Autowired
    private TipoImpuestoRepository tipoImpuestoRepository;

    @Override
    public List<TipoImpuesto> listar() {
        return tipoImpuestoRepository.findAll();
    }

    @Override
    public TipoImpuesto guardar(TipoImpuesto tipoImpuesto) {
        return tipoImpuestoRepository.save(tipoImpuesto);
    }

    @Override
    public TipoImpuesto obtenerPorId(Long id) {
        return tipoImpuestoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        tipoImpuestoRepository.deleteById(id);
    }
}
