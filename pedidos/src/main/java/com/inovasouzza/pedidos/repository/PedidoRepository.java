package com.inovasouzza.pedidos.repository;

import com.inovasouzza.pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository <Pedido, Long>  {
}
