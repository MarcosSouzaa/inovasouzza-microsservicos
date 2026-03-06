package com.inovasouzza.pedidos.model;

import com.inovasouzza.pedidos.model.enums.StatusPedido;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedido")
@Getter
@Setter
@NoArgsConstructor
public class Pedido {

    // codigo serial not null primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    //codigo_cliente bigint not null
    @Column(name = "codigo-cliente", nullable = false)
    private Long codigoCliente;

    //data_pedido timestamp not null default now()
    @Column(name = "data-pedido", nullable = false)
    private LocalDateTime dataPedido;


    @Column(name = "total", precision = 16, scale = 2)
    private BigDecimal total;

    //chave_pagamento text,
    @Column(name = "chave-pagamento")
    private String chavePagamento;

    //observacoes text,
    @Column(name = "observacoes")
    private String observacoes;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    //codigo_rastreio varchar(255)
    private String codigoRastreio;

    // url_nf text
    private String urlNotaFiscal;
}
