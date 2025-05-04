package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "mercaderias")
@Data
public class Mercaderia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mercaderia")
    private Long id_mercaderia;

    @ManyToOne
    @JoinColumn(name = "id_marca", referencedColumnName = "id_marca", nullable = false)
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "id_tipo_impuesto", referencedColumnName = "id_tipo_impuesto", nullable = false)
    private TipoImpuesto tipoImpuesto;

    @Column(name = "id_procedencia")
    private Integer id_procedencia; // No se especifica la relación, podría ser un país más adelante.

    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;

    @Size(max = 1)
    @Column(name = "afecta_existencia")
    private String afecta_existencia;

    @Column(name = "precio_compra")
    private BigDecimal precio_compra;

    @Column(name = "precio_venta")
    private BigDecimal precio_venta;
}
