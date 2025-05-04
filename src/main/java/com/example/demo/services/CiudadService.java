package com.example.demo.services;

import com.example.demo.models.Ciudad;
import java.util.List;

public interface CiudadService {
    List<Ciudad> listar();
    Ciudad guardar(Ciudad ciudad);
    Ciudad obtenerPorId(Long id);
    void eliminar(Long id);
}
