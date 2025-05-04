package com.example.demo.services;

import com.example.demo.models.Empleado;
import java.util.List;

public interface EmpleadoService {
    List<Empleado> listar();
    Empleado guardar(Empleado empleado);
    Empleado obtenerPorId(Long id);
    void eliminar(Long id);
}
