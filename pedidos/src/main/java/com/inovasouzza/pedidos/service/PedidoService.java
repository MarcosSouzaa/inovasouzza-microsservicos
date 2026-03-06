package com.inovasouzza.pedidos.service;

import com.inovasouzza.pedidos.repository.ItemPedidoRepository;
import com.inovasouzza.pedidos.repository.PedidoRepository;
import com.inovasouzza.pedidos.validator.PedidoValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/*O PedidoService é responsável por receber os dados de um pedido
e persistir no DB além de fazer outras operações, como regra de negócios */
@Service
@RequiredArgsConstructor
public class PedidoService {
    //Vamos usar para salvar o pedido no DB
    private final PedidoRepository repository;

    /*Vamos usar pra salvar os itens dos pedidos dentro da tabela
     os itens do pedido */
    private final ItemPedidoRepository itemPedidoRepository;

    /* Vamos usar para validar os pedidos*/
    private final PedidoValidator validator;
}
