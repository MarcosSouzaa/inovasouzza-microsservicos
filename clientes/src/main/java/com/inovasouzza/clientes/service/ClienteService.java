package com.inovasouzza.clientes.service;

import com.inovasouzza.clientes.model.Cliente;
import com.inovasouzza.clientes.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<Cliente> listarTodos() {
        return repository.findAll(); // O JpaRepository já fornece esse method pronto
    }
}
