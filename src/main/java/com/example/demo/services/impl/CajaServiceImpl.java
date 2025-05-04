package com.example.demo.services.impl;

import com.example.demo.models.Caja;
import com.example.demo.repositories.CajaRepository;
import com.example.demo.services.CajaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CajaServiceImpl implements CajaService {

    @Autowired
    private CajaRepository cajaRepository;

    @Override
    public List<Caja> listar() {
        return cajaRepository.findAll();
    }

    @Override
    public Caja guardar(Caja caja) {
        return cajaRepository.save(caja);
    }

    @Override
    public Caja obtenerPorId(Integer id) {
        return cajaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Integer id) {
        cajaRepository.deleteById(id);
    }
}
