package com.example.demo.services.impl;

import com.example.demo.models.Timbrado;
import com.example.demo.repositories.TimbradoRepository;
import com.example.demo.services.TimbradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimbradoServiceImpl implements TimbradoService {

    @Autowired
    private TimbradoRepository timbradoRepository;

    @Override
    public List<Timbrado> listar() {
        return timbradoRepository.findAll();
    }

    @Override
    public Timbrado guardar(Timbrado timbrado) {
        return timbradoRepository.save(timbrado);
    }

    @Override
    public Timbrado obtenerPorId(Long id) {
        return timbradoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        timbradoRepository.deleteById(id);
    }
}
