package com.example.demo.services;

import com.example.demo.models.CondicionPago;
import java.util.List;

public interface CondicionPagoService {
    List<CondicionPago> listar();
    CondicionPago guardar(CondicionPago condicionPago);
    CondicionPago obtenerPorId(Long id);
    void eliminar(Long id);
}
