package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "nacionalidades")
public class Nacionalidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nacionalidad")
    private Long idNacionalidad;

    @Size(max = 80)
    @Column(name = "descripcion")
    private String descripcion;

    // Getters y Setters
    public Long getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Long idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
