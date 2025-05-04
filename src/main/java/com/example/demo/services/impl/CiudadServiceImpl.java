package com.example.demo.services.impl;

import com.example.demo.models.Ciudad;
import com.example.demo.repositories.CiudadRepository;
import com.example.demo.services.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadServiceImpl implements CiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;

    @Override
    public List<Ciudad> listar() {
        return ciudadRepository.findAll();
    }

    @Override
    public Ciudad guardar(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

    @Override
    public Ciudad obtenerPorId(Long id) {
        return ciudadRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        ciudadRepository.deleteById(id);
    }
}
