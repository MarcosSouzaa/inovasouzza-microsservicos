package com.inovasouzza.clientes.repository;

import com.inovasouzza.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
