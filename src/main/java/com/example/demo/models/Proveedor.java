package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "proveedor")
@Data
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;

    @Size(max = 20)
    @Column(name = "ruc")
    private String ruc;

    @Size(max = 150)
    @Column(name = "direccion")
    private String direccion;

    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;
}
