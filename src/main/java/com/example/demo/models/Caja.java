package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "cajas")
public class Caja {

    @Id
    @Column(name = "id_caja")
    private Integer idCaja;

    @Column(name = "descripcion")
    @Size(max = 50)
    private String descripcion;

    public Integer getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
