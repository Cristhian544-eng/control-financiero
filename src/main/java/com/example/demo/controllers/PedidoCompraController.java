package com.example.demo.controllers;

import com.example.demo.models.PedidoCompra;
import com.example.demo.services.PedidoCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pedidos")
public class PedidoCompraController {

    @Autowired
    private PedidoCompraService pedidoCompraService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("pedidos", pedidoCompraService.listar());
        return "pedidos/listar";
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("pedidoCompra", new PedidoCompra());
        return "pedidos/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute PedidoCompra pedidoCompra) {
        pedidoCompraService.guardar(pedidoCompra);
        return "redirect:/pedidos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        PedidoCompra pedidoCompra = pedidoCompraService.obtenerPorId(id);
        model.addAttribute("pedidoCompra", pedidoCompra);
        return "pedidos/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        pedidoCompraService.eliminar(id);
        return "redirect:/pedidos";
    }
}
