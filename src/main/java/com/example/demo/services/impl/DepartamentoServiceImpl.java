package com.example.demo.services.impl;

import com.example.demo.models.Departamento;
import com.example.demo.repositories.DepartamentoRepository;
import com.example.demo.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Override
    public List<Departamento> listar() {
        return departamentoRepository.findAll();
    }

    @Override
    public void guardar(Departamento departamento) {
        departamentoRepository.save(departamento);
    }

    @Override
    public Departamento obtenerPorId(Long id) {
        return departamentoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        departamentoRepository.deleteById(id);
    }
}
