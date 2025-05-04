package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "banco")
@Data
public class Banco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_banco")
    private Long id_banco;

    @Size(max = 50)
    @Column(name = "descripcion")
    private String descripcion;

    @Size(max = 15)
    @Column(name = "telefono")
    private String telefono;

    @Size(max = 200)
    @Column(name = "direccion")
    private String direccion;
}
