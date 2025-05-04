package com.example.demo.repositories;

import com.example.demo.models.Mercaderia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MercaderiaRepository extends JpaRepository<Mercaderia, Long> {
}
