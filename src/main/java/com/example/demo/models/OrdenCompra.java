package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "orden_compras")
@Data
public class OrdenCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden_com")
    private Integer id_orden_com;

    @Column(name = "id_presupuesto_com")
    private Integer id_presupuesto_com;

    @Column(name = "id_empleado")
    private Integer id_empleado;

    @Column(name = "id_sucursal")
    private Integer id_sucursal;

    @Size(max = 200)
    @Column(name = "observacion")
    private String observacion;

    @Column(name = "fecha")
    private Date fecha;

    @Size(max = 1)
    @Column(name = "estado")
    private String estado;

    @Column(name = "id_condicion")
    private Integer id_condicion;
}
