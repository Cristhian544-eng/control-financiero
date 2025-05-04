package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "pedido_compra")
@Data
public class PedidoCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido_compra")
    private Long id_pedido_compra;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Size(max = 20)
    @Column(name = "estado")
    private String estado;
}
