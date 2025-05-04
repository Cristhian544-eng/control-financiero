package com.example.demo.services;

import com.example.demo.models.Marca;
import java.util.List;

public interface MarcaService {
    List<Marca> listar();
    Marca guardar(Marca marca);
    Marca obtenerPorId(Long id);
    void eliminar(Long id);
}
