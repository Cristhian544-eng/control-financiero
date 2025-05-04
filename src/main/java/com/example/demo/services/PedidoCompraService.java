package com.example.demo.services;

import com.example.demo.models.PedidoCompra;
import java.util.List;

public interface PedidoCompraService {
    List<PedidoCompra> listar();
    PedidoCompra guardar(PedidoCompra pedidoCompra);
    PedidoCompra obtenerPorId(Long id);
    void eliminar(Long id);
}
