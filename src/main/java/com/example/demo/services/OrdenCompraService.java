package com.example.demo.services;

import com.example.demo.models.OrdenCompra;
import java.util.List;

public interface OrdenCompraService {
    List<OrdenCompra> listar();
    OrdenCompra guardar(OrdenCompra ordenCompra);
    OrdenCompra obtenerPorId(Integer id);
    void eliminar(Integer id);
}
