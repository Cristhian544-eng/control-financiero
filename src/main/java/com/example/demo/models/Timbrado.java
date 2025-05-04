package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "timbrado")
@Data
public class Timbrado {

    @Id
    @Column(name = "id_timbrado")
    private Integer id_timbrado;

    @Column(name = "nro_desde")
    private Integer nro_desde;

    @Column(name = "nro_hasta")
    private Integer nro_hasta;

    @Column(name = "nro3")
    private Integer nro3;

    @Column(name = "nro_timbrado")
    private Integer nro_timbrado;

    @Column(name = "fecha_inicio")
    private LocalDate fecha_inicio;

    @Column(name = "fecha_fin")
    private LocalDate fecha_fin;

    @ManyToOne
    @JoinColumn(name = "id_tipo_impuesto", referencedColumnName = "id_tipo_impuesto", nullable = false)
    private TipoImpuesto tipo_impuesto;

    @Column(name = "nro1")
    private Integer nro1;

    @Column(name = "nro2")
    private Integer nro2;

    @Column(name = "estado")
    private String estado;
}
