package com.example.demo.controllers;

import com.example.demo.models.Barrio;
import com.example.demo.models.Ciudad;
import com.example.demo.services.BarrioService;
import com.example.demo.services.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/barrios")
public class BarrioController {

    @Autowired
    private BarrioService barrioService;

    @Autowired
    private CiudadService ciudadService;

    @GetMapping
    public String listar(Model model) {
        List<Barrio> barrios = barrioService.listar();
        model.addAttribute("barrios", barrios);
        return "barrios/listar";
    }

    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("barrio", new Barrio());
        model.addAttribute("ciudades", ciudadService.listar());
        return "barrios/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Barrio barrio) {
        barrioService.guardar(barrio);
        return "redirect:/barrios";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Barrio barrio = barrioService.obtenerPorId(id);
        model.addAttribute("barrio", barrio);
        model.addAttribute("ciudades", ciudadService.listar());
        return "barrios/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        barrioService.eliminar(id);
        return "redirect:/barrios";
    }
}
