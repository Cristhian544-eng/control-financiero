package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "empleados")
@Data
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Long id_empleado;

    @Size(max = 15)
    @Column(name = "legajo")
    private String legajo;

    @ManyToOne
    @JoinColumn(name = "id_barrio", referencedColumnName = "id_barrio", nullable = false)
    private Barrio barrio;

    @Column(name = "id_nacionalidad", nullable = false)
    private Integer id_nacionalidad;

    @Column(name = "id_usuario", nullable = false)
    private Integer id_usuario;

    @Column(name = "id_estado_civil", nullable = false)
    private Integer id_estado_civil;

    @Size(max = 50)
    @Column(name = "nombres")
    private String nombres;

    @Size(max = 50)
    @Column(name = "apellidos")
    private String apellidos;

    @Size(max = 20)
    @Column(name = "cedula_identidad")
    private String cedulaIdentidad;

    @Column(name = "fecha_nac")
    private LocalDate fechaNacimiento;

    @Column(name = "sexo", columnDefinition = "bpchar(1)")
    private String sexo;

    @Column(name = "estado", columnDefinition = "bpchar(1)")
    private String estado;

    @Column(name = "fecha_incorporacion")
    private LocalDate fechaIncorporacion;

    @Size(max = 100)
    @Column(name = "direccion")
    private String direccion;

    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;

    @Size(max = 50)
    @Column(name = "email")
    private String email;
}
