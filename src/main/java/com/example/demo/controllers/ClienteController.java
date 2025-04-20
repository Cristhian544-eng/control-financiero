package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Cliente;
import com.example.demo.services.ClienteService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping(path = "/cliente")
@AllArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("cliente", clienteService.getAllClientes());
        return "cliente/listar";
    }

    @GetMapping("/form")
    public String mostrarFormulario(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "cliente/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Cliente cliente) {
        clienteService.saveCliente(cliente);
        return "redirect:/cliente";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {

        Optional<Cliente> cliente = clienteService.getClienteById(id);

        if (cliente.isPresent()) {
            model.addAttribute("cliente", cliente.get());
            return "cliente/formulario";
        }

        return "redirect:/cliente";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        clienteService.deleteCliente(id);
        return "redirect:/cliente";
    }
}
