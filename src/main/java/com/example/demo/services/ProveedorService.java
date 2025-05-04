package com.example.demo.services;

import com.example.demo.models.Proveedor;
import java.util.List;

public interface ProveedorService {
    List<Proveedor> listar();
    Proveedor guardar(Proveedor proveedor);
    Proveedor obtenerPorId(Long id);
    void eliminar(Long id);
}
