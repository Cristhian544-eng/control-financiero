package com.example.demo.controllers;

import com.example.demo.models.CondicionPago;
import com.example.demo.services.CondicionPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/condicionespago")
public class CondicionPagoController {

    @Autowired
    private CondicionPagoService condicionPagoService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("condicionespago", condicionPagoService.listar());
        return "condicionespago/listar";
    }

    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("condicionPago", new CondicionPago());
        return "condicionespago/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute CondicionPago condicionPago) {
        condicionPagoService.guardar(condicionPago);
        return "redirect:/condicionespago";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("condicionPago", condicionPagoService.obtenerPorId(id));
        return "condicionespago/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        condicionPagoService.eliminar(id);
        return "redirect:/condicionespago";
    }
}
