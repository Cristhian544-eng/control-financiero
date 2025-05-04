package com.example.demo.services;

import com.example.demo.models.Timbrado;
import java.util.List;

public interface TimbradoService {
    List<Timbrado> listar();
    Timbrado guardar(Timbrado timbrado);
    Timbrado obtenerPorId(Long id);
    void eliminar(Long id);
}
