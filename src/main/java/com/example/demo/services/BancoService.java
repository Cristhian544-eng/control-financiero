package com.example.demo.services;

import com.example.demo.models.Banco;
import java.util.List;

public interface BancoService {
    List<Banco> listar();
    Banco guardar(Banco banco);
    Banco obtenerPorId(Long id);
    void eliminar(Long id);
}
