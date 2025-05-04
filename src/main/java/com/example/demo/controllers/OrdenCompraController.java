package com.example.demo.controllers;

import com.example.demo.models.OrdenCompra;
import com.example.demo.services.OrdenCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ordenes")
public class OrdenCompraController {

    @Autowired
    private OrdenCompraService ordenCompraService;

    @GetMapping
    public String listar(Model modelo) {
        modelo.addAttribute("lista", ordenCompraService.listar());
        return "ordenes/listar";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model modelo) {
        modelo.addAttribute("ordenCompra", new OrdenCompra());
        return "ordenes/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute OrdenCompra ordenCompra) {
        ordenCompraService.guardar(ordenCompra);
        return "redirect:/ordenes";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model modelo) {
        OrdenCompra ordenCompra = ordenCompraService.obtenerPorId(id);
        if (ordenCompra != null) {
            modelo.addAttribute("ordenCompra", ordenCompra);
            return "ordenes/formulario";
        } else {
            return "redirect:/ordenes";
        }
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        ordenCompraService.eliminar(id);
        return "redirect:/ordenes";
    }
}
