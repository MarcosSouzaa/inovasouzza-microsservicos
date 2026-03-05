package com.inovasouzza.clientes.service;

import com.inovasouzza.clientes.model.Cliente;
import com.inovasouzza.clientes.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    //Method cadastrar/salvar cliente
    public Cliente salvar(Cliente cliente ) {
        return repository.save(cliente);
    }

    //Method buscar cliente por código
    public Optional<Cliente>obterPorCodigo(Long codigo) {
        return repository.findById(codigo);
    }
}
