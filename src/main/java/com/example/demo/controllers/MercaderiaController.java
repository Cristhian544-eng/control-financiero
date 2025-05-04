package com.example.demo.controllers;

import com.example.demo.models.Mercaderia;
import com.example.demo.services.MercaderiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mercaderias")
public class MercaderiaController {

    @Autowired
    private MercaderiaService mercaderiaService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("mercaderias", mercaderiaService.listar());
        return "mercaderias/listar";
    }

    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("mercaderia", new Mercaderia());
        return "mercaderias/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Mercaderia mercaderia) {
        mercaderiaService.guardar(mercaderia);
        return "redirect:/mercaderias";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("mercaderia", mercaderiaService.obtenerPorId(id));
        return "mercaderias/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        mercaderiaService.eliminar(id);
        return "redirect:/mercaderias";
    }
}
