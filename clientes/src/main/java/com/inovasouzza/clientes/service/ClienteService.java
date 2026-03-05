package com.inovasouzza.clientes.service;

import com.inovasouzza.clientes.model.Cliente;
import com.inovasouzza.clientes.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    //Method cadastrar/salvar cliente
    @Transactional // Garante que o banco sincronize na hora
    public Cliente salvar(Cliente cliente ) {
        return repository.save(cliente);
    }

    @Transactional(readOnly = true) // Leitura otimizada
    //Method buscar cliente por código
    public Optional<Cliente>obterPorCodigo(Long codigo) {
        return repository.findById(codigo);
    }

    @Transactional(readOnly = true) // Leitura otimizada
    public List<Cliente> listarTodos() {
        return repository.findAll(); // O JpaRepository já fornece esse method pronto
    }

    // Method Atualizar
    @Transactional // Escrita'
    public Cliente atualizar(Cliente cliente) {
        return repository.save(cliente);
    }

    // Method Deletar
    @Transactional // Escrita
    public void deletar(Long codigo) {
        repository.deleteById(codigo);
    }
}
