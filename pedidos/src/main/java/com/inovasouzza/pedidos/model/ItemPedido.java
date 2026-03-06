package com.inovasouzza.pedidos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Entity
@Table(name = "item_pedido")
@Getter
@Setter
@NoArgsConstructor
public class ItemPedido {

    //codigo serial not null primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    //codigo_pedido bigint not null references pedido (codigo)
    @Column(name = "codigo_pedido")
    private Long codigoPedido;

    //codigo_produto bigint not null
    @Column(name = "codigo_produto")
    private Long codigoProduto;

    //quantidade int not null
    @Column(name = "quantidade")
    private Integer quantidade;

    //valor_unitario decimal(16,2) not null
    @Column(name = "valor_unitario", precision = 16, scale = 2)
    private BigDecimal valorUnitario;
}
