package com.example.demo.controllers;

import com.example.demo.models.Caja;
import com.example.demo.services.CajaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cajas")
public class CajaController {

    @Autowired
    private CajaService cajaService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("cajas", cajaService.listar());
        return "cajas/listar";
    }

    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("caja", new Caja());
        return "cajas/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Caja caja) {
        cajaService.guardar(caja);
        return "redirect:/cajas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        model.addAttribute("caja", cajaService.obtenerPorId(id));
        return "cajas/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        cajaService.eliminar(id);
        return "redirect:/cajas";
    }
}
