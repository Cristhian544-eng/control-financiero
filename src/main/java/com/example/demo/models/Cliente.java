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
@Table(name = "clientes")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id;

    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;

    @Size(max = 20)
    @Column(name = "documento")
    private String documento;

    @Size(max = 100)
    @Column(name = "email")
    private String email;
    
    @Size(max = 15)
    @Column(name = "telefono")
    private String telefono;

    // Puedes agregar más campos según lo que esté definido en la tabla `clientes`
}
