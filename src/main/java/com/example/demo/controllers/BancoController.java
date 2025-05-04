package com.example.demo.controllers;

import com.example.demo.models.Banco;
import com.example.demo.services.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bancos")
public class BancoController {

    @Autowired
    private BancoService bancoService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("bancos", bancoService.listar());
        return "bancos/listar";
    }

    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("banco", new Banco());
        return "bancos/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Banco banco) {
        bancoService.guardar(banco);
        return "redirect:/bancos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("banco", bancoService.obtenerPorId(id));
        return "bancos/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        bancoService.eliminar(id);
        return "redirect:/bancos";
    }
}
