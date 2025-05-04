package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id_cliente;

    @ManyToOne
    @JoinColumn(name = "id_barrio", referencedColumnName = "id_barrio", nullable = false)
    private Barrio barrio;

    @Size(max = 100)
    @Column(name = "razon_social")
    private String razon_social;

    @Size(max = 20)
    @Column(name = "ruc")
    private String ruc;

    @Size(max = 100)
    @Column(name = "direccion")
    private String direccion;

    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;

    @Size(max = 50)
    @Column(name = "email")
    private String email;

    @Column(name = "tipo_cliente")
    private String tipo_cliente;
}
