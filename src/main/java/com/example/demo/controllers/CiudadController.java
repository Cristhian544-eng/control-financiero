package com.example.demo.controllers;

import com.example.demo.models.Ciudad;
import com.example.demo.models.Departamento;
import com.example.demo.services.CiudadService;
import com.example.demo.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ciudades")
public class CiudadController {

    @Autowired
    private CiudadService ciudadService;

    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping
    public String listar(Model model) {
        List<Ciudad> ciudades = ciudadService.listar();
        model.addAttribute("ciudades", ciudades);
        return "ciudades/listar";
    }

    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("ciudad", new Ciudad());
        model.addAttribute("departamentos", departamentoService.listar());
        return "ciudades/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Ciudad ciudad) {
        ciudadService.guardar(ciudad);
        return "redirect:/ciudades";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Ciudad ciudad = ciudadService.obtenerPorId(id);
        model.addAttribute("ciudad", ciudad);
        model.addAttribute("departamentos", departamentoService.listar());
        return "ciudades/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        ciudadService.eliminar(id);
        return "redirect:/ciudades";
    }
}
