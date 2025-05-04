package com.example.demo.services.impl;

import com.example.demo.models.Mercaderia;
import com.example.demo.repositories.MercaderiaRepository;
import com.example.demo.services.MercaderiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MercaderiaServiceImpl implements MercaderiaService {

    @Autowired
    private MercaderiaRepository mercaderiaRepository;

    @Override
    public List<Mercaderia> listar() {
        return mercaderiaRepository.findAll();
    }

    @Override
    public Mercaderia guardar(Mercaderia mercaderia) {
        return mercaderiaRepository.save(mercaderia);
    }

    @Override
    public Mercaderia obtenerPorId(Long id) {
        return mercaderiaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        mercaderiaRepository.deleteById(id);
    }
}
