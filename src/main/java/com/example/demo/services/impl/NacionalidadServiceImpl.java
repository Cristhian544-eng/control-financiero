package com.example.demo.services.impl;

import com.example.demo.models.Nacionalidad;
import com.example.demo.repositories.NacionalidadRepository;
import com.example.demo.services.NacionalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NacionalidadServiceImpl implements NacionalidadService {

    @Autowired
    private NacionalidadRepository nacionalidadRepository;

    @Override
    public List<Nacionalidad> listar() {
        return nacionalidadRepository.findAll();
    }
}
