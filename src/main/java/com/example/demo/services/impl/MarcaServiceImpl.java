package com.example.demo.services.impl;

import com.example.demo.models.Marca;
import com.example.demo.repositories.MarcaRepository;
import com.example.demo.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServiceImpl implements MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    @Override
    public List<Marca> listar() {
        return marcaRepository.findAll();
    }

    @Override
    public Marca guardar(Marca marca) {
        return marcaRepository.save(marca);
    }

    @Override
    public Marca obtenerPorId(Long id) {
        return marcaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        marcaRepository.deleteById(id);
    }
}
