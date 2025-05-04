package com.example.demo.services;

import com.example.demo.models.TipoImpuesto;
import java.util.List;

public interface TipoImpuestoService {
    List<TipoImpuesto> listar();
    TipoImpuesto guardar(TipoImpuesto tipoImpuesto);
    TipoImpuesto obtenerPorId(Long id);
    void eliminar(Long id);
}
