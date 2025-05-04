package com.example.demo.controllers;

import com.example.demo.models.Empleado;
import com.example.demo.services.BarrioService;
import com.example.demo.services.EmpleadoService;
import com.example.demo.services.NacionalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @Autowired
    private BarrioService barrioService;

    @Autowired
    private NacionalidadService nacionalidadService;

    @GetMapping
    public String listar(Model model) {
        List<Empleado> empleados = empleadoService.listar();
        model.addAttribute("empleados", empleados);
        return "empleados/listar";
    }

    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("empleado", new Empleado());
        model.addAttribute("barrios", barrioService.listar());
        model.addAttribute("nacionalidades", nacionalidadService.listar());
        return "empleados/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Empleado empleado) {
        empleadoService.guardar(empleado);
        return "redirect:/empleados";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Empleado empleado = empleadoService.obtenerPorId(id);
        model.addAttribute("empleado", empleado);
        model.addAttribute("barrios", barrioService.listar());
        model.addAttribute("nacionalidades", nacionalidadService.listar());
        return "empleados/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        empleadoService.eliminar(id);
        return "redirect:/empleados";
    }
}
