package com.example.demo.services;

import com.example.demo.models.Barrio;
import java.util.List;

public interface BarrioService {
    List<Barrio> listar();
    Barrio guardar(Barrio barrio);
    Barrio obtenerPorId(Long id);
    void eliminar(Long id);
}
