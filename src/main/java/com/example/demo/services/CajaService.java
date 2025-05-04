package com.example.demo.services;

import com.example.demo.models.Caja;
import java.util.List;

public interface CajaService {
    List<Caja> listar();
    Caja guardar(Caja caja);
    Caja obtenerPorId(Integer id);
    void eliminar(Integer id);
}
