package com.inovasouzza.clientes.controller;

import com.inovasouzza.clientes.model.Cliente;
import com.inovasouzza.clientes.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;

    // Method Cadastrar/Salvar
    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente) {
        // Salve e pegue o objeto atualizado que o banco devolve
        Cliente clienteSalvo = service.salvar(cliente);
        return ResponseEntity.ok(clienteSalvo);
    }

    // Method OBTER DADOS
    @GetMapping("{codigo}")
    public ResponseEntity<Cliente> obterDados(@PathVariable("codigo")Long codigo) {
        return service
                .obterPorCodigo(codigo)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());    }

    // Method LISTAR TODOS
    @GetMapping
    public ResponseEntity<List<Cliente>> listarTodos() {
        List<Cliente> clientes = service.listarTodos();
        return ResponseEntity.ok(clientes);
    }

    // Method ATUALIZAR
    @PutMapping("{codigo}")
    public ResponseEntity<Cliente> atualizar(@PathVariable("codigo") Long codigo, @RequestBody Cliente cliente) {
        return service.obterPorCodigo(codigo).map(clienteExistente -> {
            cliente.setCodigo(codigo); // Garante que o ID da URL seja o mesmo do objeto
            service.atualizar(cliente);
            return ResponseEntity.ok(cliente);
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Method DELETAR
    @DeleteMapping("{codigo}")
    public ResponseEntity<Void> deletar(@PathVariable("codigo") Long codigo) {
        return service.obterPorCodigo(codigo).map(cliente -> {
            service.deletar(codigo);
            return ResponseEntity.noContent().<Void>build(); // Retorna 204 No Content
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

