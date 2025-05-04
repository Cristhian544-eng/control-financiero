package com.example.demo.controllers;

import com.example.demo.models.PresupuestoCompra;
import com.example.demo.services.PresupuestoCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/presupuestos-compras")
public class PresupuestoCompraController {

    @Autowired
    private PresupuestoCompraService presupuestoCompraService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("lista", presupuestoCompraService.listar());
        return "presupuesto_compra/listar";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("presupuestoCompra", new PresupuestoCompra());
        return "presupuesto_compra/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute PresupuestoCompra presupuestoCompra) {
        presupuestoCompraService.guardar(presupuestoCompra);
        return "redirect:/presupuestos-compras";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        PresupuestoCompra presupuestoCompra = presupuestoCompraService.obtenerPorId(id);
        if (presupuestoCompra != null) {
            model.addAttribute("presupuestoCompra", presupuestoCompra);
            return "presupuesto_compra/formulario";
        } else {
            return "redirect:/presupuestos-compras";
        }
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        presupuestoCompraService.eliminar(id);
        return "redirect:/presupuestos-compras";
    }
}
