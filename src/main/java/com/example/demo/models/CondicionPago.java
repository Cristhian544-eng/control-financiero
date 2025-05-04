package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "condicionpago")
@Data
public class CondicionPago {

    @Id
    @Column(name = "id_condicion")
    private Integer id_condicion;

    @Size(max = 50)
    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "cuota")
    private Integer cuota;
}
