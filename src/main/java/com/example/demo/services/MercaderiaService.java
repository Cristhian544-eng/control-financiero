package com.example.demo.services;

import com.example.demo.models.Mercaderia;
import java.util.List;

public interface MercaderiaService {
    List<Mercaderia> listar();
    Mercaderia guardar(Mercaderia mercaderia);
    Mercaderia obtenerPorId(Long id);
    void eliminar(Long id);
}
