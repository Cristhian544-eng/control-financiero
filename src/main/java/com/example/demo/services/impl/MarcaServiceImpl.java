package com.example.demo.services.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Marca;
import com.example.demo.repositories.MarcaRepository;
import com.example.demo.services.MarcaService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MarcaServiceImpl implements MarcaService {

    private final MarcaRepository marcaRepository;

    @Override
    public List<Marca> getAllMarcas() {
        return this.marcaRepository.findAll();
    }

    @Override
    public Optional<Marca> getMarcaById(Long id) {
        return this.marcaRepository.findById(id);
    }

    @Override
    public void saveMarca(Marca marca) {
        if (Objects.nonNull(marca)) {
            this.marcaRepository.save(marca);
        }
    }

    @Override
    public void deleteMarca(Long id) {
        if (Objects.nonNull(id)) {
            this.marcaRepository.findById(id)
                .ifPresent(m -> this.marcaRepository.delete(m));
        }
    }
}
