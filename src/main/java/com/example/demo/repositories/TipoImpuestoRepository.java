package com.example.demo.repositories;

import com.example.demo.models.TipoImpuesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoImpuestoRepository extends JpaRepository<TipoImpuesto, Long> {
}
