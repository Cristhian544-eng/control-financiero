package com.example.demo.controllers;

import com.example.demo.models.Timbrado;
import com.example.demo.services.TimbradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/timbrados")
public class TimbradoController {

    @Autowired
    private TimbradoService timbradoService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("timbrados", timbradoService.listar());
        return "timbrados/listar";
    }

    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("timbrado", new Timbrado());
        return "timbrados/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Timbrado timbrado) {
        timbradoService.guardar(timbrado);
        return "redirect:/timbrados";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("timbrado", timbradoService.obtenerPorId(id));
        return "timbrados/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        timbradoService.eliminar(id);
        return "redirect:/timbrados";
    }
}
