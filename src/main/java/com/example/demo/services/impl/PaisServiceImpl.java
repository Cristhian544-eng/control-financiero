package com.example.demo.services.impl;

import com.example.demo.models.Pais;
import com.example.demo.repositories.PaisRepository;
import com.example.demo.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> listar() {
        return paisRepository.findAll();
    }

    @Override
    public Pais guardar(Pais pais) {
        return paisRepository.save(pais);
    }

    @Override
    public Pais obtenerPorId(Long id) {
        return paisRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        paisRepository.deleteById(id);
    }
}
