package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "marcas")
@Data
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marca")
    private Long id;

    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
}
