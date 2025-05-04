package com.example.demo.services;

import com.example.demo.models.PresupuestoCompra;
import java.util.List;

public interface PresupuestoCompraService {
    List<PresupuestoCompra> listar();
    PresupuestoCompra guardar(PresupuestoCompra presupuestoCompra);
    PresupuestoCompra obtenerPorId(Integer id);
    void eliminar(Integer id);
}
