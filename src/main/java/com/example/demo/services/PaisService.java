package com.example.demo.services;

import com.example.demo.models.Pais;
import java.util.List;

public interface PaisService {
    List<Pais> listar();
    Pais guardar(Pais pais);
    Pais obtenerPorId(Long id);
    void eliminar(Long id);
}
