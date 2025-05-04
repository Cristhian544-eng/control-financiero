package com.example.demo.controllers;

import com.example.demo.models.Departamento;
import com.example.demo.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping
    public String listar(Model model) {
        List<Departamento> departamentos = departamentoService.listar();
        model.addAttribute("departamentos", departamentos);
        return "departamentos/listar";
    }

    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("departamento", new Departamento());
        return "departamentos/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Departamento departamento) {
        departamentoService.guardar(departamento);
        return "redirect:/departamentos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Departamento departamento = departamentoService.obtenerPorId(id);
        model.addAttribute("departamento", departamento);
        return "departamentos/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        departamentoService.eliminar(id);
        return "redirect:/departamentos";
    }
}
