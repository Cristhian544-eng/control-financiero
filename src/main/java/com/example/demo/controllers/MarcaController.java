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

import com.example.demo.models.Marca;
import com.example.demo.services.MarcaService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping(path = "/marca")
@AllArgsConstructor
public class MarcaController {

    private final MarcaService marcaService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("marca", marcaService.getAllMarcas());
        return "marca/listar";
    }

    @GetMapping("/form")
    public String mostrarFormulario(Model model) {
        model.addAttribute("marca", new Marca());
        return "marca/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Marca marca) {
        marcaService.saveMarca(marca);
        return "redirect:/marca";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<Marca> marca = marcaService.getMarcaById(id);

        if (marca.isPresent()) {
            model.addAttribute("marca", marca.get());
            return "marca/formulario";
        }

        return "redirect:/marca";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        marcaService.deleteMarca(id);
        return "redirect:/marca";
    }
}
