package com.example.demo.controllers;

import com.example.demo.models.Pais;
import com.example.demo.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/paises")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping
    public String listar(Model model) {
        List<Pais> paises = paisService.listar();
        model.addAttribute("paises", paises);
        return "paises/listar";
    }

    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("pais", new Pais());
        return "paises/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Pais pais) {
        paisService.guardar(pais);
        return "redirect:/paises";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Pais pais = paisService.obtenerPorId(id);
        model.addAttribute("pais", pais);
        return "paises/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        paisService.eliminar(id);
        return "redirect:/paises";
    }
}
