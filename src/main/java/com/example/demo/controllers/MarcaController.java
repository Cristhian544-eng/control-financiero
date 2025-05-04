package com.example.demo.controllers;

import com.example.demo.models.Marca;
import com.example.demo.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("marcas", marcaService.listar());
        return "marcas/listar";
    }

    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("marca", new Marca());
        return "marcas/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Marca marca) {
        marcaService.guardar(marca);
        return "redirect:/marcas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("marca", marcaService.obtenerPorId(id));
        return "marcas/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        marcaService.eliminar(id);
        return "redirect:/marcas";
    }
}
