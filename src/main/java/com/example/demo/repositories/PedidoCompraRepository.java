package com.example.demo.repositories;

import com.example.demo.models.PedidoCompra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoCompraRepository extends JpaRepository<PedidoCompra, Long> {
}
