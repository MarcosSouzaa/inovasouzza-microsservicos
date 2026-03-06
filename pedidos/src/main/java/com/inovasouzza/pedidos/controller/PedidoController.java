package com.inovasouzza.pedidos.controller;

import com.inovasouzza.pedidos.controller.dto.NovoPedidoDTO;
import com.inovasouzza.pedidos.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PedidoController {
    // injeção do meu service
    private final PedidoService service;

    //Method Criar
    public ResponseEntity criar(@RequestBody NovoPedidoDTO dto){
         return null;
    }
}
