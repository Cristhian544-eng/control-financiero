package com.example.demo.controllers;

import com.example.demo.models.TipoImpuesto;
import com.example.demo.services.TipoImpuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tipoimpuestos")
public class TipoImpuestoController {

    @Autowired
    private TipoImpuestoService tipoImpuestoService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("tipoimpuestos", tipoImpuestoService.listar());
        return "tipoimpuestos/listar";
    }

    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("tipoImpuesto", new TipoImpuesto());
        return "tipoimpuestos/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute TipoImpuesto tipoImpuesto) {
        tipoImpuestoService.guardar(tipoImpuesto);
        return "redirect:/tipoimpuestos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("tipoImpuesto", tipoImpuestoService.obtenerPorId(id));
        return "tipoimpuestos/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        tipoImpuestoService.eliminar(id);
        return "redirect:/tipoimpuestos";
    }
}
