package com.example.demo.services;

import com.example.demo.models.Departamento;

import java.util.List;

public interface DepartamentoService {
    List<Departamento> listar();
    void guardar(Departamento departamento);
    Departamento obtenerPorId(Long id);
    void eliminar(Long id);
}
